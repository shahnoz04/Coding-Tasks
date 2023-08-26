package class9;

public class CodingTask10 {
    //Write a program to print out duplicate elements from an Array of strings?
    public static void main(String[] args) {
       String [] name={"Jack", "Anna", "Jane", "Anna", "Frank"};

        for (int i = 0; i < name.length-1; i++) {
            for (int j = i+1; j < name.length; j++) {
                if(name[i].equals(name[j])){
                    System.out.println(name[j]+" is duplicated");

                }
                
            }
            
        }



    }
}
