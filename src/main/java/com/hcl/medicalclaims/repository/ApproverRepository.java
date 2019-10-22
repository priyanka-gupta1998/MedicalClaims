package com.hcl.medicalclaims.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.medicalclaims.entity.ApproverDetails;

@Repository
public interface ApproverRepository extends JpaRepository<ApproverDetails, Integer> {

	public Optional<ApproverDetails> findByapproverId(Integer approverId);
}
