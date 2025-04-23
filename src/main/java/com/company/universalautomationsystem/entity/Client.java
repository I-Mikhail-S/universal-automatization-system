package com.company.universalautomationsystem.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.annotation.DeletedBy;
import io.jmix.core.annotation.DeletedDate;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "CLIENT", indexes = {
        @Index(name = "IDX_CLIENT_UNQ_BANC_RECUISITES", columnList = "BANK_REQUISITES")
}, uniqueConstraints = {
        @UniqueConstraint(name = "IDX_CLIENT_UNQ_NAME", columnNames = {"NAME"}),
        @UniqueConstraint(name = "IDX_CLIENT_UNQ_EMAIL", columnNames = {"EMAIL"}),
        @UniqueConstraint(name = "IDX_CLIENT_UNQ_PHONE", columnNames = {"PHONE"})
})
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Client {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME", nullable = false, length = 100)
    @NotNull
    private String name;

    @Column(name = "EMAIL", nullable = false, length = 50)
    @NotNull
    @Email
    private String email;

    @Column(name = "PHONE", nullable = false, length = 13)
    @NotNull
    private String phone;

    @Column(name = "BANK_REQUISITES", nullable = false, length = 20)
    @NotNull
    private String bankRequisites;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @OrderBy("name, dateCreate, dateStart, dateEnd, employee")
    @OneToMany(mappedBy = "client")
    private List<Order> order;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @CreatedBy
    @Column(name = "CREATED_BY")
    private String createdBy;

    @CreatedDate
    @Column(name = "CREATED_DATE")
    private OffsetDateTime createdDate;

    @LastModifiedBy
    @Column(name = "LAST_MODIFIED_BY")
    private String lastModifiedBy;

    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    private OffsetDateTime lastModifiedDate;

    @DeletedBy
    @Column(name = "DELETED_BY")
    private String deletedBy;

    @DeletedDate
    @Column(name = "DELETED_DATE")
    private OffsetDateTime deletedDate;

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public String getBankRequisites() {
        return bankRequisites;
    }

    public void setBankRequisites(String bankRequisites) {
        this.bankRequisites = bankRequisites;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OffsetDateTime getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(OffsetDateTime deletedDate) {
        this.deletedDate = deletedDate;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public OffsetDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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