package uty.ivc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import uty.ivc.model.Users;

@Component
public interface UserJpaRepository extends JpaRepository<Users, Long> {

    Users findUsersByLastNameOrFirstName(String lastname, String firstname);
}
