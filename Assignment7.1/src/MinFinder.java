public class MinFinder {
    public static <T extends Number & Comparable<T>> T findMinimum(T[] array) {
        if (array == null || array.length == 0) {
            return null; 
        }

        T min = array[0];
        for (T num : array) {
            if (num.compareTo(min) < 0) {
                min = num;
            }
        }
        return min;
    }

   
    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 9, 1, 4};
        Double[] doubleArray = {5.5, 3.2, 9.8, 1.1};

        System.out.println("Minimum Integer: " + findMinimum(intArray));
        System.out.println("Minimum Double: " + findMinimum(doubleArray));
    }
}
