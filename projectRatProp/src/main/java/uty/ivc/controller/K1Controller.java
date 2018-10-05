package uty.ivc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uty.ivc.model.K1;
import uty.ivc.repository.K1JpaRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/k1")
public class K1Controller {
    @Autowired
    private K1JpaRepository k1JpaRepository;


    @GetMapping(value = "/all")
    public List<K1> findAll() {
        return k1JpaRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<K1> findK1ById(@PathVariable final Long id) {
        return k1JpaRepository.findById(id);
    }

    @GetMapping(value = "/load")
    public List<K1> load(@RequestBody final K1 k1) {
        k1JpaRepository.save(k1);
        return k1JpaRepository.findAll();
    }
}
