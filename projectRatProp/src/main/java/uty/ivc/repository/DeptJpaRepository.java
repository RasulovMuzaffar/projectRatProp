package uty.ivc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uty.ivc.model.Department;

public interface DeptJpaRepository extends JpaRepository<Department, Long> {
}
