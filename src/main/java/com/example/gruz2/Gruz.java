package com.example.gruz2;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;
import java.time.LocalDate;


@Entity
public class Gruz {
    private Long id; // ID
    private String name; // Имя
    private String cargo_contents;
    private String city_out;
    private LocalDate date_out;
    private String city_in;
    private LocalDate date_in;

    protected Gruz() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCargo_contents() {
        return cargo_contents;
    }

    public void setCargo_contents(String cargo_contents) {
        this.cargo_contents = cargo_contents;
    }

    public String getCity_out() {
        return city_out;
    }

    public void setCity_out(String city_out) {
        this.city_out = city_out;
    }

    public LocalDate getDate_out() {
        return date_out;
    }

    public void setDate_out(LocalDate date_out) {
        this.date_out = date_out;
    }

    public String getCity_in() {
        return city_in;
    }

    public void setCity_in(String city_in) {
        this.city_in = city_in;
    }

    public LocalDate getDate_in() {
        return date_in;
    }

    public void setDate_in(LocalDate date_in) {
        this.date_in = date_in;
    }
}
