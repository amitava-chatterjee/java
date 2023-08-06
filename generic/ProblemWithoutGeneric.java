import static java.lang.System.out;

class Glass {
  private Object object;

  Object getObject() {
    return object;
  }

  void setObject(Object object) {
    this.object = object;
  }
}

class Juice {
}

class Main {
  public static void main(String args[]) {
    Glass glass = new Glass();
    Juice juice = new Juice();
    glass.setObject(juice); // doesn't make proper sense

    // retrieval is making problem
    Juice juiceFromGlass = (Juice) glass.getObject();
    out.println(juiceFromGlass);
  }
}
