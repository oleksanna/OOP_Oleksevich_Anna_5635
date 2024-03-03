package DZ5.model;

public class Teacher extends User {
    private int teacherId;

    public Teacher(String firstName, String secondName, String lastName, int teacherId) {
        super(firstName, secondName, lastName); // Передаем ФИО преподавателя в конструктор суперкласса User
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                "} " + super.toString();
    }
}
