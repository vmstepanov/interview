package i.stream.source;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class Dec {
    public static void main(String[] args) {
        List<List<String>> source = asList(asList("Mac", "Win", "Linux"), asList("C", "Java"), asList("11", "14"));
        // MacC11 MacC14 MacJava11 MacJava14 WinC11 WinC14 WinJava11 WinJava14 LinuxC11 LinuxC14 LinuxJava11 LinuxJava14
    }
}
