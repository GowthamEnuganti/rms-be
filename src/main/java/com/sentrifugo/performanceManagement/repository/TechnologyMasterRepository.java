package com.sentrifugo.performanceManagement.repository;

import com.sentrifugo.performanceManagement.entity.TechnologyMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TechnologyMasterRepository extends JpaRepository<TechnologyMaster, Integer> {

//    @Query("Select distinct techGroup from TechnologyMaster")
//    List<String> getDistinctGroups();
@Query("SELECT tm.techId FROM TechnologyMaster tm")
List<Integer> findAllTechId();
    @Query("select distinct tm.techGroup from TechnologyMaster tm")
    List<String> getDistinctGroups();
    @Query("select distinct tm.techSkill from TechnologyMaster tm")
    List<String> getDistinctSkills();

}
