package uty.ivc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uty.ivc.model.Roles;

public interface RolesJpaRepository extends JpaRepository<Roles, Long> {
}
