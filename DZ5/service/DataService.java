package DZ5.service;

import DZ5.model.Student;
import DZ5.model.TypeUser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataService {
    private Map<Integer, Student> students = new HashMap<>();
    private int nextStudentId = 1;

    public void create(String firstName, String secondName, String lastName, TypeUser type) {
        Student student = new Student(firstName, secondName, lastName, nextStudentId++);
        students.put(student.getStudentId(), student);
    }

    public List<Integer> getAllStudentIds() {
        return new ArrayList<>(students.keySet());
    }

    public Student getStudentById(int studentId) {
        return students.get(studentId);
    }

    public void createStudent(String firstName, String secondName, String lastName, int studentId) {
        Student student = new Student(firstName, secondName, lastName, studentId);
        students.put(studentId, student);
    }
}
