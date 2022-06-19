package vn.techmaster.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.techmaster.finalproject.model.entity.Employer;

@Repository
public interface EmployerRepo extends JpaRepository<Employer,String> {
}
