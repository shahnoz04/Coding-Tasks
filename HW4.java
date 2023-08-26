package class9;

public class HW4 {
    //Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
    // Then print all values from that array using 2 different loops and calculate how many total countries been stored.
    public static void main(String[] args) {
        String[][] countries = {
                {"Canada", "United States", "Mexico", "Cuba", "Guatemala"},
                {"Brazil", "Argentina", "Peru", "Chile", "Colombia"},
                {"Austria", "Germany", "Paris", "Spain", "Hungary"},
                {"Tajikistan", "Kyrgyzstan", "Kazakhstan", "Turkmenistan", "Uzbekistan"},
                {"Zimbabwe", "Liberia", "Tunisia", "Egypt", "Morocco"}};
        for (int row = 0; row < countries.length; row++) {
            for (int col = 0; col < countries[row].length; col++) {
                System.out.print(countries[row][col] + " ");

            }
            System.out.println();
        }
        System.out.println("==============");

        for (String[] row : countries) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("==============");
        int countr = 0;
        for (int row = 0; row < countries.length; row++) {
            countr+=countries[row].length;


        }
        System.out.println(countr);
    }

        }






