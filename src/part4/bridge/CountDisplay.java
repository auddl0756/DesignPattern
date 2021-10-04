package part4.bridge;

public class CountDisplay extends Displays {
    public CountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) print();
        close();
    }
}
