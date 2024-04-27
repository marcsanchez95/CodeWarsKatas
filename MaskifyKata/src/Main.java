public class Main {
    public static void main(String[] args) {
        String str = "586695845525";
        String result = maskify(str);
        System.out.println(result);
    }

    public static String maskify(String str) {

        StringBuilder replaced = new StringBuilder(str);
        for (int i = 0; i < replaced.length() - 4; i++) {
            replaced.setCharAt(i, '#');
        }

        String strModified = replaced.toString();


        return strModified;
    }
}

