import java.util.ArrayList;

// Lớp trừu tượng Animal
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public void makeSound();
}

// Interface bơi
interface Swimable {
    public void swim();
}

// Interface bay
interface Flyable {
    public void fly();
}

// Lớp Dog
class Dog extends Animal implements Swimable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Gâu gâu!");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming");
    }
}

// Lớp Eagle
class Eagle extends Animal implements Flyable {
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Chíp chíp");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}

// Lớp Dolphin
class Dolphin extends Animal implements Swimable {
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Kích kích!");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming");
    }
}

// Lớp Zoo
class Zoo {
    ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void makeAllSounds() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

// Main
public class baivenha {
    public static void main(String[] args) {
        Zoo x = new Zoo();
        x.addAnimal(new Dog("Chó"));
        x.addAnimal(new Eagle("Đại bàng"));
        x.addAnimal(new Dolphin("Cá heo"));
        x.makeAllSounds();
        for(Animal animal:x.animals){
            if(animal instanceof Swimable){
                ((Swimable)animal).swim();
            }
            if(animal instanceof Flyable){
                ((Flyable)animal).fly();
            }
        }
    }
}
