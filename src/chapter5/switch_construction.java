package chapter5;

public class switch_construction {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++)
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i м е н ь ш е 5.");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(" i меньше 10.");
                    break;
                default:
                    System.out.println(" i больше или ра в н о 10.");


            }
    }
    }