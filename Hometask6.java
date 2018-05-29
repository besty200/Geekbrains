/**
 * Java 1. Hometask 6.
 * @author Anton Lipin
 * @version created on 24.05.2018
 */

public class Hometask6 {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Barsik", 10, 1, 1);
        cat1.Run();
        cat1.Swim();
        cat1.Jump();
        Animal cat2 = new Cat();
        cat2.Run(200);
        cat2.Swim(0);
        cat2.Jump(2);
        Animal dog1 = new Dog("Jack", 401, 10, 0.4, 400);
        dog1.Run();
        dog1.Swim();
        dog1.Jump();
        Animal dog3 = new Dog("Bobik", 599, 20, 0.7, 600);
        dog3.Run();
        dog3.Swim();
        dog3.Jump();
        Animal dog2 = new Dog();
        dog2.Run(499);
        dog2.Swim(10000);
        dog2.Jump(0.6);
    }
}
    abstract class Animal {
        protected String name;
        protected double dist_r;
        protected double dist_s;
        protected double height;
        protected boolean s = false;
        protected int barrier=400;

        public Animal(){
        }

        public Animal(String name, double dist_r, double dist_s, double height, int barrier){
        this.name = name;
        this.dist_r = dist_r;
        this.dist_s = dist_s;
        this.height = height;
        this.barrier = barrier;
        }

        public Animal(String name, double dist_r, double dist_s, double height){
            this.name = name;
            this.dist_r = dist_r;
            this.dist_s = dist_s;
            this.height = height;
            this.barrier = barrier;
        }

        public abstract void Run();
        public abstract void Run(double dist_r);
        public abstract void Swim();
        public abstract void Swim(double dist_s);
        public abstract void Jump();
        public abstract void Jump(double height);
    }

    class Cat extends Animal{

        public Cat(String name, double dist_r, double dist_s, double height){
            super(name,dist_r,dist_s,height);

            System.out.println("Кот "+this.name + " /Дистанция бега: " + this.dist_r+ " /Дистанция заплыва: "+ this.dist_s + " /Высота прыжка: "+this.height);
        }

        public Cat(){
            System.out.println(this.toString());
        }

        @Override
        public void Run() {
            if (dist_r < 200)
                s = true;
            else
                s=false;
            System.out.println("run: " + s);
        }
        @Override
        public void Run(double dist_r) {
            if (dist_r < 200)
                s = true;
            else
                s=false;
            System.out.println("run: " + s);
        }

        @Override
        public void Swim(){
            if (dist_s == 0)
                s = true;
            else
                s=false;
            System.out.println("swim: " + s);
        }

        @Override
        public void Swim( double dist_s){
            if (dist_s == 0)
                s = true;
            else
                s=false;
            System.out.println("swim: " + s);
        }

        @Override
        public void Jump(){
            if (height < 2)
                s = true;
            else
                s=false;
            System.out.println("jump: " + s);
        }

        @Override
        public void Jump(double height){
            if (height < 2)
                s = true;
            else
                s=false;
            System.out.println("jump: " + s);
        }

        @Override
        public String toString() {
            return "Произвольная кошка без параметров";
        }
    }

    class Dog extends Animal{

        public Dog(String name, double dist_r, double dist_s, double height, int barrier){
           super(name,dist_r,dist_s,height, barrier);

            System.out.println("Собака "+this.name + " /Дистанция бега: " + this.dist_r+ " /Дистанция заплыва: "+ this.dist_s + " /Высота прыжка: "+this.height + " /Ограничение дистанции: "+this.barrier);
        }

        public Dog(){
            System.out.println(this.toString());
        }

        @Override
        public void Run(){
            if (this.dist_r < this.barrier)
                s = true;
            else
                s=false;
            System.out.println("run: " + s);
        }

        @Override
        public void Run(double dist_r){
            if (dist_r < 500)
                s = true;
            else
                s=false;
            System.out.println("run: " + s);
        }

        @Override
        public void Swim(){
            if (dist_s < 10)
                s = true;
            else
                s=false;
            System.out.println("swim: " + s);
        }

        @Override
        public void Swim(double dist_s){
            if (dist_s < 10)
                s = true;
            else
                s=false;
            System.out.println("swim: " + s);
        }

        @Override
        public void Jump() {
            if (height < 0.5)
                s = true;
            else
                s=false;
            System.out.println("jump: " + s);
        }

        @Override
        public void Jump(double a) {
            if (a < 0.5)
            s = true;
            else
                s=false;
            System.out.println("jump: " + s);
        }

        @Override
        public String toString() {
            return "Произвольная собака без параметров";
        }
    }
