package lessons.lesson_04;

public class Lesson_04 {
    public static void main(String[] args) {
        String str = "I like Java";
        System.out.println(str.charAt(str.length() - 1));
        System.out.println((str.endsWith("!!!")));
        System.out.println((str.startsWith("I like")));
        System.out.println((str.contains("Java")));
        System.out.println(System.lineSeparator());
    }
}
