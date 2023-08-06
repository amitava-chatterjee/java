import static java.lang.System.out;

interface Bogus {
}

interface Fluid {
}

class EatableLiquid {
  public String getTaste() {
    return null;
  }
}

class Water extends EatableLiquid implements Fluid, Bogus {
}

class Juice extends EatableLiquid implements Fluid, Bogus {
  @Override
  public String getTaste() {
    return "sweet";
  }
}

class Soda extends EatableLiquid implements Fluid {
  @Override
  public String getTaste() {
    return "neutral";
  }
}

class Petrol implements Fluid, Bogus {
}

class Glass<L extends EatableLiquid & Fluid & Bogus> {
  L eatableLiquid;

  L getEatableLiquid() {
    return eatableLiquid;
  }

  void setEatableLiquid(L eatableLiquid) {
    this.eatableLiquid = eatableLiquid;
  }

  String getEatableLiquidTaste() {
    return eatableLiquid.getTaste();
  }
}

class Taste {
  public static <L extends EatableLiquid & Fluid> String getEatableLiquidTaste(L eatableLiquid) {
    return eatableLiquid.getTaste();
  }
}

class Main {
  public static void main(String[] args) {
    Water water = new Water();
    Juice juice = new Juice();
    Glass<Water> waterGlass = new Glass<>();
    Glass<Juice> juiceGlass = new Glass<>();
    // Glass<Soda> sodaGlass = new Glass<>();
    // Glass<Petrol> petrolGlass = new Glass<>();
    juiceGlass.setEatableLiquid(juice);
    waterGlass.setEatableLiquid(water);
    out.println(juiceGlass.getEatableLiquidTaste());
    out.println(waterGlass.getEatableLiquidTaste());
    out.println("Taste is " + Taste.getEatableLiquidTaste(new Soda()));
    out.println("Taste is " + Taste.getEatableLiquidTaste(new Juice()));
    out.println("Taste is " + Taste.getEatableLiquidTaste(new Water()));
    // out.println("Taste is " + Taste.getEatableLiquidTaste(new Petrol()));
  }
}
