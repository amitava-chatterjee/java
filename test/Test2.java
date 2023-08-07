import static java.lang.System.out;

interface A {
  void test();
}

class Human implements A {
  @Override
  public void test() {
    out.println(this.getClass() + ": test()");
  }
}

class Person extends Human {}

class Main {
  public static void main(String[] args) {
    A a1 = new A() {
      @Override
      public void test() {
        out.println(this.getClass() + ": test()");
      }
    };

    A a2 = new Human();
    A a3 = new Person();

    a1.test();
    a2.test();
    a3.test();

    Human a4 = new Person();
    a4.test();

    // Human a4 = (A) new Person();
    // a4.test();
  }
}
