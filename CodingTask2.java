package class9;

public class CodingTask2 {
    //Create an array of integer values.
    //After the array is created, calculate the sum of all stored elements in that array.
    public static void main(String[] args) {
        int[] num = {10, 15, 20, 25, 30};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];

        }
        System.out.println(sum);
    }







}
