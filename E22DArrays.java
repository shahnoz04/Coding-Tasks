package class9;

import java.util.Arrays;

public class E22DArrays {
    public static void main(String[] args) {
        String [][] names=
                {       {"Hind", "Mikhail", "Ismael", "Ahmed"},
                        {"John", "Bob", "Adam", "Tamim"},
                        {"Joke", "Laugh", "John Ahmed", "Mohammad"},
                        {"Gui", "Backend", "Front", "API"}
                };
        String [] row=names[1];
        System.out.println(Arrays.toString(row));
        
    }
}
