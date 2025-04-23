package com.company.universalautomationsystem.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@JmixEntity
@Table(name = "LEGAL_CLIENT", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_LEGAL_CLIENT_UNQ_INN", columnNames = {"INN"}),
        @UniqueConstraint(name = "IDX_LEGAL_CLIENT_UNQ", columnNames = {"MSRN"})
})
@Entity
public class LegalClient extends Client {
    @Column(name = "INN", nullable = false, length = 10)
    @NotNull
    private String inn;

    @Column(name = "MSRN", nullable = false, length = 13)
    @NotNull
    private String msrn;

    @Column(name = "LEGAL_ADDRESS", nullable = false, length = 100)
    @NotNull
    private String legalAddress;

    public String getLegalAddress() {
        return legalAddress;
    }

    public void setLegalAddress(String legalAddress) {
        this.legalAddress = legalAddress;
    }

    public String getMsrn() {
        return msrn;
    }

    public void setMsrn(String msrn) {
        this.msrn = msrn;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }
}