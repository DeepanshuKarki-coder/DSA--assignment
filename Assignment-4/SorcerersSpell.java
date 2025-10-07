public class SorcerersSpell {
    public static void main(String[] args) {
        String text = "abc";
        String reversed = reverseString(text);
        System.out.println(reversed);
    }
    public static String reverseString(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}