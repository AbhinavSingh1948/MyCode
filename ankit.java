abstract class Animal {
     abstract void show();
}

class Dog extends Animal {
     void show() {
        System.out.println("heheheehhe");
    }
}

class Cat extends Animal {
     void show() {
        System.out.println("hahhahahahaha");
    }
}

 class ankit {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.show();
        cat.show();
    }
}