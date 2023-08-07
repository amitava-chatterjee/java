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

class Person implements A {
  @Override
  public void test() {
    out.println(this.getClass() + ": test()");
  }
}

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

    // A a4 = (Person) new Human();
    // a4.test();
  }
}
