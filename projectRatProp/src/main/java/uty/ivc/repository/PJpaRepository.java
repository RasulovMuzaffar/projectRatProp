package uty.ivc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uty.ivc.model.P;

public interface PJpaRepository extends JpaRepository<P,Long> {
}
