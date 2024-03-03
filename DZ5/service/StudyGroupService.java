package DZ5.service;

import DZ5.model.Student;
import DZ5.model.Teacher;
import DZ5.model.StudyGroup;

import java.util.List;

public class StudyGroupService {

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}
