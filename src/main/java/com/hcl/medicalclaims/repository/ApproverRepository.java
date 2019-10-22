package com.hcl.medicalclaims.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hcl.medicalclaims.entity.ApproverDetails;
/* 
*@author priyanka
*/

@Repository
public interface ApproverRepository extends JpaRepository<ApproverDetails, Integer> {

	Optional<ApproverDetails> findByMailIdAndPassword(String mailId, String password);

}
