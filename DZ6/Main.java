package DZ6;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


// Принцип единственной ответственности: класс Main отвечает только за запуск приложения.
public class Main {
    public static void main(String[] args) {
        // Создание объектов Teacher для демонстрации работы программы
        Teacher teacher1 = new Teacher(5, "aab", "aab", "aab");
        Teacher teacher2 = new Teacher(2, "aaa", "aaa", "aaa");
        Teacher teacher3 = new Teacher(3, "Aaa", "Aaa", "Aaa");
        Teacher teacher4 = new Teacher(1, "bbb", "bbb", "bbb");
        Teacher teacher5 = new Teacher(4, "Bbb", "Bbb", "Bbb");
        
        // Создание списка учителей и добавление учителей в группу
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);
        teacherList.add(teacher5);

        // Создание объекта TeacherGroup и передача списка учителей
        TeacherGroup teacherGroup = new TeacherGroup(teacherList);

        // Создание объекта TeacherGroupService и передача группы учителей
        TeacherGroupService service = new TeacherGroupService(teacherGroup);

        // Создание объекта TeacherView и передача данных о группе учителей
        UserView<Teacher> view = new TeacherView();

        // Отправка данных на консоль
        view.sendOnConsole(service.getSortedStudentGroupByFSL());
    }
}