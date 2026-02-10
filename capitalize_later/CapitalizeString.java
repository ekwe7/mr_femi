public class CapitalizeString {
    public String capitalize(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        String[] words = str.split(" ");
        String text = "";
        for (String word : words) {
            if (word.length() > 0) {
                text += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
            }
        }
        return text.trim();
    }

    public static void main(String[] args) {
        String[] words = {"this is a tree"};
        CapitalizeString capitalizeString = new CapitalizeString();
        System.out.println(capitalizeString.capitalize(words[0]));
    }
}
