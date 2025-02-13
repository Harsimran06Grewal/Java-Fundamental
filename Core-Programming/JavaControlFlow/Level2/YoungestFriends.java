import java.util.Scanner;

public class YoungestFriends {
    //method to find youngest among three
    static void young(int ageAmar, int ageAkbar, int ageAnthony){
        if(ageAmar < ageAkbar && ageAmar < ageAnthony){
            System.out.println("Amar is youngest");
        }
        else if(ageAkbar < ageAmar && ageAkbar < ageAnthony){
            System.out.println("Akbar is youngest");
        }
        else if(ageAnthony < ageAkbar && ageAnthony < ageAmar){
            System.out.println("Anthony is youngest");
        }
    }

    //method to find tallest among three
    static void tall(int heightAmar, int heightAkbar, int heightAnthony){
        if(heightAmar > heightAkbar && heightAmar > heightAnthony){
            System.out.println("Amar is tallest");
        }
        else if(heightAkbar > heightAmar && heightAkbar > heightAnthony){
            System.out.println("Akbar is tallest");
        }
        else if(heightAnthony > heightAkbar && heightAnthony > heightAmar){
            System.out.println("Anthony is tallest");
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get age input from user for Amar, Akbar, Anthony
        int ageAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int ageAnthony = input.nextInt();

        //get height input from user  for Amar, Akbar, Anthony
        int heightAmar = input.nextInt();
        int heightAkbar = input.nextInt();
        int heightAnthony = input.nextInt();

        input.close();

        young(ageAmar, ageAkbar, ageAnthony);
        tall(heightAmar, heightAkbar, heightAnthony);

        input.close();
    }
}
