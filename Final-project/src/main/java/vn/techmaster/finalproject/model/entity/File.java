package vn.techmaster.finalproject.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class File {
    @Id
    private String id;
    private String path;


    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

}
