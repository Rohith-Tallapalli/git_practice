import java.util.*;

public class st {
    public static void main(String[] args) {
        Set<Integer> q = new LinkedHashSet<>();
        q.add(10);
        q.add(19);
        q.addAll(Arrays.asList(3, 4, 5));
        q.notify();  
        System.out.println(q.iterator().next());
        System.out.println(q.size());
        System.out.println(q);
    }
}