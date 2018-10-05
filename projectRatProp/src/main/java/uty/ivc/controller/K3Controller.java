package uty.ivc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uty.ivc.model.K3;
import uty.ivc.repository.K3JpaRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/k3")
public class K3Controller {
    @Autowired
    private K3JpaRepository k3JpaRepository;


    @GetMapping(value = "/all")
    public List<K3> findAll() {
        return k3JpaRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<K3> findK1ById(@PathVariable final Long id) {
        return k3JpaRepository.findById(id);
    }

    @GetMapping(value = "/load")
    public List<K3> load(@RequestBody final K3 k3) {
        k3JpaRepository.save(k3);
        return k3JpaRepository.findAll();
    }
}
