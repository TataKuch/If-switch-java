import java.util.Scanner;
public class Ktvdz4 {
    public static void main(String[] args) {
        System.out.print("Введите целые число для переменных X и Y-> ");
        Scanner sr = new Scanner(System.in);
        int x = sr.nextInt();
        int y = sr.nextInt();
        boolean IsEvenX;
        boolean IsEvenY;
        if (x % 2 == 0) IsEvenX = true;
            else IsEvenX = false;
        if (y % 2 == 0) IsEvenY = true;
            else IsEvenY = false;
            // if ( (x % 2 == 0) == (y % 2 == 0) ) решение вариант 2
            // if ( ( x + y ) % 2 == 0 ) решение вариант 3
        if (IsEvenX == IsEvenY)
                System.out.println("Удачное совпадение ");
    }
}