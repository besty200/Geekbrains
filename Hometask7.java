/**
 * Java 1. Hometask 7.
 * @author Anton Lipin
 * @version created on 28.05.2018
 * @link http://github.com/besty200
 */
public class Hometask7 {
    public static void main ( String [] args ) {
        Cat1[] cats = {new Cat1("Barsik", 5, false), new Cat1("Milka", 5, false), new Cat1("Tishka", 205, false),new Cat1("Markiz", 20, false)};
        Plate plate = new Plate(100);
        plate.info();
        for (Cat1 cat : cats) {
            cat.eat(plate);
        }
        plate.info();
        plate.addFood(100);
        plate.info();

    }
}

class Plate{
    private int food;
    public Plate (int food){
        this.food = food ;
    }
    public void info(){
        if (food>=0)
        System.out.println("plate: " + food);
        else
            System.out.println("В тарелке недостаточно еды");
    }
    public void decreaseFood(int n) {
        food -= n ;
    }

    public void addFood(int n){
        System.out.println("Добавляем в тарелку "+n +" единиц еды");
        food +=n;
    }

    public int getFood() {
        return food;
    }
}

class Cat1{
    private String name;
    private int appetite;
    private boolean sit;
    public Cat1(String name, int appetite, boolean sit) {
        this.name = name;
        this.appetite = appetite;
        this.sit=sit;
    }


    public void eat(Plate p) {
        if(appetite<=p.getFood()) {
            sit=true;
            System.out.println(this.toString());
            p.decreaseFood(appetite);
        }
        else
            System.out.println("Котик "+ name +" не может утолить голод и сытость = "+sit);

    }

    @Override
    public String toString() {
        return "Котик "+ name +" покушал еды = " + appetite + " и сытость = "+sit;
    }
}
