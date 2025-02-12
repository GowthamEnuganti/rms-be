package com.sentrifugo.performanceManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "domain_master")
public class DomainMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DomainId")
    private Integer domainId;

    @Column(name = "DomainName")
    private String domainName;

    @Column(name = "SubDomainId")
    private String subDomainId;

    @Column(name = "SubDomain")
    private String subDomain;

    @Column(name = "IndustryRelevant")
    private String IndustryRelevant;

    @Column(name = "DomainCode")
    private String domainCode;

}
