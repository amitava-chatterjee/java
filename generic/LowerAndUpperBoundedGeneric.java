import static java.lang.System.out;

class Coke {}
class CokeZero extends Coke {}
class CokeDiet extends CokeZero {}
class CokeGreen extends CokeDiet {}
class CokeFreeze extends CokeGreen {}

class Glass<T> {}

class Tray {
  public void check1(Glass<? super CokeDiet> glass) {
    out.println("super: It's working");
  }

  public void check2(Glass<? extends CokeDiet> glass) {
    out.println("extends: It's working");
  }
}

class Main {
  public static void main(String[] args) {
    new Tray().check1(new Glass<Coke>());
    new Tray().check2(new Glass<CokeGreen>());
  }
}
