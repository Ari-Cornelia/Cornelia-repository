package md.teckwill.lesson14;

public  class ArrayExercise {

    public static int[] getEven(int[] numberRange){
        int a = 0;
        for (int number:numberRange) {
            if (number%2==0){
                a++;}
        }
        int[] evenNumbers = new int[a];
        int i = 0;
        for (int number:numberRange) {
            if (number%2==0){
                evenNumbers[i] = number;
                i++;}
        }
        return evenNumbers;
    }

    public static String getStringFromCharArray(char[] charRange){
//        String toReturn = "";
//
//        for (char element: charRange) {
//            toReturn = toReturn + element;
//        }
//        return toReturn;
        String toReturn = new String (charRange);
        return toReturn;
    };

    public static void main(String[] args) {
        int[] numberRange = {1,2,3,4,5,6,7,8,9};
        int[] toPrintEven = getEven(numberRange);
        for (int number:toPrintEven) {
            System.out.println(number);
            ;
        }
        char[] charArray = {'a','b','c','1','d'};
        System.out.println(getStringFromCharArray(charArray));
    }
}
