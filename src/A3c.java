public class A3c {
    public static void main(String[] args) {                //mainMethod

        int x = 15;                                             //int variable for the switch condition

        switch (x) {
            case 1:                                             //first day is Monday
                System.out.print("MONDAY");
                break;                                          //break, so that the code is not further executed if case is met

            case 2:                                             //second day is Tuesday
                System.out.print("TUESDAY");
                break;

            case 3:                                             //and so on until 7 (week days)
                System.out.print("WEDNESDAY");
                break;

            case 4:
                System.out.print("THURSDAY");
                break;

            case 5:
                System.out.print("FRIDAY");
                break;

            case 6:
                System.out.print("SATURDAY");

                break;
            case 7:
                System.out.print("SUNDAY");
                break;
            default:                                             //default if the variable x is above 7 (week days)
                System.out.print("A Week not more than 7 days");      //no break needed here,
        }
    }
}



