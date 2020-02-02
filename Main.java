interface I{
  default void m1(){
    System.out.println("default implementation within interface I");
  }
}

class Main implements I {

  public void m1(){
    System.out.println("default implementation within implementation class Main");
  }
  public static void main(String[] args) {

    Main m = new Main();
    m.m1();
    System.out.println("Hello world!");
  }
}