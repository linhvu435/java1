import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month");
        int month = scanner.nextInt();
        switch (month)
        {
            case 2 : System.out.println("28 or 29");
            break;
            case 1,3,5,7,8,10,12 : System.out.println("31");
            break;
            case 4,6,9,11: System.out.println("30");
            break;
            default:System.out.println("Nhap lai thang");
        }
    }
}
