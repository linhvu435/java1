import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double vnd =23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien");
        usd = scanner.nextDouble();
        double doitien = usd*vnd;
        System.out.println(doitien);
    }
}
