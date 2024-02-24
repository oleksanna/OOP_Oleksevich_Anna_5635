package DZ3;

public class StreamComparator {
    public int compare(Stream stream1, Stream stream2) {
        int count1 = stream1.getGroups().size();
        int count2 = stream2.getGroups().size();
        return count1 - count2;
    }
}
