package uty.ivc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uty.ivc.model.K2;
import uty.ivc.repository.K2JpaRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/k2")
public class K2Controller {
    @Autowired
    private K2JpaRepository k2JpaRepository;


    @GetMapping(value = "/all")
    public List<K2> findAll() {
        return k2JpaRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<K2> findK1ById(@PathVariable final Long id) {
        return k2JpaRepository.findById(id);
    }

    @GetMapping(value = "/load")
    public List<K2> load(@RequestBody final K2 k2) {
        k2JpaRepository.save(k2);
        return k2JpaRepository.findAll();
    }
}
