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
@Table(name = "ResourceAllocProcess")
public class ResourceAllocProcess {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "SilId")
    private String silId;

    @Column(name = "ResAllocID")
    private Long resAllocId;

    @Column(name = "ProjectCode")
    private String projectCode;

    @Column(name = "ProcessStatus")
    private String processStatus;

    @Column(name = "SBstartdate")
    private Date SBstartDate;

    @Column(name = "SBenddate")
    private Date SBendDate;

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

    @Column(name = "allocStartDate")
    private Date allocStartDate;

    @Column(name = "allocEndDate")
    private Date allocEndDate;

    @Column(name = "feedback")
    private String feedback;

    @Column(name = "RmReadStatus")
    private Boolean RmReadStatus;

    @Column(name = "projectId")
    private long projectId;

    @Column(name = "PmReadStatus")
    private Boolean PmReadStatus;

    @Column(name = "PmoReadStatus")
    private Boolean PMOReadStatus;

    @Column(name = "RequirementID")
    private String requirementID;

    @Column(name = "DeAllocReason")
    private String deAllocReason;

    @Column(name = "Billability")
    private String billability;

    @Column(name = "extendedDate")
    private Date extendedDate;

    @Column(name = "billingStartDate")
    private Date billingStartDate;

    @Column(name = "billingEndDate")
    private Date billingEndDate;


}
