class Liquid {}
class Juice extends Liquid {}
class FruitJuice extends Juice {}
class OrangeJuice extends FruitJuice {}

class Glass<T> {
  T object;
}

class Test {
  static <E> void test1(Glass<? super E> glass) {}
  static <E> void test2(Glass<? extends E> glass) {}
  static <E> void test3(Glass<E> glass) {}
}

class Main {
  public static void main(String[] args) {
    Test.<FruitJuice>test1(new Glass<Juice>());
    Test.<FruitJuice>test2(new Glass<OrangeJuice>());
    // Test.<FruitJuice>test3(new Glass<OrangeJuice>()); // this will give error
  }
}
