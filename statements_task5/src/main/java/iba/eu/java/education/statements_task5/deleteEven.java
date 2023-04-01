package iba.eu.java.education.statements_task5;

public class deleteEven {
    static void deleteEvenDigits(int n) {
        String s = Integer.toString(n);
        String res = "";
        if (n == 0 || n == 2 || n == 4 || n == 6 || n == 8){
            System.out.print("0");
        }
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '1' || s.charAt(i) == '3'
                    || s.charAt(i) == '5' || s.charAt(i) == '7'
                    || s.charAt(i) == '9')
                res += s.charAt(i);
        }
            System.out.print(res);
    }
}
