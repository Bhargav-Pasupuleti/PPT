class Animal{
 public void makeSound(){
    System.out.println("The Animal makes a Sound");
 }
}
class Dog extends Animal{
 public void makeSound(){
    System.out.println("The Dog barks");
 }
}
class Cat extends Animal{
    public void makeSound(){
    System.out.println("The Cat meows");
 }
}
class Cow extends Animal{
   public void makeSound(){
    System.out.println("The Cow Moo");
 } 
}

public class b {
    public static void main(String args[]){
Animal animal = new Animal();
   animal.makeSound();
   Animal dog = new Dog();
   dog.makeSound();
   Animal cat = new Cat();
   cat.makeSound();
   Animal cow = new Cow();
   cow.makeSound();
    }
}
