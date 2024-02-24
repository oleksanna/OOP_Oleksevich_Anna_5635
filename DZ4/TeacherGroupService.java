package DZ4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherGroupService {
    TeacherGroup teacherGroup;

    public TeacherGroupService(TeacherGroup teacherGroup) {
        this.teacherGroup = teacherGroup;
    }
    public List<Teacher> getSortedTeacherGroup(){
        List<Teacher> teacherList = new ArrayList<>(TeacherGroup.teacherList);
        Collections.sort(teacherList);
        return teacherList;
    }

    public List<Teacher> getSortedStudentGroupByFSL(){
        TeacherGroup.teacherList.sort(new UserComparator<Teacher>());
        return TeacherGroup.teacherList;
    }
}

