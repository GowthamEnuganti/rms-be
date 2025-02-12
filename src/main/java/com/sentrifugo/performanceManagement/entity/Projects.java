package com.sentrifugo.performanceManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "project_data")
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ClientCode")
    private String clientCode;

    @Column(name = "projectStatus")
    private String projectStatus;

    @Column(name = "ProjectCode")
    private String projectCode;

    @Column(name = "DomainId")
    private Integer domainId;

    @Column(name = "Duration")
    private Double duration;

    @Column(name = "DeliveryManager")
    private String deliveryManager;

    @Column(name = "DomainName")
    private String domainName;

    @Column(name = "ProjectEndDate")
    private Date projectEndDate;

    @Column(name = "ProjectManager")
    private String projectManager;

    @Column(name = "ProjectName")
    private String projectName;

    @Column(name = "ProjectObjective" )
    private String projectObjective;

    @Column(name = "ProjectStar")
    private Integer projectStar;

    @Column(name = "ProjectStartDate")
    private Date projectStartDate;

    @Column(name = "sizeOfProjectHrs")
    private Double sizeOfProjectHrs;

    @Column(name = "sowstartdate")
    private Date sowStartDate;

    @Column(name = "sowenddate")
    private Date sowEndDate;

    @Column(name = "TypeOfProject")
    private String typeOfProject;

    @Column(name = "SOW")
    private String sow;

    @Column(name = "ClientName")
    private String clientName;

    @Column(name = "SowName")
    private String sowName;


}