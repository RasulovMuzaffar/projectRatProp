package uty.ivc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uty.ivc.model.UserPosition;
import uty.ivc.repository.PosJpaRepository;

import java.util.List;

@RestController
@RequestMapping("pos")
public class PositionController {

    @Autowired
    private PosJpaRepository posJpaRepository;

    @GetMapping(value = "/all")
    public List<UserPosition> findAll() {
        return posJpaRepository.findAll();
    }
}
