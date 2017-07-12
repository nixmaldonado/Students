package com.nixmaldonado.service;

import com.nixmaldonado.dao.StudentDao;
import com.nixmaldonado.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public class StudentService{

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id){
        return this.studentDao.getStudentById(id);
    }

    public void  removeStudentById(int id) {
        this.studentDao.removeStudentById(id);
    }

    public void updateStudent(Student student) {
        this.studentDao.updateStudent(student);
    }

    public void createStudent(Student student) {
        this.studentDao.createStudent(student);
    }
}