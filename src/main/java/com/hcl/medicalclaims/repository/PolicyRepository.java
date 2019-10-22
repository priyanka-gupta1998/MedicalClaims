package com.hcl.medicalclaims.repository;
/**
 * @author priyanka
 *
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.medicalclaims.entity.PolicyDetails;
@Repository
public interface PolicyRepository extends JpaRepository<PolicyDetails,Integer> {

}
