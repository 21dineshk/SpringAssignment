package com.ensemble.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ensemble.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject,Integer> {

}
