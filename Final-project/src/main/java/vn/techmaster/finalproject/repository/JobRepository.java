package vn.techmaster.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.techmaster.finalproject.model.entity.Job;

public interface JobRepository extends JpaRepository<Job,String> {
}
