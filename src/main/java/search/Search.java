package search;

public class Search {

    private static final String NOT_FOUND = "NOT FOUND";

    String linearSearch(String[] array, String item) {
        for (String anArray : array) {
            if (anArray.equals(item)) {
                return anArray;
            }
        }
        return NOT_FOUND;
    }

    String sentinelLinearSearch(String[] array, int length, String item) {
        String last = array[length - 1];
        array[length - 1] = item;
        int i = 0;
        while (!array[i].equals(item)) {
            i++;

        }
        array[length - 1] = last;
        if (i < length - 1 || item == array[length - 1]) {
            return array[i];
        }
        return NOT_FOUND;
    }

    public static void main(String[] args) {
        String[] array = new String[]{"a", "b", "c"};
        Search linearSearch = new Search();
        System.out.println(linearSearch.linearSearch(array,"d"));

        System.out.println(linearSearch.sentinelLinearSearch(array, 3, "b"));
    }
}
