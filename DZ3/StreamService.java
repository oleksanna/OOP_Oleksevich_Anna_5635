package DZ3;

import java.util.Collections;
import java.util.List;

public class StreamService {
    public List<Stream> sortStreams(List<Stream> streams, StreamComparator comparator) {
        Collections.sort(streams, (s1, s2) -> comparator.compare(s1, s2));
        return streams;
    }
}
