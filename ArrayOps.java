public class ArrayOps {
    public static void main(String[] args) {
        int[] array = {7, 5, 4, 3, -12};
        //int[] array2 = {8, 2, 7, 7, 3};
        //System.out.println(findMissingInt(array)); //ex1
        //System.out.println(secondMaxValue(array)); //ex2
        //System.out.println(containsTheSameElements(array1, array2)); //ex3
        System.out.println(isSorted(array));

    }
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
        int missing = 0;
        int t = 0;
        while(t < array.length) {
            for (int i = 0; i < array.length; i++) {
                if (missing == array[i])
                    missing++;
            }
            t++;
        }
        return(missing);

    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int max1 = 0;
        int max = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) { //detects max1
            if (array[i] > max1) {
                max1 = array[i];
            }
        }
        for (int n = 0; n < array.length; n++) {
            if (array[n] == max1) count++;       //tests if the max num repeats himself
        }
        if (count > 1) return max1;
        else {
            int max2 = (max1 - 1);
            while (max2 > max) {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == max2) {
                        max = max2;
                    }

                }
                max2--;
            }

            return max;
        }
    }
    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        boolean same = false;
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]) {
                    same = true;
                }
            }
            if (same == false){
                return false;
            }
            same = false;
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        boolean up = true;
        boolean down = true;
        for(int i = 0; i < array.length - 1; i++){
            if(array[i+1] > array[i]){
                down = false;
            }
            if(array[i+1] < array[i]){
                up = false;
            }
        }
        if(up == false && down == false){
            return false;
        }
        else {
            return true;
        }
    }

}
