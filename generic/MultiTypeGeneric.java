import static java.lang.System.out;

class Red {
}

class Green {
}

class Blue {
}

class Color<R, G, B> {
  R red;
  G green;
  B blue;

  Color() {}
  Color(R red) { this.red = red; }
  Color(R red, G green) { this.red = red; this.green = green; }
  Color(R red, G green, B blue) { this.red = red; this.green = green; this.blue = blue; }

  @Override
  public String toString() {
    return red + " " + green + " " + blue;
  }
}

class Main {
  public static void main(String args[]) {
    Red red = new Red();
    Green green = new Green();
    Blue blue = new Blue();
    Color<Red, Green, Blue> color1 = new Color<>(red);
    Color<Red, Green, Blue> color2 = new Color<>(red, green);
    Color<Red, Green, Blue> color3 = new Color<>(red, green, blue);
    out.println(color1);
    out.println(color2);
    out.println(color3);
  }
}
