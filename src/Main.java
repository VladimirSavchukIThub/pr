import ru.proglib.Animal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Введите скорость: ");
        int a = myObj.nextInt();
        System.out.println("Введите количество лап: ");
        int b = myObj.nextInt();
        System.out.println("Введите любое число: ");
        int c = myObj.nextInt();
        var myAn = new Animal(a,b, c);
        myAn.start();
        myAn.stop();
        System.out.print("Кол-во лап:");
        myAn.count();
        myAn.sound();
    }
}
