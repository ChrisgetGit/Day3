public class A5 {
    // Returns true if n is even, else odd
    public static boolean isEven(int n)
    {
        return (n % 2 == 0);                    //returns true if even
    }


    public static void main(String[] args)      //mainMethod
    {
        int n = 44;                             //put number in here
        if(isEven(n) == true)
            System.out.print("Even");
        else
            System.out.print("Odd");
    }
}
