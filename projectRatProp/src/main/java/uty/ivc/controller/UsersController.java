package uty.ivc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uty.ivc.model.Users;
import uty.ivc.repository.UserJpaRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserJpaRepository userJpaRepository;

    @GetMapping(value = "/all")
    public List<Users> findAll() {
        System.out.println("pppp");
        return userJpaRepository.findAll();
    }

    @GetMapping("/qwe")
    public Users findUserByLastNameOrFirstName(@RequestParam(value = "lastname") String  lastname,
                                                         @RequestParam(value = "firstname") String  firstname) {
        return userJpaRepository.findUsersByLastNameOrFirstName(lastname, firstname);
    }

//    @GET
//    @Path("/getLongLocWagsByType")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<LongLocWagsByType> getAllLongLocWagsInRoadByType(@QueryParam("idrju") int idrju,
//                                                                 @QueryParam("idown") int idown,
//                                                                 @QueryParam("range_min") int range_min,
//                                                                 @QueryParam("range_max") int range_max) {
//        return null;
//    }


}
