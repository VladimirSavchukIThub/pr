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
    public void sound(){
        if(voice % 2 == 0){
            System.out.println("Лает");
        }
        else{
            System.out.println("Молчит");
        }
    }
    public void count(){
        System.out.println(countOfPaws);
    }
    public void start(){
        System.out.println("Начинает бежать");
        System.out.println("Скорость: " + speed);
    }
    public void stop(){
        System.out.println("Останавливается");
        System.out.println("Скорость была " + speed);
    }
}
