package one.dio.gof.service;

import one.dio.gof.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(long id, Cliente cliente);

    void deletar(Long id);
}
