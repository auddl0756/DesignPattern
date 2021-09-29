package part3.singleton.ex1;

public class Singleton {
    private static Singleton singleton  = new Singleton();  //initialized only once when class is loaded.

    private Singleton(){    //private.
        System.out.println("인스턴스를 생성했습니다?");
    }

    public static Singleton getInstance(){  //static
        return singleton;
    }
}
