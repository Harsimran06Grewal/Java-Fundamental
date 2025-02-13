package Level2;

class PalindromeChecker{
    //Attribute
    String text;

    //constructor
    PalindromeChecker(String text){
        this.text = text;
    }

    //method to check string is palindrome or not
    boolean palindromeText(){
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) != text.charAt(text.length() - i - 1)){
                return false;
            }
        }

        return true;
    }

    //method to display result
    void displayResult(){
        if(palindromeText()){
            System.out.println("text is palindrome");
        }
        else{
            System.out.println("text is not a palindrome");
        }
    }
}

public class PalindromeString {
    public static void main(String[] args) {
        PalindromeChecker palindrome = new PalindromeChecker("racecar");

        palindrome.palindromeText();
        palindrome.displayResult();
    }
}
