import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        SearchSequences searchSequences = new SearchSequences();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);

        for (int i = 1; i < numbers.size() / 2; i++) {
            if (numbers.get(0).equals(numbers.get(i))
                    && searchSequences.fragmentSequenceSearch(i - 1, numbers)) {
                System.out.println("Лист состоит из последовательностей.");
                break;
            }
            if (i == (numbers.size() / 2) - 1) {
                System.out.println("Лист не состоит из последовательностей.");
            }
        }
    }

}
