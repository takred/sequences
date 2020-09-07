import java.util.List;

public class SearchSequences {
    public boolean fragmentSequenceSearch(int indexEnd, List<Integer> numbersLit) {
        for (int i = 1; i < numbersLit.size() / (indexEnd + 1); i++) {
            for (int j = 0; j < indexEnd + 1; j++) {
                if (!numbersLit.get(j).equals(numbersLit.get((i * (indexEnd + 1)) + j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
