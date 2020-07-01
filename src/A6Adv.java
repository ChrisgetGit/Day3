public class A6Adv {

    public static void maxNumber (int n1, int n2, int n3) {

        if ((n1>n2) && (n1>n3)){
            System.out.println(n1 + " is the maximum");
        } else if ((n2>n1) && (n2 > n3)){
            System.out.println(n2 + " is the maximum");
        } else if ((n3>n1) && (n3 > n1)) {
            System.out.println(n3 + " is the maximum");
        }

    }







    public static void main(String[] args) {

        int n1 = 17;
        int n2 = 14;
        int n3 = 42;

        maxNumber(n1,n2,n3);
    }

}
 /* public static void maxNumberChall (int n1, int n2, int n3){

        int [] anArray = {int n1, int n2, int n3}
    }*/