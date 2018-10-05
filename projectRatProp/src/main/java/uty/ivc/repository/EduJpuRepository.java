package uty.ivc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uty.ivc.model.UserEducation;

public interface EduJpuRepository extends JpaRepository<UserEducation, Long> {
}
