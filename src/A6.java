public class A6 {
    public static void multiplierOf(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FIZZBUZZ!");                    //returns FIZZBUZZ if multiplier of 3 AND 5
        } else if (n % 5 == 0) {
            System.out.println("BUZZ!");                        // returns BUZZ if multiplier of 5

        } else if (n % 3 == 0) {
            System.out.println("FUZZ!");                        // returns FUZZ if multiplier of 3

        } else {
            System.out.println(n + " is not a multiplier of 3 or 5!"); //returns not a multiplier of 3 o
        }
    }
    public static void main(String[] args)      //mainMethod
    {
        int n = 15;                             //put number in here
        multiplierOf(n);                        //execute the method
    }
}


