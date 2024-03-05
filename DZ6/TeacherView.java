package DZ6;

import java.util.List;

// Принцип единственной ответственности: класс TeacherView отвечает за отображение учителей в консоль.
public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(Iterable<Teacher> iterable) { // Метод принимает Iterable для увеличения гибкости
        for (Teacher teacher : iterable) { // Используем цикл для итерации по элементам
            System.out.println(teacher);
        }
    }
}