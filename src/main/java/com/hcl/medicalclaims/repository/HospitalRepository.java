/**
 * 
 */
package com.hcl.medicalclaims.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.medicalclaims.entity.Hospital;

/**
 * @author srinivas
 *
 */
@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

	Optional<Hospital> findByHospitalName(String hospitalName);

}
