package uty.ivc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uty.ivc.model.P;
import uty.ivc.repository.PJpaRepository;

import java.sql.Timestamp;
import java.util.Date;
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

    @GetMapping(value = "/load")
    public List<P> load(@RequestParam(value = "mrzp") final Double mrzp) {
        P p = new P();
        p.setValue(mrzp);
        p.setDate(new Timestamp(new Date().getTime()));
//        System.out.println(p.getValue());
//        System.out.println(p.getDate());
        pJpaRepository.save(p);
        return pJpaRepository.findAll();
    }
}
