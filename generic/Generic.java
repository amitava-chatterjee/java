/*
Why do we need Generics
1. Introduces strong type checking
2. Eliminates explicit casting
3. Enables to design more generic algorithms
*/

import static java.lang.System.out;

class Glass<T> {
  private T liquid;

  T getLiquid() {
    return liquid;
  }

  void setLiquid(T liquid) {
    this.liquid = liquid;
  }
}

class Juice {
}

class Water {
}

class Main {
  public static void main(String args[]) {
    Glass<Juice> juiceGlass = new Glass<>(); // R.H.S. is type inference
    Glass<Water> waterGlass = new Glass<>();
    Juice juice = new Juice();
    Water water = new Water();
    juiceGlass.setLiquid(juice);
    waterGlass.setLiquid(water);

    // retrieval
    Juice juiceFromGlass = juiceGlass.getLiquid();
    Water waterFromGlass = waterGlass.getLiquid();
    out.println(juiceFromGlass);
    out.println(waterFromGlass);
  }
}
