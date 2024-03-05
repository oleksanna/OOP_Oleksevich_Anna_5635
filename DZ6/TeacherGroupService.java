package DZ6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Принцип единственной ответственности: класс TeacherGroupService отвечает за обработку операций над группой учителей.
// Принцип инверсии зависимостей: класс TeacherGroupService зависит от абстракции TeacherGroup, а не от конкретной реализации, 
// что обеспечивает гибкость и переиспользуемость кода.
public class TeacherGroupService {
    private TeacherGroup teacherGroup; // Изменила модификатор доступа на private для улучшения инкапсуляции

    public TeacherGroupService(TeacherGroup teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

    // Принцип единственной ответственности: метод getSortedTeacherGroup отвечает только за сортировку группы учителей.
    // Принцип инверсии зависимостей: метод getSortedTeacherGroup не зависит от конкретной реализации списка учителей, 
    // что обеспечивает гибкость и переиспользуемость кода.
    public List<Teacher> getSortedTeacherGroup() {
        List<Teacher> teacherList = new ArrayList<>();
        for (Teacher teacher : teacherGroup) { // Получение доступа к элементам TeacherGroup с помощью итератора
            teacherList.add(teacher);
        }
        Collections.sort(teacherList);
        return teacherList;
    }

    // Принцип единственной ответственности: метод getSortedStudentGroupByFSL отвечает только за сортировку группы учителей по ФИО.
    // Принцип инверсии зависимостей: метод getSortedStudentGroupByFSL не зависит от конкретной реализации списка учителей, 
    // что обеспечивает гибкость и переиспользуемость кода.
    public List<Teacher> getSortedStudentGroupByFSL() {
        List<Teacher> teacherList = new ArrayList<>();
        for (Teacher teacher : teacherGroup) { // Получение доступа к элементам TeacherGroup с помощью итератора
            teacherList.add(teacher);
        }
        teacherList.sort(new UserComparator<Teacher>()); // Сортировка списка учителей по ФИО
        return teacherList;
    }
}