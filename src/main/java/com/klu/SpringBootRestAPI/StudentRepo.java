package com.klu.SpringBootRestAPI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentModel, Integer> { 
@Query("SELECT s FROM StudentModel s WHERE s.id = ?1") 
public StudentModel getStudentById(Integer id); 
} 
