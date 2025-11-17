package java1117;

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("小狗汪汪叫");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("小猫喵喵叫");
    }
}

abstract class Cow extends Animal {
//    @Override
//    public void makeSound() {
//        System.out.println("小牛哞哞叫");
//    }
    public abstract void makeSound();
}

public abstract class Animal {
    //    public void makeSound() {
//        System.out.println("Animal is making a sound");
//    }
    public abstract void makeSound(); // 有抽象方法，那這個類別必須是抽象類別

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound(); // 输出: 小狗汪汪叫
        cat.makeSound(); // 输出: 小猫喵喵叫

//        Animal animal = new Animal(); // 抽象類別不能被new
    }
}