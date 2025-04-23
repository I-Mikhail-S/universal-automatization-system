package com.company.universalautomationsystem.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.NumberFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@JmixEntity
@Table(name = "POST")
@Entity
public class Post {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @InstanceName
    @Column(name = "NAME", nullable = false, length = 100)
    @NotNull
    private String name;

    @NumberFormat(pattern = "#,##0.00")
    @Column(name = "MIN_SALARY", nullable = false)
    @NotNull
    private Integer minSalary;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "post")
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Integer minSalary) {
        this.minSalary = minSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}