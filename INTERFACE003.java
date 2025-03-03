interface TacoBox {
  int tacoRemaining();

  void eat();
}

class TripleTacoBox implements TacoBox {
  private int tacos = 3;

  public int tacoRemaining() {
    return this.tacos;
  }

  public void eat() {
    if (this.tacos >= 1)
      this.tacos--;
  }

}

class CustomTacoBox implements TacoBox {
  private int tacos;

  public CustomTacoBox(int tacos) {
    this.tacos = tacos;
  }

  public int tacoRemaining() {
    return this.tacos;
  }

  public void eat() {
    if (this.tacos >= 1)
      this.tacos--;
  }
}

public class INTERFACE003 {
  public static void main(String[] args) {
    TripleTacoBox box1 = new TripleTacoBox();
    box1.eat();
    box1.eat();
    System.out.printf("Triple taco boxes left: %d\n", box1.tacoRemaining());
    CustomTacoBox box2 = new CustomTacoBox(8);
    box2.eat();
    System.out.printf("Custom taco boxes left: %d", box2.tacoRemaining());
  }
}
