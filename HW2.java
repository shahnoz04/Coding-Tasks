package class9;

public class HW2 {
    //Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
    // Print the sum of all numbers.
    public static void main(String[] args) {
        int[][]num={
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int sum=0;
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                sum=sum+num[row][col];

            }

        }
        System.out.println(sum);
    }
}




