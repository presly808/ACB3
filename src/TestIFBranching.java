/**
 * Created by admin on 15.10.2014.
 */
public class TestIFBranching {

    public static void main(String[] args) {
        // if(<condition>) {
        // }

        /*
        * if(<condition>) {
        *
        * }
        *
        * */
        int hour = 15;

        if (hour < 8) {
            System.out.println("Busy");
        } else {
            if (hour >= 8) {
                System.out.println("Hello");
            }
        }

        if (hour < 8) {
            System.out.println("Busy");
        } else if (hour >= 8) {
            System.out.println("Hello");
        } else if(hour == 12){

        } else {

        }


    }

}
