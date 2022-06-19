package vn.techmaster.finalproject.model.entity;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class Time {
    private LocalDateTime timeCreate;
    private LocalDateTime timeUpdate;
}
