package uty.ivc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uty.ivc.model.Roles;
import uty.ivc.repository.RolesJpaRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("roles")
public class RolesController {
    private RolesJpaRepository rolesJpaRepository;

    @GetMapping(value = "/all")
    public List<Roles> findAll() {
        return rolesJpaRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Roles> findById(@RequestParam final Long id){
        return rolesJpaRepository.findById(id);
    }
}
