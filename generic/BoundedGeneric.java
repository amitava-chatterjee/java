import static java.lang.System.out;

class EatableLiquid {
  public String getTaste() {
    return null;
  }
}

class Water extends EatableLiquid {
}

class Juice extends EatableLiquid {
  @Override
  public String getTaste() {
    return "sweet";
  }
}

class Petrol {
}

class Glass<L extends EatableLiquid> {
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

// class Taste<T> {
class Taste {
  public static <L extends EatableLiquid> String getEatableLiquidTaste(L eatableLiquid) {
    return eatableLiquid.getTaste();
  }
}

class Main {
  public static void main(String[] args) {
    Water water = new Water();
    Juice juice = new Juice();
    Glass<Water> waterGlass = new Glass<>();
    Glass<Juice> juiceGlass = new Glass<>();
    // Glass<Petrol> petrolGlass = new Glass<>();
    juiceGlass.setEatableLiquid(juice);
    waterGlass.setEatableLiquid(water);
    out.println(juiceGlass.getEatableLiquidTaste());
    out.println(waterGlass.getEatableLiquidTaste());
    out.println("Taste is " + Taste.getEatableLiquidTaste(new Juice()));
  }
}
