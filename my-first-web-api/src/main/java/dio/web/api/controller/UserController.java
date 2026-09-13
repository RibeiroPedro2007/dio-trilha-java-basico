package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repositorys.UserRepositorys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepositorys repositorys;

    @PostMapping("/users")
    public void post(@RequestBody Usuario usuario){
        repositorys.save(usuario);
    }
    @PutMapping("/users")
    public void put(@RequestBody Usuario usuario){
        repositorys.update(usuario);
    }

    @GetMapping("/users")
    List<Usuario> getUsers(){
        return repositorys.listAll();
    }

    @GetMapping("/users/{id}")
    public Usuario getOne(@PathVariable("id") Integer id){
        return repositorys.finById(id);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id") Integer id){
        repositorys.remove(id);
    }
}
