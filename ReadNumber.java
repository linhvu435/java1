import java.util.*;

public class ReadNumber {
    public static String dochangdonvi(int a){
        String result = "";
        if(0<=a&& a<10)
        {
            switch (a)
            {
                case 1:
                    result = "one";
                    break;
                case 2:  result ="two";
                    break;
                case 3: result ="three";
                    break;
                case 4: result ="four";
                    break;
                case 5:  result ="five";
                    break;
                case 6:  result ="six";
                    break;
                case 7:  result ="seven";
                    break;
                case 8:  result ="eight";
                    break;
                case 9:  result ="nice";
                    break;
                case 0: result ="";
                    break;
                default:  result ="out of ability";

            }
        }
        return result;
    }
    public static String dochangchuc(int a){
        String result = "";
        if(2<=a&& a<10)
        {
            switch (a)
            {
                case 2:  result ="twenty";
                    break;
                case 3: result ="thirty";
                    break;
                case 4: result ="forty";
                    break;
                case 5:  result ="fifty";
                    break;
                case 6:  result ="sixty";
                    break;
                case 7:  result ="seventy";
                    break;
                case 8:  result ="eighty";
                    break;
                case 9:  result ="ninety";
                    break;
                default:  result ="out of ability";
                break;

            }
        }
        return result;

    }
    public static String haisocuoi(int a){
        String result = "";

        if(10<=a&&a<=20)
        {
            switch (a)
            {
                case 10:   result = "and ten";
                    break;
                case 11:result = "and eleven";
                    break;
                case 12: result = "and Twelve";
                    break;
                case 13: result = "and Thirteen";
                    break;
                case 14: result ="and Fourteen";
                    break;
                case 15:result ="and Fifteen";
                    break;
                case 16: result ="and Sixteen";
                    break;
                case 17: result ="and Seventeen";
                    break;
                case 18: result ="and Eighteen";
                    break;
                case 19:result ="and Nineteen";
                    break;
                case 0: result ="";
                    break;
            }
        }
        if(a>20&&a<99)
        {
            int chuc = a/10;
            int donvi = a%10;
           result = "and " + dochangchuc(chuc) + " " + dochangdonvi(donvi);
        }

        return result;
    }
    public static String sohangtram(int a){
        String result = "";
        if(1<=a&& a<10)
        {
            switch (a)
            {
                case 1:
                    result = "one hundred";
                    break;
                case 2:  result ="two hundred";
                    break;
                case 3: result ="three hundred";
                    break;
                case 4: result ="four hundred";
                    break;
                case 5:  result ="five hundred";
                    break;
                case 6:  result ="six hundred";
                    break;
                case 7:  result ="seven hundred";
                    break;
                case 8:  result ="eight hundred";
                    break;
                case 9:  result ="nice hundred";
                    break;
                default:  result ="out of ability";

            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Numer :");
        int a = scanner.nextInt();
        if(0<=a&& a<10)
        {
            switch (a)
            {
                case 1:
                    System.out.println("one");
                    break;
                case 2:   System.out.println("two");
                    break;
                case 3:  System.out.println("three");
                    break;
                case 4:  System.out.println("four");
                    break;
                case 5:   System.out.println("five");
                    break;
                case 6:   System.out.println("six");
                    break;
                case 7:   System.out.println("seven");
                    break;
                case 8:   System.out.println("eight");
                    break;
                case 9:   System.out.println("nice");
                    break;
                case 0:  System.out.println("zero");
                    break;
                default:   System.out.println("out of ability");

            }
        }

        if(10<=a&&a<=20)
        {
            switch (a)
            {
                case 10:   System.out.println("ten");
                    break;
                case 11: System.out.println("eleven");
                    break;
                case 12: System.out.println("Twelve");
                    break;
                case 13: System.out.println("Thirteen");
                    break;
                case 14: System.out.println("Fourteen");
                    break;
                case 15: System.out.println("Fifteen");
                    break;
                case 16: System.out.println("Sixteen");
                    break;
                case 17: System.out.println("Seventeen");
                    break;
                case 18: System.out.println("Eighteen");
                    break;
                case 19: System.out.println("Nineteen");
                    break;

            }
        }
        if(a>=20&&a<100)
        {
            int chuc = a/10;
            int donvi = a%10;
            System.out.println(dochangchuc(chuc) + " " + dochangdonvi(donvi));
        }
        if(a>=100 && a<1000)
        {
            int hangtram = a/100;
            int haisoduoi = a%100;
            System.out.println(sohangtram(hangtram) + "  " + haisocuoi(haisoduoi));
        }

    }
}