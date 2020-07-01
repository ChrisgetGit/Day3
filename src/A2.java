public class A2 {

    public static void main(String[] args) {        //main method
        double x = 10;                            // double to be able to fill in int or float Numbers

        if ( x > 0) {                                // if x is above 0

            if (x>1000000){
                System.out.println("Is a large positive Number"); //if it is above 0 and 1000000
            }
            if (x<1) {
                    System.out.println("Is a small positive Number"); //if it is above 0 but below 1
                //
         } else {
                System.out.println("Is a positive Number");           //only positive, above 1 but below 1 000 000
           }

        } else if (x == 0) {
            System.out.println ("Number is ZERO");

        }


        else {
            System.out.println("Number is negative");       //first if condition not met and else if condition not met
            }


    }

}

/*Console
Number is Zero

Process finished with exit code 0*/

