import java.util.Random;

public class NullCounter {
    public int[] fillArray(int size) {
        int[] resultArr = new int[size];

        Random ran = new Random();
        int value = ran.nextInt(50);

        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = value;
            System.out.print(resultArr[i] + " ");
        }
        return resultArr;
    }


    public int[] fillArrayNew(int size) {
        int[] resultArr = new int[size];

        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = (int) Math.random();
//            System.out.print(resultArr[i] + " rere");
        }
        return resultArr;

    }



    public int counterNullElements (int [] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==0) counter++;
            System.out.println(counter);
        }

        for (int i : arr) {
            if (i==0) counter++;
//            System.out.println(counter);
            }
        return counter;

    }

    public int counterMaxElement (int [] arr) {
        int maxElement = arr[0];

        for (int i : arr) {
            if (maxElement<i) maxElement =i;
            System.out.println(maxElement);
        }
        return maxElement;

    }

}
