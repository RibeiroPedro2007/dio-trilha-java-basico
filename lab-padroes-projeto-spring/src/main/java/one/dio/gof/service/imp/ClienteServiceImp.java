package one.dio.gof.service.imp;

import one.dio.gof.model.Cliente;
import one.dio.gof.model.ClienteRepository;
import one.dio.gof.model.Endereco;
import one.dio.gof.model.EnderecoRepository;
import one.dio.gof.service.ClienteService;
import one.dio.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ClienteServiceImp implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos(){
        return clienteRepository.findAll();
    }
    @Override
    public Cliente buscarPorId(Long id){
        Optional<Cliente> cliente= clienteRepository.findById(id);
        return cliente.get();
    }
    @Override
    public void inserir(Cliente cliente) {
        enderecoRepository.findById(cliente.getEndereco().getCep()).orElseGet(()->{
            Endereco end =viaCepService.consultarCep(cliente.getEndereco().getCep());
            enderecoRepository.save(end);
            return end;});
        cliente.setEndereco(cliente.getEndereco());
        clienteRepository.save(cliente);
    }
    @Override
    public void atualizar(long id, Cliente cliente) {
        Optional<Cliente> clientebd= clienteRepository.findById(id);
        if(clientebd.isPresent()){
            inserir(cliente);
        }
    }
    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
}
