public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
       // String string = "Hello world";
       //  char chr = 'l';
       //int [] array = {1, 2, 3, 4};
        //System.out.println(array);
        //System.out.println(capVowelsLowRest(string)); //ex1
        //System.out.println(camelCase(string)); //ex2
      // int [] arr = System.out.println(allIndexOf(string, chr));
       //for(int z = 0; z < arr.length; z++){
     //      System.out.println(z);
     //  }

    }

    public static String capVowelsLowRest(String string) {
        // Write your code here:
        String newS = "";
        char newC;
        int asci;
        for (int i = 0; i < string.length(); i++) {
            newC = string.charAt(i);
            if (newC == 'a' || newC == 'e' || newC == 'i' || newC == 'o' || newC == 'u') {
                asci = (int) (newC);
                asci = asci - 32;
                newC = (char) (asci);
            } else {
                if (((newC >= 'A') && (newC <= 'Z')) && (newC != 'O' && newC != 'A' && newC != 'I' && newC != 'E' && newC != 'U')){
                    asci = (int) (newC);
                    asci = asci + 32;
                    newC = (char) (asci);
                }
            }
            newS = newS + newC;
        }
        return newS;
    }

    public static String camelCase (String string) {
        // Write your code here:
        String newS = "";
        String middleS = "";
        String lastS = "";
        char newC;
        char lastC;
        int asci;
        int start;
        for (int j = 0; j < string.length(); j++) {
            newC = string.charAt(j);
            if(((j != 0) && (string.charAt(j) >= 'a') && (string.charAt(j) <= 'z') && (string.charAt(j - 1) == ' ')) || ((j != 0) && (newC >= 'A') && (newC <= 'Z') && (string.charAt(j - 1) != ' '))){
                if ((string.charAt(j) >= 'a') && (string.charAt(j) <= 'z') && (string.charAt(j - 1) == ' ')) {
                    asci = (int) (string.charAt(j));
                    asci = asci - 32;
                    newC = (char) (asci);
                    newS = newS + newC;
                }
                if ((j != 0) && (newC >= 'A') && (newC <= 'Z') && (string.charAt(j - 1) != ' ')) {
                    asci = (int) (string.charAt(j));
                    asci = asci + 32;
                    newC = (char) (asci);
                    newS = newS + newC;
                }
            }
            else {
                newS = newS + newC;
            }
        }
        for (int i = 0; i < newS.length(); i++) {
            newC = newS.charAt(i);
            if (newC != ' ') {
                middleS = middleS + newC;
            }
        }
        for(int k = 0; k < middleS.length(); k++){
            lastC = middleS.charAt(k);
            if((k==0) && (lastC >= 'A') && (lastC <= 'Z')){
                start = (int) (lastC);
                start = start + 32;
                lastC = (char) (start);
            }
            lastS = lastS + lastC;

        }
        return lastS;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        char check;
        char insert;
        int size = 0;
        for(int i = 0; i < string.length(); i++){
            check = string.charAt(i);
            if(check == chr){
                size++;
            }
        }
       int[] array = new int[size];
        for(int k = 0; k < size; k++) {
            for (int j = 0; j < string.length(); j++) {
                insert = string.charAt(j);
                if (insert == chr) {
                    //System.out.print(j);
                    array[k] = j;
                }
            }
        }
        return array;

    }
}
