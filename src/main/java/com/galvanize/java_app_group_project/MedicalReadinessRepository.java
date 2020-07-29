package com.galvanize.java_app_group_project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalReadinessRepository extends JpaRepository<MedicalReadiness, Long> {
    
}