package com.hcl.medicalclaims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.medicalclaims.entity.ApproverSummary;

@Repository
public interface ApproveSummaryRepository extends JpaRepository<ApproverSummary, Integer> {

}
