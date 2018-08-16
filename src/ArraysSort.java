public class ArraysSort {

    Arrays arr = new Arrays();

    public int[] sortArray(int[] array) {
        int[] sortedArr = new int[array.length];
        int temp;
        for (int i = 0; i < array.length; i++) {
        for (int k = i + 1; k < array.length; k++) {
            if (array[i] < array[k]) {
                temp = array[i];
                array[i] = array[k];
                array[k] = temp;
            }
        }
    }
        return sortedArr;
    }
}


//    public void print () {
//        for (i : int []){
//            for (String str : arr) {
//                if (str == null) {
//                    str = value;
//                }
//                break;
//            }
//            return arr;
//        }
//
//        }
//        System.out.print(arrt);
//    }


//    public int[] sortArrayLogic(int [] array) {
//        int[] sorted = new int[array.length];
//        int min1;
//        int counerChanges = 0;
//        do {
//            int i = 0;
//            int j = i++;
//        } while (counerChanges !=0);
//        return sorted;
//        }
//    }
