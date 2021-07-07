 class SecondExercise {

   static int  calculateSum(int a, int b){
        return a+b;
    }
    static long  calculateSum(int a, int b, long c){
        return a+b+c;
    }
    static double calculateSum(int a, double b){
        return a+b;
    }

    public static void main (String[] args){

        System.out.print(calculateSum(2,3));
        System.out.print(calculateSum(1,2, 3L));
        System.out.print(calculateSum(2456, 5.5));

    }
}

//  2. One class with 3 overloaded methods.
