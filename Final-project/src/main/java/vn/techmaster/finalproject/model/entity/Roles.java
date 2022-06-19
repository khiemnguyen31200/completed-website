package vn.techmaster.finalproject.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Roles {
    @Id
    private String id;

    @Enumerated
    private RoleEnum nameRole;


    @OneToMany(mappedBy = "roles",cascade = CascadeType.ALL)
    private List<Admin> admins = new ArrayList<>();

    @OneToMany(mappedBy = "roles",cascade = CascadeType.ALL)
    private List<Employer> employers = new ArrayList<>();

    @OneToMany(mappedBy = "roles",cascade = CascadeType.ALL)
    private List<Applicant> applicants = new ArrayList<>();




}
