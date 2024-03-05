package DZ6;

import java.util.Comparator;

// Принцип единственной ответственности: класс UserComparator отвечает за сравнение пользователей.
public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        // Сравнение пользователей по фамилии, имени и отчеству
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0){
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return resultOfComparing;
            }
        }else {
            return resultOfComparing;
        }
    }
}
