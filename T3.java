package class9;

public class T3 {
    public static void main(String[] args) {
        String[][] cars = {
                {"Ford", "Cadillac", "Jeep", "Tesla"},
                {"BMW", "Audi", "Mercedes", "Volkwagen"},
                {"Kia", "Hyundai", "Sportage", "Genesis Motor"},
                {"Ferrari", "Lamborghini", "Maserati", "Fiat"}
        };
        for (int row = 0; row < cars.length; row++) {
            for (int col = 0; col < cars[row].length; col++) {
                System.out.print(cars[row][col] + " ");
            }
            System.out.println();
        }
            System.out.println("=========");


            for (String[] r : cars) {
                for (String c : r) {
                    System.out.print(c + " ");
                }

                System.out.println();

            }


        }
    }

