package vn.techmaster.finalproject.controller.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.techmaster.finalproject.model.entity.Employer;
import vn.techmaster.finalproject.repository.EmployerRepo;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/employer")
public class EmployerController {
    @Autowired private EmployerRepo employerRepo;

    @GetMapping("")
    public ResponseEntity<List<Employer>> getAll() {
        return ResponseEntity.ok().body(employerRepo.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Employer> showEmployerDetailByID(@PathVariable String id) {
        return ResponseEntity.ok().body(employerRepo.findById(id).get());
    }

    @PostMapping(value = "/add")
    public ResponseEntity<Employer> addEmployer(@RequestBody Employer employer) {
        employer.setId(UUID.randomUUID().toString());
        employerRepo.save(employer);
        return ResponseEntity.ok().body(employer);
    }
}
