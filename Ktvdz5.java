import java.util.Scanner;

public class Ktvdz5 {
    public static void main(String[] args) {
        System.out.print("Введите переменную число календаря ");
        Scanner sr = new Scanner(System.in);
        int day = sr.nextInt();
            if ((day > 0) && (day < 32)) {
                if (day < 11)
                    System.out.print("Заданная дата относится к первой декаде месяца");
                else if (day < 21)
                    System.out.print("Заданная дата относится ко второй декаде месяца ");
                else if (day < 32)
                    System.out.print("Заданная дата относится к третьей декаде месяца ");
        }
        else
            System.out.print("Задайте значение от 1 до 31 ");
            }
    }
