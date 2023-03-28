package iba.eu.java.education.arraysClass;

public class arrays_char_assign {
    public static void main(String[] args) {
        String[] strArr = {};
        char[][] char2D = new char[3][];

        for (int i = 0; i < strArr.length; i++) {
            char2D[i] = strArr[i].toCharArray();
        }

        char2D[0] = "Hello".toCharArray();
        char2D[1] = "My name is".toCharArray();
        char2D[2] = "Pasha".toCharArray();

        for (char[] char1D : char2D) {
            for (char c : char1D)
                System.out.print(c + " ");

            System.out.println();
        }
    }
}
