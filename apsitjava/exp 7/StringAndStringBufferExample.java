public class  StringAndStringBufferExample{

    public static void main(String[] args) {
        String originalString = "Hello, World!";
        System.out.println("Original String: " + originalString);
        System.out.println("Length of String: " + originalString.length());
        System.out.println("Character at index 7: " + originalString.charAt(7));
        System.out.println("String in Uppercase: " + originalString.toUpperCase());
        System.out.println("String in Lowercase: " + originalString.toLowerCase());
        System.out.println("Replacing 'World' with 'Java': " + originalString.replace("World", "Java"));
        System.out.println("Index of 'World': " + originalString.indexOf("World"));

        
        StringBuffer buffer = new StringBuffer("Hello, World!");
        
    
        System.out.println("\nOriginal StringBuffer: " + buffer.toString());
        System.out.println("Length of StringBuffer: " + buffer.length());
        buffer.append(" Welcome to Java.");
        System.out.println("After append: " + buffer.toString());
        buffer.insert(13, " -");
        System.out.println("After insert: " + buffer.toString());
        buffer.replace(13, 15, " Java");
        System.out.println("After replace: " + buffer.toString());
        buffer.delete(13, 18);
        System.out.println("After delete: " + buffer.toString());
        buffer.reverse();
        System.out.println("After reverse: " + buffer.toString());
    }
}
