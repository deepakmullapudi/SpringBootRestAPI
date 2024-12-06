package com.klu.SpringBootRestAPI;

import java.util.List;

public interface StudentService { 
public void insertStudent(StudentModel student); 
public List<StudentModel> getAll(); 
public void updateStudent(Integer id,StudentModel updatedBody); 
public void deleteStudent(Integer id); 
}