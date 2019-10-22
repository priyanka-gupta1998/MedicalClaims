package com.hcl.medicalclaims.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.medicalclaims.entity.ClaimDetails;
import com.hcl.medicalclaims.entity.PolicyDetails;

@Repository
public interface ClaimRepository extends JpaRepository<ClaimDetails, Integer> {

	public Optional<ClaimDetails> findByPolicyDetails(PolicyDetails policyDetails);
	
	public Optional<ClaimDetails> findByclaimId(Integer claimId);
	
}
