package DZ6;

// Принцип единственной ответственности: класс Teacher отвечает только за хранение информации об учителе.
// Принцип открытости/закрытости: класс Teacher можно легко расширить, добавив новые поля или методы без изменения существующего кода.
public class Teacher extends User implements Comparable<Teacher>{
    private Integer teacherId;

    public Teacher(Integer teacherId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setStudentId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    // Принцип единственной ответственности: метод сравнения объектов типа Teacher.
    public int compareTo(Teacher o) {
        return teacherId.compareTo(o.teacherId);
    }
}




