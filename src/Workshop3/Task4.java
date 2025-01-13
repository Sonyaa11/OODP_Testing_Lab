package Workshop3;

abstract class GameCharacter {
 String name;

 public GameCharacter(String name) {
     this.name = name;
 }

 abstract void attack();
 abstract void defend();
}

class Warrior extends GameCharacter {
 public Warrior(String name) {
     super(name);
 }

 @Override
 void attack() {
     System.out.println(name + " attacks with a mighty sword swing!");
 }

 @Override
 void defend() {
     System.out.println(name + " defends with a large shield.");
 }
}
class Archer extends GameCharacter {
 public Archer(String name) {
     super(name);
 }

 @Override
 void attack() {
     System.out.println(name + " attacks with a precise arrow shot!");
 }

 @Override
 void defend() {
     System.out.println(name + " defends by dodging swiftly.");
 }
}

public class Task4 {
 public static void main(String[] args) {
     
     GameCharacter warrior = new Warrior("Thor");
     GameCharacter archer = new Archer("Legolas");

     System.out.println("Warrior Actions:");
     warrior.attack();
     warrior.defend();

     System.out.println("\nArcher Actions:");
     archer.attack();
     archer.defend();
 }
}
