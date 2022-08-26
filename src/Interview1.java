public class Interview1 {

    public static void main(String[] args) {
        int startIndex = 0;


        String s = " My name is Andrei";
        int countOfWords = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == ' ') && (i != 0) && (i != s.length() - 1)) {
                countOfWords++;
            }
        }
        countOfWords++;

        String[] array = new String[countOfWords];
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (i == 0) {
                    startIndex = 1;
                } else {
                    array[index++] = s.substring(startIndex, i);
                    startIndex = i + 1;
                }
            }

            if (i == s.length() - 1) {
                array[index++] = s.substring(startIndex, i + 1);
            }
        }

        for (String string: array) {
            System.out.println(string);
        }
    }
}
