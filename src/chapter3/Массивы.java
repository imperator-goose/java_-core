package chapter3;

public class Массивы {
    public static void main(String[] args) {
        int[] month_days;
        month_days = new int[13];
        month_days [0] = 0;
        month_days [1] = 31;
        month_days[2] = 28;
        month_days[3] = 31;
        month_days[4] = 30;
        month_days[5] = 31;
        month_days[6] = 30;
        month_days[7] = 31;
        month_days[8] = 31;
        month_days[9] = 30;
        month_days[10] = 31;
        month_days[11] = 30;
        month_days[12] = 31;
        System.out.print("В сентябре "+month_days[11] + " дней.");
    }
}
