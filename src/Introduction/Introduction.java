package Introduction;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {

        // TODO: Variables
        // byte, long, float, char, boolean
        int age = 30;
        String name = "Levis";
        Date now = new Date();
        System.out.println(name + " you have " + age + " years old.");
        System.out.println(now);

        // TODO:  String method some of the String method
        String message = "I am here";
        message.toUpperCase();
        message.lastIndexOf("p");
        message.endsWith("p");
        message.length();
        message.indexOf("a");
        message.replace("a", "p");
        message.trim();

        // TODO: Array
        int[] numbers = new int[5];
        int [] number = {5, 14, 45};
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;
        Arrays.toString(numbers); // In java, Arrays have a fix length
        Arrays.sort(number);

        // TODO: Two dimensional array
        int [][] multiDimension = new int [5][5];
        int [][] multiDimensions = {{1, 2, 3}, {10, 11, 25}};
        multiDimension[0][0] = 1;
        System.out.println(Arrays.deepToString(multiDimension));

        //TODO: Constant and casting in action
        final int PI = (int) 3.14;
        // if the number is a string that want to convert
        String x = "2";
        int y = Integer.parseInt(x);

        // TODO: Math methods
        Math.round(14.5);
        Math.abs(-14.5);
        int result = (int)Math.ceil(1.4);
        Math.max(5, 12);
        Math.min(10, 52);
        double  results = Math.random(); // For a double
        int  resultInt = (int) Math.round(Math.random() * 100); // For an int

        // TODO: Numbers Format
        // For the currency
        //getPercentInstance for the percent
         NumberFormat currency = NumberFormat.getCurrencyInstance();
         String resultss = currency.format(1455562.452);

         // TODO: Reading input
        Scanner scanner = new Scanner(System.in);
        int ages = scanner.nextInt(); // byte, long, or float

    //   #############################  Control Flow ########################
         // Comparison Operator ==, !=, >, <, <=
        // Logical Operator

        // TODO:: If Statement
        int a = 10;
        int b = 20;
        if(a > b) {
            System.out.println("Yes you win!");
        }else {
            System.out.println("You lost");
        }
        boolean test = (a > b);
        // Ternary one
        String names = a > b ? "leslie" : "Mark";

        // TODO: Switch statement
        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("admit");
                break;
            case "supervisor":
                System.out.println("Super");
                break;
            default:
                System.out.println("none");
        }

        // TODO: Loop statement
        // For loop use it if you know ahead of time the number of iteration
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        // While loop
        int i = 0;
        while (i < 10){
            System.out.println("Do something");
            i++;
        }

        // Do while loop
        do {

        }while( a > b);

        // For each loop
        String[] fruits = {"Apple", "Mango", "Orange"};
        for (String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
