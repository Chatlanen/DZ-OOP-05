package service;

import data.Student;
import data.StudentGroup;
import data.Teacher;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.stream.Collectors;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public StudentGroupService createStudentGroup(Teacher teacher, List<Student> students) {
        this.studentGroup  = new StudentGroup(teacher, students);
        return this;
    }
    
    public List<Student> getSortedStudentGroup(){
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(students);
        return students;
    }

    public List<Integer> getGroupStudentsId(){
        List<Integer> idList = studentGroup.getStudents()
                .stream()
                .map(Student::getId)
                .collect(Collectors.toList());
        return  idList;
    }

    public Integer getGroupTeacherId(){
        return studentGroup.getTeacher().getId();
    }
   
}
