package homeworks.homework_04;

public class Homework_04 {

    public static void main(String[] args) {
        String str = new String("I study Basic Java!");

        processString(str);
    }

    public static void processString(String input) {
        char secondLastChar = input.charAt(input.length() - 2);
        System.out.println("The second last char: " + secondLastChar);

        boolean containsJava = input.contains("Java");
        System.out.println("Contains substring 'Java': " + containsJava);

        String withoutJava = input.substring(0, input.indexOf("Java")) + input.substring(input.indexOf("Java") + "Java".length());
        System.out.println("String without 'Java': " + withoutJava);

        String replacedString = input.replace('a', 'o');
        System.out.println("String with 'a' replaced by 'o': " + replacedString);

        String upperCaseString = input.toUpperCase();
        System.out.println("Uppercased string: " + upperCaseString);

        String lowerCaseString = input.toLowerCase();
        System.out.println("Lowercased string: " + lowerCaseString);
    }
}

