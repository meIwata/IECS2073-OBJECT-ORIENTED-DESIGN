package java1201;

class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() { // Override 覆寫了父類別的方法，如果沒有覆寫父類別方法，當呼叫makeSound()就會叫父類別做
        System.out.println("Bark");
    }
}

public class MyAnimal {
    public static void main(String[] args) {
        Animal myPet = new Dog(); // 多型：父類別的參考指向子類別的物件
        myPet.makeSound(); // 呼叫的是子類別的makeSound()方法
    }
}
