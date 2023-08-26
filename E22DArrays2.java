package class9;

public class E22DArrays2 {
    public static void main(String[] args) { //2D arrays are simple 1D arrays put together
        String [][] names=
                {       {"Hind", "Mikhail", "Ismael", "Ahmed"},
                        {"John", "Bob", "Adam", "Tamim"},
                        {"Joke", "Laugh", "John Ahmed", "Mohammad"},
                        {"Gui", "Backend", "Front", "API"}
                };
        String [] row=names[2];
        for(String name:row){
            System.out.println(name);
        }

        
    }
}
