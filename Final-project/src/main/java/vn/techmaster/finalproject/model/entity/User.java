package vn.techmaster.finalproject.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {
    @Id
    private String id;

    @NotBlank
    private String name;
    private String logo_path;
    private String cv_path;

    @NaturalId
    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Size(min = 8,max = 20)
    private String password;

    @Embedded
    private Time time;

    @Enumerated
    private State state;

    @Enumerated
    private RoleEnum role;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @PrimaryKeyJoinColumn
    private Admin admin;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<File> photos = new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<File> resumes = new ArrayList<>();

    
}
