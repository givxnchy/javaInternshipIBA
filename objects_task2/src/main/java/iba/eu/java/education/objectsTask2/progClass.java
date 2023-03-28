package iba.eu.java.education.objectsTask2;

public class progClass {
    private int start;
    private int step;
    private int size;
    private int sum = 0;
    private int[] progression;

    public progClass(int start, int step, int size) {
        this.start = start;
        this.step = step;
        this.size = size;
        this.progression = initProgression();
    }

    public progClass(){
        System.out.println("not enough data");
    }

    private int[] initProgression() {
        if(size == 0){
            return new int[]{};
        }
        progression = new int[size];
        int prev = 0;

        for (int i = 0; i < size; i++) {
            if (i == 0) {
                progression[i] = start;
                prev = progression[i];
            } else {
                prev = progression[i - 1];
                progression[i] = prev + step;
                sum = sum + progression[i];
            }
        }
        return progression;
    }
    public int[] getProg(){
        return progression;
    }

    public int getStart() {
        return start;
    }

    public int getStep() {
        return step;
    }

    public int getSize() {
        return size;
    }

    public int getLast(){
        return progression[size-1];
    }

    public int getSum(){
        return sum;
    }
}
