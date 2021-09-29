package part3.singleton.ex1;

public class Main {
    public static void main(String[] args) {
        //Singleton object1 = new Singleton();  // <- this makes error. because constructor has private access

        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();

        System.out.println(object1 == object2); //must be true

    }
}
