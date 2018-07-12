public class Arrays {
    int[] arr = new int[0];
    String[] arrStr = new String[0];
    Object[] arrObj = new Object[0];
    int[] arr2 = {1, 2, 3, 4, 5};
    char[] arrChar = {'a', 'b', 'c', 'd'};


    char resultChar = arrChar[1];
    int result = arr2[0];
    int arrSize = arrChar.length;
    int lastValue = arrChar[arrSize - 1];



    public void fill(int[] array, int filler) {
        int[] n = array;
        int k = 5;
        System.out.println("New array = " + n.length + k);
        System.out.println("Array list " + filler);
    }


    public int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum = sum + num;
        }
        return sum;
    }
}
