import java.util.Scanner;

public class StringLength {

    public static int calculateLength(String str) {
        int length = 0;
        while (length < str.length()) {
            length++;
        }
        return length;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        
        int builtInLength = str.length();
        System.out.println("Length using built-in method: " + builtInLength);
        
        
        int userDefinedLength = calculateLength(str);
        System.out.println("Length using user-defined method: " + userDefinedLength);
        
        
    }
}




