package DZ4;

import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher>{
    static List<Teacher> teacherList;

    public TeacherGroup(List<Teacher> teacherList) {
        this.teacherList= teacherList;
    }
    public static void addTeacher(Teacher teacher){
        teacherList.add(teacher);
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this);
    }
}