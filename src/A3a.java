public class A3a {

    public static void main(String[] args) {
        int x = 5;

        if ( x == 1)                                       //if x is 1 >> print Monday
        {
            System.out.println("Today is Monday");
        } else if (x==2){                                  //if not 1 >>> go on with els if 2? >>> Tuesday
            System.out.println("Today is Tuesday");
        } else if (x==3){                                  //else if x = 3 >>> Wednesday and so on
            System.out.println("Today is Wednesday");
        } else if (x==4){
            System.out.println("Today is Thursday");
        } else if (x==5){
            System.out.println("Today is Friday");
        } else if (x==6){
            System.out.println("Today is Saturday");
        } else if (x==7){
            System.out.println("Today is Sunday");
        } else if (x>7){                                   //a week only has 7 Days, so if x is above 7 >>> always same output
            System.out.println("A Week only has 7 Days");
        }


/*
Console
Today is Friday

Process finished with exit code 0
*/




    }
}

