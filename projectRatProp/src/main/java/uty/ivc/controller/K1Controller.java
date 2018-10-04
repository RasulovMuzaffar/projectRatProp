package uty.ivc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uty.ivc.model.K1;
import uty.ivc.repository.K1JpaRepository;

import java.util.List;

@RestController
@RequestMapping("/k1")
public class K1Controller {
    @Autowired
    private K1JpaRepository k1JpaRepository;


    @GetMapping(value = "/all")
    public List<K1> findAll() {
        return k1JpaRepository.findAll();
    }

}
