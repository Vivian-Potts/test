import java.util.ArrayList;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Comparator<Integer> a = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String a = o1.toString();
                String b = o2.toString();
                if (a.length() > b.length()){
                    return -1;
                } else if (a.length() == b.length()) {
                    return 0;
                } else {
                    return 1;
            }
            }
        };
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(123);
        numbers.add(66666);
        numbers.add(21);
        numbers.add(7);
        numbers.sort(a);
        System.out.println(numbers);
    }
}