package java_programs_practice_062024;

//Abstraction through interface
interface Animal {
 void makeSound();
}

//Concrete implementation
class Dog implements Animal {
 // Encapsulation of the name attribute
 private String name;

 // Getter and setter methods for encapsulation
 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 // Implementation of the abstracted method
 public void makeSound() {
     System.out.println("Bark");
 }
}