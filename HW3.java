package class9;

public class HW3 {
    //Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
    // Develop a program which will identify/print the even numbers only.
    public static void main(String[] args) {
        int [][] nums={
                {10,13,16,21},
                {26,27,30,33},
                {35,40,42,47}};
        for (int i = 0; i < nums.length; i++) {
            for (int col = 0; col < nums[i].length; col++) {
                if(nums[i][col]%2==0){
                    System.out.print(nums[i][col]+" ");
                }

            }
            System.out.println();

        }


    }
}
