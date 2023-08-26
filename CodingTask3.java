package class9;

public class CodingTask3 {
    //Create a 2D array or integer type where you will store odd and even numbers.
    //Develop a program which will identify/print the even numbers only
    public static void main(String[] args) {
        int num [][]={
                {10,23,27,36,56},
                {15,18,31,38,49},
                {21,26,59,14,76}};
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                if(num[row][col]%2==0){
                    System.out.print(num[row][col]+" ");
                }

            }
            System.out.println();

        }

    }
}
