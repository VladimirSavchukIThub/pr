package ru.proglib;
// запускать ru.proglib.Animal
public class Animal {
    int voice;
    int speed;
    int countOfPaws;
    public Animal(int speed,int countOfPaws,int voice){
        this.speed = speed;
        this.countOfPaws = countOfPaws;
        this.voice = voice;
        System.out.println("Объект готов");
    }
    void sound(){
        if(voice % 2 == 0){
            System.out.println("Лает");
        }
        else{
            System.out.println("Молчит");
        }
    }
    void count(){
        System.out.println(countOfPaws);
    }
    void start(){
        System.out.println("Начинает бежать");
        System.out.println("Скорость: " + speed);
    }
    void stop(){
        System.out.println("Останавливается");
        System.out.println("Скорость была " + speed);
    }
    public static void main(String[] args) {
        var myAn = new Animal(15,4, 2);
        myAn.start();
        myAn.stop();
        System.out.print("Кол-во лап:");
        myAn.count();
        myAn.sound();
    }
}
