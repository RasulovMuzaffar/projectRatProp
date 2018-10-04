package uty.ivc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uty.ivc.model.Proposal;
import uty.ivc.repository.PropJpaRepository;

import java.util.List;

@RestController
@RequestMapping("/props")
public class PropController {
    @Autowired
    private PropJpaRepository propJpaRepository;

    @GetMapping(value = "/all")
    public List<Proposal> findAll() {
        return propJpaRepository.findAll();
    }
}
