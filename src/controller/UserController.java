package controller;

import data.Student;
import data.Teacher;
import service.StudentGroupService;
import view.UserView;


import java.util.List;

public class UserController {

    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final UserView userView = new UserView();

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
    }
    public UserController(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
    }

    public void getGroupStudentsId(){
        List<Integer> list = studentGroupService.getGroupStudentsId();
        userView.sendOnConsoleListId(list);
       // return list;
    }

    public Integer getGroupTecherId(){
        Integer teacherid = studentGroupService.getGroupTeacherId();
        userView.sendOnConsoleInt(teacherid);
        return teacherid;
    }
    
}
