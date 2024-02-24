package DZ3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<String> {
    private List<String> groups;

    public Stream() {
        groups = new ArrayList<>();
    }

    public void addGroup(String group) {
        groups.add(group);
    }

    public List<String> getGroups() {
        return groups;
    }

    @Override
    public Iterator<String> iterator() {
        return groups.iterator();
    }
}
