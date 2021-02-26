import java.util.Scanner;

public class Main {

    public static  void main(String[] args){
        Calculator calculator = new Calculator();

        // Create a Scanner object
        System.out.println("which calculation you want to do? To exit type \"exit\"");

        while(true) {
            Scanner myObj = new Scanner(System.in);
            String calculation = myObj.nextLine();
            if (calculation.equals("add")) {
                int num1 = myObj.nextInt();
                int num2 = myObj.nextInt();
                int addNum = calculator.add(num1,num2);
                System.out.println("Result: " + addNum);
                System.out.println("which calculation you want to do? To exit type \"exit\"");
            } else if (calculation.equals("subtract")) {
                int num1 = myObj.nextInt();
                int num2 = myObj.nextInt();
                int subtractNum = calculator.subtract(num1,num2);
                System.out.println("Result: " + subtractNum);
                System.out.println("which calculation you want to do? To exit type \"exit\"");
            } else if (calculation.equals("multiply")) {
                int num1 = myObj.nextInt();
                int num2 = myObj.nextInt();
                int multiplyNum = calculator.multiply(num1,num2);
                System.out.println("Result: " + multiplyNum);
                System.out.println("which calculation you want to do? To exit type \"exit\"");
            } else if (calculation.equals("divide")) {
                int num1 = myObj.nextInt();
                int num2 = myObj.nextInt();
                int divideNum = calculator.divide(num1, num2);
                System.out.println("Result: " + divideNum);
                System.out.println("which calculation you want to do? To exit type \"exit\"");
            } else if (calculation.equals("fibonacci")) {
                int num1 = myObj.nextInt();
                int fibonacciNum = calculator.fibonacciNumberFinder(num1);
                System.out.println("Result: " + fibonacciNum);
                System.out.println("which calculation you want to do? To exit type \"exit\"");
            } else if (calculation.equals("binary")) {
                int num1 = myObj.nextInt();
                String intToBinaryNum = calculator.intToBinaryNumber(num1);
                System.out.println("Result: " + intToBinaryNum);
                System.out.println("which calculation you want to do? To exit type \"exit\"");
            } else if (calculation.equals("exit")){
                break;
            } else {
                System.out.println("We don't support this kind of calculation");
            }
        }

    }
}
