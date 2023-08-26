package class9;

public class CodingTask7 {
    public static void main(String[] args) {
        //Write a Java Program to print the first 10 numbers of Fibonacci series.
        int n=10;
        int num1=0;
        int num2=1;

        for (int i = 1; i <=n ; i++) {
            System.out.println(num1+ " ");

            int num3=num1+num2;
            num1=num2;
            num2=num3;

        }
    }
}
