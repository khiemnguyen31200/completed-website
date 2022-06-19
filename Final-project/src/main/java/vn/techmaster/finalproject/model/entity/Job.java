package vn.techmaster.finalproject.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    @Id
    private String id;
    private String title;
    private String description;
    private String salary;

    @Embedded
    private Time time;

    @Enumerated
    private City city;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @OneToMany(mappedBy = "job",cascade = CascadeType.ALL)
    private List<Applicant> applicants = new ArrayList<>();

    @OneToMany(mappedBy = "job",cascade = CascadeType.ALL)
    private List<JobFilter> jobFilters = new ArrayList<>();
}
