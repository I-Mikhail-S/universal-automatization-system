package com.company.universalautomationsystem.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@JmixEntity
@Table(name = "NATURAL_CLIENT")
@Entity
public class NaturalClient extends Client {
    @Column(name = "DATE_OF_BIRTH")
    private LocalDate dateOfBirth;

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}