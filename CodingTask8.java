package class9;

public class CodingTask8 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array?
        int [] num={10,12,14,17,32,16,11};
        int maximum=num[0];
        int minimum=num[0];
        for(int n:num){
            if(n>maximum){
                maximum=n;

            }else if (n<minimum){
                minimum=n;
            }
        }
        System.out.println(maximum+" is the maximum number");
        System.out.println(minimum+" is the minimum number");

    }
}
