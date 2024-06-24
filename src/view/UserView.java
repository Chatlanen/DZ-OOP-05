package view;

import data.Student;
import data.StudentGroup;
import data.User;

import java.util.List;

public class UserView {



    public void sendOnConsole(List<User> userList){
        for(User user: userList){
            System.out.println(user.toString());
        }
    }

    public void sendOnConsoleInt(Integer mint){
        System.out.println(mint);
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        System.out.println(studentGroup.toString());
    }

    public void sendOnConsoleListStudent(List<Student> students){
        System.out.println(students.toString());
    }

    public void sendOnConsoleListId(List<Integer> ids){
        System.out.println(ids);
    }

}
