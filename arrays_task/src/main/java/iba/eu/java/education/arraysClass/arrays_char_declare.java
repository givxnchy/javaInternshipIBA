package iba.eu.java.education.arraysClass;

public class arrays_char_declare {
    public static void main(String[] args) {
        String[] strArr = { "HELLO", "WORLD" };
        char[][] char2D = new char[strArr.length][];

        for (int i = 0; i < strArr.length; i++) {
            char2D[i] = strArr[i].toCharArray();
        }

        for (char[] char1D : char2D) {
            for (char c : char1D)
                System.out.print(c + " ");

            System.out.println();
        }
    }
}
