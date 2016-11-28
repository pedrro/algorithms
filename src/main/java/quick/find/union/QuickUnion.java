package quick.find.union;

public class QuickUnion {



    private boolean isConnected(int id, int id2, Integer[] array) {
        return array[id] == array[id2];

    }

    private Integer[] union(int id, int id2, Integer[] array) {
        if(isConnected(id,id2, array)) {
            return array;
        } else {
            int ref = array[id2];
            array[id2] = array[id];
            for (int i = 0; i< array.length; i++) {
                if(array[i] == ref) {
                    array[i] = array[id];
                }
            }
            return array;
        }
    }

    public static void main(String[] Args) {
        Integer[] array = new Integer[]{0,1,2,3,4,5,6,7,8};
        QuickUnion quickUnion = new QuickUnion();
        array = quickUnion.union(1,2,array);
        array = quickUnion.union(2,7,array);
        array = quickUnion.union(3,2,array);
        array = quickUnion.union(8,5,array);

        for (int i = 0; i < array.length ; i++) {
            System.out.println(i + " - " + array[i]);
        }
        System.out.println(quickUnion.isConnected(1,2, array));
    }


}
