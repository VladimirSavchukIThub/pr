import ru.proglib.Animal;

public class Main {
    public static void main(String[] args) {
        var myAn = new Animal(15,4, 2);
        myAn.start();
        myAn.stop();
        System.out.print("Кол-во лап:");
        myAn.count();
        myAn.sound();
    }
}
