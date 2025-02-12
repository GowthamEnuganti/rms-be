package com.sentrifugo.performanceManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ProjectAllocation")
public class ProjectAllocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "ResAllocID")
    private Long resAllocId;

    @Column(name = "allocProcessId")
    private Long allocProcessId;

    @Column(name = "ProjectCode")
    private String projectCode;

    @Column(name = "startdate")
    private Date startDate;

    @Column(name = "enddate")
    private Date endDate;

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name = "UpdatedBy")
    private String updatedBy;

    @Column(name = "createddate")
    private Date createdDate;

    @Column(name = "updateddate")
    private Date updatedDate;

    @Column(name = "isactive")
    private boolean isActive;

    @Column(name = "billingStartDate")
    private Date billingStartDate;

    @Column(name = "billingEndDate")
    private Date billingEndDate;

}
