package vn.techmaster.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.techmaster.finalproject.model.entity.Applicant;

public interface ApplicantRepo extends JpaRepository<Applicant,String> {
}
