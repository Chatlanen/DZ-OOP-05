
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import controller.UserController;
import data.Student;
import data.Teacher;

public class App {
    private static void Initusers(List<Student> students, List<Teacher> teachers) {

        students.add(new Student(1,"Роберт", "Колесников", "Станиславович", LocalDate.parse("2010-12-19")));
        students.add(new Student(2,"Роман", "Гусев", "Платонович", LocalDate.parse("2009-04-08")));
        students.add(new Student(3,"Ростислав", "Лаврентьев", "Митрофанович", LocalDate.parse("2007-01-11")));
        students.add(new Student(4,"Гавриил", "Уваров", "Филиппович", LocalDate.parse("2005-05-14")));
        students.add(new Student(5, "Пантелеймон", "Шестаков", "Антонинович", LocalDate.parse("2005-12-18")));
        students.add(new Student(6, "Кассиан", "Кондратьев", "Митрофанович", LocalDate.parse("2001-02-01")));
        students.add(new Student(7, "Варлаам", "Беспалов", "Денисович", LocalDate.parse("2006-02-27")));
        students.add(new Student(21,"Илья", "Жуков", "Александрович", LocalDate.parse("2002-07-05")));
        students.add(new Student(20,"Касьян", "Степанов", "Вячеславович", LocalDate.parse("2001-04-22")));
        students.add(new Student(19,"Юстин", "Горшков", "Улебович", LocalDate.parse("2006-07-15")));
        students.add(new Student(18,"Абрам", "Васильев", "Романович", LocalDate.parse("2010-08-29")));
        students.add(new Student(18,"Аристарх", "Рожков", "Агафонович", LocalDate.parse("2008-04-08")));
        students.add(new Student(17,"Даниил", "Маслов", "Филиппович", LocalDate.parse("2008-09-24")));
        students.add(new Student(16,"Давид", "Абрамов", "Валентинович", LocalDate.parse("2004-10-29")));
        students.add(new Student(15,"Савелий", "Кудряшов", "Данилович", LocalDate.parse("2005-11-25")));
        students.add(new Student(14,"Любомир", "Рыбаков", "Эдуардович", LocalDate.parse("2010-08-10")));
        students.add(new Student(13,"Всеволод", "Мамонтов", "Владленович", LocalDate.parse("2009-10-03")));
        students.add(new Student(12,"Тимур", "Волков", "Онисимович", LocalDate.parse("2007-10-26")));
        students.add(new Student(11,"Устин", "Калинин", "Всеволодович", LocalDate.parse("2000-08-04")));
        students.add(new Student(11,"Роман", "Рыбаков", "Федорович", LocalDate.parse("2004-04-29")));
        students.add(new Student(10,"Родион", "Зыков", "Константинович", LocalDate.parse("1999-03-06")));

        teachers.add(new Teacher(4,"Вольдемар", "Борисов", "Евгеньевич", LocalDate.parse("1997-07-18")));
        teachers.add(new Teacher(3,"Соломон", "Котов", "Агафонович", LocalDate.parse("1997-07-22")));
        teachers.add(new Teacher(2,"Архип", "Кулаков", "Валерьевич", LocalDate.parse("1997-06-27")));
        teachers.add(new Teacher(1,"Соломон", "Никифоров", "Мэлсович", LocalDate.parse("1998-10-26")));
    }

    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        Initusers(students, teachers);
        

        /**
         * формирование групп студентов
         */

         UserController myUC = new UserController(teachers.get(0), students.subList(6, 15));
         myUC.getGroupStudentsId();
         myUC.getGroupTecherId();
    }
}
