/**
 * 
 */
package com.hcl.medicalclaims.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.medicalclaims.entity.PolicyDetails;

/**
 * @author srinivas
 *
 */
@Repository
public interface PolicyDetailsRepository extends JpaRepository<PolicyDetails, Integer> {

	Optional<PolicyDetails> findByPolicyNo(Integer policyNo);

}
