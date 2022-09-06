import java.util.Scanner;

public class pt1 {
    public static void main(String[] args) {
        System.out.println("Giai pt bac nhat");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a :");
        double a = scanner.nextDouble();
        System.out.println("Enter b :");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();
        double x;
        if(a != 0)
        {
            x = (c-b)/a;
            System.out.println(" x = :" + x);
        }
        else {
            if(b == c)
            {
                System.out.println("dung voi moi x");
            }
            else{
                System.out.println("vo nghiem");
            }
        }

    }
}
