package com.example.gruz2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class GruzStatistic {
    private Long count; // ID
    private LocalDate date_in;

    public GruzStatistic(Long count, LocalDate date_in) {
        this.count = count;
        this.date_in = date_in;
    }


    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Id
    public LocalDate getDate_in() {
        return date_in;
    }

    public void setDate_in(LocalDate date_in) {
        this.date_in = date_in;
    }
}