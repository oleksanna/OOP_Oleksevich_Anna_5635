package DZ6;

import java.util.Iterator;
import java.util.List;

// Принцип единственной ответственности: класс TeacherGroup отвечает за хранение списка учителей и предоставляет интерфейс для работы с ними.
// Принцип инверсии зависимостей: класс TeacherGroup не зависит от конкретной реализации списка учителей, что обеспечивает гибкость 
// и переиспользуемость кода.
public class TeacherGroup implements Iterable<Teacher> {
    private List<Teacher> teacherList; // Заменила static на private для улучшения инкапсуляции

    public TeacherGroup(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    // Принцип единственной ответственности: метод добавления учителя отвечает только за добавление нового учителя в список.
    // Принцип инверсии зависимостей: метод добавления учителя не зависит от конкретной реализации списка учителей, что обеспечивает гибкость и
    // переиспользуемость кода.
    public void addTeacher(Teacher teacher) { // Убрала static для уменьшения связности и повышения гибкости
        teacherList.add(teacher);
    }

    @Override
    public Iterator<Teacher> iterator() {
        return teacherList.iterator();
    }
}