package sms.java.Student_managment_system.service;

import java.util.List;

import sms.java.Student_managment_system.entity.Student;


public interface StudentService {
   List<Student> getAllStudents();

   Student saveStudent(Student student);

   Student getStudentById(Long id);

   Student updateStudent(Student student);

   void deleteStudentById(Long id);
}


