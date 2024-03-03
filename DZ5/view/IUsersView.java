package DZ5.view;

import DZ5.model.User;

import java.util.List;

public interface IUsersView<T extends User>{
    public void PrintOnConsole(T user);
    public void PrintOnConsoleArr(List<T> users);
}
