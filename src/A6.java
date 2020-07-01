public class A6 {
    public static void multiplyAble(int n) {
        if (n % 3 == 0 && n % 5 ==0) {
            System.out.println("FIZZBUZZ!");                    //returns FIZZBUZZ if multiply able with 3 AND 5
        } else if (n % 5 == 0) {
            System.out.println("BUZZ!");                        // returns BUZZ if multiply able with 5

        } else if  (n % 3 == 0){
            System.out.println("FUZZ!");                        // returns FUZZ if multiply able with 3

        } else {
            System.out.println(n + " is not multiply able by 3 or 5!"); //returns non-multiply able n and text
        }


    }

    public static void main(String[] args)      //mainMethod
    {
        int n = 13;                             //put number in here
        multiplyAble(n);                        //executing the method
    }
}


