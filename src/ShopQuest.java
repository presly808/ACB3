import java.util.Scanner;

/**
 * Created by admin on 15.10.2014.
 */
public class ShopQuest {

    public static void main(String[] args) {
        String atb = "ATB";
        String billa = "Billa";
        int billaMilkPrice = 10;
        int atbMilkPrice = 8;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input time in range 0-24");
        int hour = sc.nextInt();

        System.out.println("How much money do you have?");
        double money = sc.nextDouble();

        String message = "";
        if (hour >= 8 && hour <= 22){
            if(money >= billaMilkPrice){
                message = "Now you have milk! Go home";
            } else {
                message = "Cant buy. Milk costs " + billaMilkPrice;
            }
            System.out.println(message);
        } else {
            if(money >= atbMilkPrice){
                System.out.println("Now you have milk! Go home");
            } else{
                System.out.println("Cant buy. Milk costs " + atbMilkPrice
                        + " your money" + money);
            }
        }

        System.out.println("You are at home!");




    }
}
