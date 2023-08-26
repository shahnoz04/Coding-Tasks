package class9;

public class CodingTask4 {
    //Create a 2D array of integers.
    // Develop a program which will calculate the sum of even and odd numbers for that array.
    public static void main(String[] args) {
        int num[][] = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}};
        int even=0;
        int odd=0;

        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {

                if (num[row][col] % 2 == 0) {
                    even+=num[row][col];
                } else {
                    odd+=num[row][col];
                }

            }


        }
        System.out.println("The sum of even numbers is " + even);
        System.out.println("The sum of odd numbers is " + odd);
    }
}










