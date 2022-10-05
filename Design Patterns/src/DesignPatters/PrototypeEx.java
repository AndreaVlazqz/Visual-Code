package DesignPatters;

 interface Prototype{
    public Prototype doClone();
}
 class Person implements Prototype{
    String name;
    public Person (String name){
        this.name = name;
    }
    public Prototype doClone(){
        return new Person(name);
    }
    public String toString(){
        return "This person is named" + name;
    }
}
 class Dog implements Prototype{
    String sound;
    public Dog (String sound){
        this.sound = sound;
    }
    public Prototype doClone(){
        return new Dog(sound);
    }
    public String toString(){
        return "The dog says" + sound;
    }
}

public class PrototypeEx {
    public static void main(String[] args){
        Person person1 = new Person("Fred");
        System.out.println("person1:" + person1);
        Person person2 = (Person) person1.doClone();
        System.out.println("person2:" + person2);

        Dog dog1 = new Dog("Wooof!");
        System.out.println("dog 1:" + dog1);
        Dog dog2 = (Dog) dog1.doClone();
        System.out.println("dog 2:" + dog2);
    }
}
