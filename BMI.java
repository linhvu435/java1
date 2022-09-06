import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight :");
        float weight = scanner.nextFloat();
        System.out.print("Enter height :");
        float height = scanner.nextFloat();
        float BMI = (float) (weight /Math.pow(height, 2));
        if(BMI<18)
        {
            System.out.println("underweight");
        }
        else if(BMI<25)
        {
            System.out.println("Normal");
        }
        else if(BMI<30)
        {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");

        }
     }
}
