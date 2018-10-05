package uty.ivc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uty.ivc.model.UserPosition;

public interface PosJpaRepository extends JpaRepository<UserPosition, Long> {
}
