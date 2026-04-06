class A implements Runnable {

  public void run() {
    for (int i = 0; i <= 20; i++) {
      System.out.println("Hi");
    }

  }

}

public class Runnable_InterfaceThread {
  public static void main(String[] args) {

    A obj1 = new A();

    Runnable obj2 = () -> {for (int i = 0; i <= 20; i++)System.out.println("Hello");};

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();

    t2.start();

  }

}
