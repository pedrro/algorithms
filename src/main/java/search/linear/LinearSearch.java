package search.linear;

public class LinearSearch {

     String linearSearch(String[] array, String item) {
        for (String anArray : array) {
            if (anArray.equals(item)) {
                return anArray;
            }
        }
        return "NOT FOUND";
    }

    public static void main(String[] args) {
        String[] array = new String[]{"a", "b", "c"};
        LinearSearch linearSearch = new LinearSearch();
        System.out.println(linearSearch.linearSearch(array,"d"));
    }
}
