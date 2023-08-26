package class9;

public class CodingTask1 {
    //Create a program that uses an array to store a list of temperatures for a week
    //and then uses a loop to find the highest and lowest temperature for the week

    public static void main(String[] args) {
        double [] temp={36.6,39.4,40.1,42.1,18.8,10.2,19.4};
        double largest=temp [0];
        for (double n:temp){
            if(n>largest){
                largest=n;

            }

        }
        System.out.println("The highest temperature for the week is " +largest);

        double lowest=temp[0];
        for(double m:temp){
            if(m<lowest){
                lowest=m;
            }
        }
        System.out.println("The lowest temperature for the week is " +lowest);



    }
}
