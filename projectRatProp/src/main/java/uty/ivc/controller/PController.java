package uty.ivc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uty.ivc.model.P;
import uty.ivc.repository.PJpaRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("p")
public class PController {
    @Autowired
    private PJpaRepository pJpaRepository;

    @GetMapping(value = "/all")
    public List<P> findAll() {
        return pJpaRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<P> findK1ById(@PathVariable final Long id) {
        return pJpaRepository.findById(id);
    }
}
