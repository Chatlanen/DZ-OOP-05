package data;

import java.time.LocalDate;

public class Teacher extends User{

    public Teacher(Integer id, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(id, firstName, secondName, patronymic, dateOfBirth);
    }

    public int getTeacherId() {
        return getId();
    }

    public void setTeacherId(int id) {
        this.setId(id);
    }

    @Override
    public String toString() {
        return "Teacher {" +
               "id='" + getId() +'\'' +
               ", firstName='" + super.getFirstName() + '\'' +
               ", secondName='" + super.getSecondName() + '\'' +
               ", patronymic='" + super.getPatronymic() + '\'' +
               ", dateOfBirth=" + super.getDateOfBirth() +
               "}\n";
    }
}
