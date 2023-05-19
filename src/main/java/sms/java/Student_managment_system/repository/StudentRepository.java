package sms.java.Student_managment_system.repository;

import org.springframework.data.jpa.repository.JpaRepository; //import org.springframework.data.jpa.repository.JpaRepository;
import sms.java.Student_managment_system.entity.Student;
//why we are not annotating with @Repository ? ANS=JpaRepository->simpleJpaRepository-> this class already annotated with @Repository
public interface StudentRepository extends JpaRepository<Student,Long> {


}
