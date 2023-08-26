package class9;

public class HW1 {
    public static void main(String[] args) {
        //Inside you should have an array of veggies, fruits, dairy and sweets.
        // Retrieve all values from that array using 2 different loops

        String [][] names={
                {"Carrot","Broccoli","Onion","Eggplant"},
                {"Apple","Banana","Mango","Orange"},
                {"Yogurt","Cheese","Milk","Butter"},
                {"Cookies","Candies","Biscuit","Cakes"}
        };
        for (int row = 0; row < names.length; row++) {
            for (int col = 0; col < names[row].length; col++) {
                System.out.print(names[row][col]+" ");

            }
            System.out.println();

        }
        System.out.println("===========");
        for(String[] r:names){
            for(String c:r){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
