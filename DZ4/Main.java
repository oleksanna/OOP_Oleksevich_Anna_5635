package DZ4;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(5, "aab", "aab", "aab");
        Teacher teacher2 = new Teacher(2, "aaa", "aaa", "aaa");
        Teacher teacher3 = new Teacher(3, "Aaa", "Aaa", "Aaa");
        Teacher teacher4 = new Teacher(1, "bbb", "bbb", "bbb");
        Teacher teacher5 = new Teacher(4, "Bbb", "Bbb", "Bbb");
        List<Teacher> teacherList = new ArrayList<>();
        TeacherGroup teacherGroup = new TeacherGroup(teacherList);
        TeacherGroup.addTeacher(teacher1);
        TeacherGroup.addTeacher(teacher2);
        TeacherGroup.addTeacher(teacher3);
        TeacherGroup.addTeacher(teacher4);
        TeacherGroup.addTeacher(teacher5);

        TeacherGroupService service = new TeacherGroupService(teacherGroup);
        UserView<Teacher> view = new TeacherView();
        view.sendOnConsole(service.getSortedStudentGroupByFSL());
    }
}