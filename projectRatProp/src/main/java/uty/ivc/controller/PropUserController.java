package uty.ivc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uty.ivc.model.PropUser;
import uty.ivc.model.Users;
import uty.ivc.repository.PropUserJpaRepository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("propuser")
public class PropUserController {
    @Autowired
    private PropUserJpaRepository propUserJpaRepository;

    @GetMapping(value = "/all")
    public List<PropUser> findAll() {
        return propUserJpaRepository.findAll();
    }

    @GetMapping("/findUserByLastNameOrFirstName")
    public List<PropUser> findUserByLastNameOrFirstName(@RequestParam(value = "lastname") String lastname,
                                                        @RequestParam(value = "firstname") String firstname) {
        List<PropUser> pu = propUserJpaRepository.getPropUsersByUserLastNameOrUserFirstName(lastname, firstname);
        return pu;
    }

    @GetMapping("/findUserByLastNameOrFirstNameOrBtwnDate")
    public List<PropUser> findUserByLastNameOrFirstNameOrBtwnDate(@RequestParam(value = "lastname") String lastname,
                                                                  @RequestParam(value = "firstname") String firstname,
                                                                  @RequestParam(value = "fromDate") String fromDate,
                                                                  @RequestParam(value = "toDate") String toDate) {



        if (lastname.isEmpty() && firstname.isEmpty()) {
            return propUserJpaRepository.getAllByPropUserBetweenDate(fromDate, toDate);
        } else {
            return propUserJpaRepository.getPropUsersByLastNameOrFirstNameAndDateBetween(lastname.toLowerCase(), firstname.toLowerCase(), fromDate, toDate);
        }
    }

}
