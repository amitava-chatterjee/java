import static java.lang.System.out;

class Juice {
}

class Water {
}

class Cocktail<J, W> {
  J juice;
  W water;

  Cocktail(J juice, W water) {
    this.juice = juice;
    this.water = water;
  }

  @Override
  public String toString() {
    return "Cocktail [" + juice + ", " + water + "]";
  }
}

class Bartender {
  <J, W> Cocktail<J, W> makeCocktail(J juice, W water) {
    return new Cocktail<>(juice, water);
  }

  <J, W> void mix(J juice, W water) {
    out.println("Mixing [" + juice + ", " + water + "]");
  }

  static <J, W> Cocktail<J, W> giveCocktail(J juice, W water) {
    return new Cocktail<>(juice, water);
  }
}

class Main {
  public static void main(String args[]) {
    Juice juice = new Juice();
    Water water = new Water();
    Cocktail<Juice, Water> cocktail;
    Bartender bartender = new Bartender();

    cocktail = bartender.<Juice, Water>makeCocktail(juice, water);
    out.println(cocktail);
    cocktail = bartender.makeCocktail(juice, water); // type inference
    out.println(cocktail);
    cocktail = Bartender.giveCocktail(juice, water);
    out.println(cocktail);
    bartender.mix(juice, water);
    bartender.mix(juice, juice); // cz absence of type
    bartender.<Juice, Water>mix(juice, water);
    // bartender.<Juice, Water>mix(juice, juice); // it will give error
  }
}
