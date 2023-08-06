interface Liquid {}
class Juice implements Liquid {}
class OrangeJuice extends Juice {}
class Glass<T> {}
class WineGlass<T> extends Glass<T> {}

class Main {
  public static void main(String[] args) {
    Liquid liquid = new Juice();
    Juice orangeJuice = new OrangeJuice();
    Glass<Liquid> glass = new WineGlass<Liquid>();
    Glass<OrangeJuice> orangeJuiceGlass = new WineGlass<>();
    // Glass<Juice> juiceGlass = new WineGlass<OrangeJuice>();
    // @line(13) will give an error cz Glass<OrangeJuice> and WineGlass<Juice> is different element
  }
}
