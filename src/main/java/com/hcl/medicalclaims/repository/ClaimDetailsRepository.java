/**
 * 
 */
package com.hcl.medicalclaims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.medicalclaims.entity.ClaimDetails;

/**
 * @author User1
 *
 */
@Repository
public interface ClaimDetailsRepository extends JpaRepository<ClaimDetails, Integer>{

}
