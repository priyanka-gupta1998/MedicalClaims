/**
 * @author priyanka
 */
package com.hcl.medicalclaims.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.medicalclaims.entity.ClaimDetails;


@Repository
public interface ClaimDetailsRepository extends JpaRepository<ClaimDetails, Integer> {



	//public Optional<List<ClaimDetails>> findByPolicyDetailsAndClaimStatus(PolicyDetails policyDetails);

	public Optional<List<ClaimDetails>> findByClaimStatus(String approvalStatus);

}
