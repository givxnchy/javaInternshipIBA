package iba.eu.java.education.classesTask1;

public class objectsTask {
    private static String nameOf(Object o) {
        return o.getClass().getSimpleName();
    }

    public static void main(String[] args) {
        int i = 0;
        double d = 1.20d;
        char c = 'c';
        System.out.println(nameOf(i));
        System.out.println(nameOf(d));
        System.out.println(nameOf(c));
    }
}
