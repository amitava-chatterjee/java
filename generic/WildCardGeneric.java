import static java.lang.System.out;

class Glass<L> {
  public L liquid;
  public Glass() {}
  public Glass(L liquid) { this.liquid = liquid; }
}

class Tray {
  public void checkWildCard(Glass<?> glass) {
    out.println(glass);
    out.println(glass.liquid);

    if (glass.liquid != null) {
      out.println(glass.liquid.getClass());
      out.println(glass.liquid.getClass().getSimpleName());
    }
  }

  public <T> void check(Glass<T> glass) {
    out.println(glass);
    out.println(glass.liquid);

    if (glass.liquid != null) {
      out.println(glass.liquid.getClass());
      out.println(glass.liquid.getClass().getSimpleName());
    }
  }
}

class Main {
  public static void main(String[] args) {
    Tray tray = new Tray();
    tray.check(new Glass<>());
    tray.checkWildCard(new Glass<>());
    tray.check(new Glass<>("Mayonnaise"));
    tray.checkWildCard(new Glass<>(123L));
    Glass<?> glass;
    Glass<? extends Object> demo = new Glass<>();
    out.println("demo is: " + demo);
    glass = new Glass<>(new StringBuffer("Utsav"));
    out.println(glass + ": " + glass.liquid + " -> " + glass.liquid.getClass().getName());
  }
}
