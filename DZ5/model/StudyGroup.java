package DZ5.model;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Преподаватель: ").append(teacher).append("\n");
        stringBuilder.append("Студенты:\n");
        for (Student student : students) {
            stringBuilder.append(student).append("\n");
        }
        return stringBuilder.toString();
    }
}
