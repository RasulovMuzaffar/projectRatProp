package uty.ivc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uty.ivc.model.Department;
import uty.ivc.repository.DeptJpaRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptJpaRepository deptJpaRepository;

    @GetMapping(value = "/all")
    public List<Department> findAll() {
        return deptJpaRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Department> findK1ById(@PathVariable final Long id) {
        return deptJpaRepository.findById(id);
    }

    @GetMapping(value = "/load")
    public List<Department> load(@RequestBody final Department dept) {
        deptJpaRepository.save(dept);
        return deptJpaRepository.findAll();
    }
}
