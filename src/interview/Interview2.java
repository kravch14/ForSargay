package interview;

public class Interview2 {

    public static void main(String[] args) {
        String s = " My name is Andrei";
        int countOfWords = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == ' ') && (i != 0) && (i != s.length() - 1)) {
                countOfWords++;
            }
        }
        countOfWords++;

        String[] arr = new String[countOfWords];
        StringBuilder sb = new StringBuilder();
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
                if(i == s.length() - 1) {
                    arr[j++] = sb.toString();
                }
            } else if ((s.charAt(i) == ' ' && i != 0) || (i == (s.length() - 1))) {
                arr[j++] = sb.toString();
                sb = new StringBuilder();
            }
        }

        for (String string: arr) {
            System.out.println(string);
        }

        System.out.println(arr);
        
    }
}
