package DZ3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stream stream1 = new Stream();
        stream1.addGroup("Group 1");
        stream1.addGroup("Group 2");

        Stream stream2 = new Stream();
        stream2.addGroup("Group 3");
        stream2.addGroup("Group 4");
        stream2.addGroup("Group 5");

        Stream stream3 = new Stream();
        stream3.addGroup("Group 6");

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        StreamService service = new StreamService();
        StreamComparator comparator = new StreamComparator();
        List<Stream> sortedStreams = service.sortStreams(streams, comparator);

        for (Stream stream : sortedStreams) {
            System.out.println("Groups in Stream: " + stream.getGroups().size());
            for (String group : stream) {
                System.out.println("- " + group);
            }
        }
    }
}