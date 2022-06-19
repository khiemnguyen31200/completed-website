package vn.techmaster.finalproject;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import vn.techmaster.finalproject.model.entity.Admin;
import vn.techmaster.finalproject.model.entity.Applicant;
import vn.techmaster.finalproject.model.entity.Employer;
import vn.techmaster.finalproject.model.entity.File;
import vn.techmaster.finalproject.model.entity.Job;
import vn.techmaster.finalproject.model.entity.Skill;
import vn.techmaster.finalproject.model.entity.State;
import vn.techmaster.finalproject.model.entity.User;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.UUID;

@SpringBootApplication
@AllArgsConstructor
public class FinalProjectApplication implements CommandLineRunner {
    private EntityManager entityManager;
    public static void main(String[] args) {
        SpringApplication.run(FinalProjectApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        var employer1 = Employer.builder().user(User.builder().id(UUID.randomUUID().toString()).name("cmc").email("cmc@cmc.com").password("123456789").state(State.ACTIVE).build()).build();
        var applicant1 = Applicant.builder().user(User.builder().id(UUID.randomUUID().toString()).name("d").email("abc@gmail.com").password("password").build()).skill(Skill.CPLUS).build();
        var admin=Admin.builder().user(User.builder().id(UUID.randomUUID().toString()).name("main").email("admin@gmail.com").password("47775855555").build()).build();
        // var photo = File.builder().id(UUID.randomUUID().toString()).path("123456").employer(employer1).build();
        // var photo2 = File.builder().id(UUID.randomUUID().toString()).path("123456").employer(employer1).build();
        // var job = Job.builder().employer(employer1).id(UUID.randomUUID().toString()).title("123").build();

        entityManager.persist(employer1);
        entityManager.persist(applicant1);
        entityManager.persist(admin);
        // System.out.println((employer1.getId()));
        // entityManager.persist(photo);
        // entityManager.persist(photo2);
        // entityManager.persist(job);
        entityManager.flush();
    }
}
