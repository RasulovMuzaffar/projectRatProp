package uty.ivc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import uty.ivc.model.PropUser;

import java.sql.Timestamp;
import java.util.List;

public interface PropUserJpaRepository extends JpaRepository<PropUser, Long> {
    //    @Query("SELECT pu FROM PropUser pu WHERE pu.user.firstname = :firstname or pu.user.firstname = :firstname")
//    public List<PropUser> getPropUsersByUserFirstNameOrUserLastName(@Param("firstname") String firstname, @Param("firstname") String lastname);
    List<PropUser> getPropUsersByUserFirstName(String firstname);

    List<PropUser> getPropUsersByUserLastNameOrUserFirstName(String lastname, String firstname);

    @Query(value = "SELECT * FROM prop_user as pu RIGHT OUTER JOIN spr_users as u ON pu.id_user = u.id " +
            "RIGHT OUTER JOIN proposal as p ON pu.id_prop = p.id " +
            "WHERE (LOWER(u.lastname) = ?1 or LOWER(u.firstname) = ?2) and p.date BETWEEN ?3 AND ?4", nativeQuery = true)
    List<PropUser> getPropUsersByLastNameOrFirstNameAndDateBetween(String lastname, String firstname, String fromDate, String toDate);

    @Query(value = "SELECT * FROM prop_user as pu RIGHT OUTER JOIN spr_users as u ON pu.id_user = u.id " +
            "RIGHT OUTER JOIN proposal as p ON pu.id_prop = p.id " +
            "WHERE p.date BETWEEN ?1 AND ?2", nativeQuery = true)
    List<PropUser> getAllByPropUserBetweenDate(String fromDate, String toDate);

}
