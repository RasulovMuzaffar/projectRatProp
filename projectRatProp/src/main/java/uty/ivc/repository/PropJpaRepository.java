package uty.ivc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import uty.ivc.model.Proposal;

@Component
public interface PropJpaRepository extends JpaRepository<Proposal, Long> {
}
