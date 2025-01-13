package Workshop3;

interface RemoteControl {
 void powerOn();
 void powerOff();
}

class TV implements RemoteControl {
 @Override
 public void powerOn() {
     System.out.println("TV is now ON.");
 }

 @Override
 public void powerOff() {
     System.out.println("TV is now OFF.");
 }
}

class AC implements RemoteControl {
 @Override
 public void powerOn() {
     System.out.println("AC is now ON.");
 }

 @Override
 public void powerOff() {
     System.out.println("AC is now OFF.");
 }
}

public class Task6{
 public static void main(String[] args) {
     RemoteControl tvRemote = new TV();
     RemoteControl acRemote = new AC();

     System.out.println("Using TV Remote:");
     tvRemote.powerOn();
     tvRemote.powerOff();

     System.out.println("\nUsing AC Remote:");
     acRemote.powerOn();
     acRemote.powerOff();
 }
}

