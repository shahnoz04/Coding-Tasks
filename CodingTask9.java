package class9;

public class CodingTask9 {
    // Write a java program to find the second largest number in the array?
    public static void main(String[] args) {
        int [] num={86,45,76,30,78,61};
        int secLargest;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {

            if(num[i]>num[j]) {
                secLargest = num[i];
                num[i] = num[j];
                num[j] = secLargest;
            }
            
        }
        }
        System.out.println(num[num.length-2]);

    }
}
