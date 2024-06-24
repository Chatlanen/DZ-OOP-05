package data;
import java.time.LocalDate;

public class Student extends User implements Comparable<Student>{

    public Student(int id, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(id, firstName, secondName, patronymic, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Student{" +
               "studentId='" + getId() +'\'' +
               ", firstName='" + super.getFirstName() + '\'' +
               ", secondName='" + super.getSecondName() + '\'' +
               ", patronymic='" + super.getPatronymic() + '\'' +
               ", dateOfBirth=" + super.getDateOfBirth() +
               "}\n";
    }

    @Override
    public int compareTo(Student o) {
        return getId() - o.getId();
    }
}
