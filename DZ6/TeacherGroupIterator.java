package DZ6;

import java.util.Iterator;
import java.util.List;

// Принцип единственной ответственности: класс TeacherGroupIterator отвечает за итерацию по списку учителей.
public class TeacherGroupIterator implements Iterator<Teacher> {
    private List<Teacher> teacherList; // Заменила static на private для улучшения инкапсуляции
    private int counter = 0;

    public TeacherGroupIterator(List<Teacher> teacherList) {
        this.teacherList = teacherList; // Инициализация списка учителей
    }

    @Override
    public boolean hasNext() {
        return counter < teacherList.size();
    }

    @Override
    public Teacher next() {
        if (!hasNext())
            return null;
        return teacherList.get(counter++);
    }

    @Override
    public void remove() {
        if (hasNext())
            teacherList.remove(--counter);
    }
}