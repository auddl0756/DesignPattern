package part4.bridge;

public class RandomDisplay extends Displays {
    public RandomDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void randomDisplay(int times) {
        int randomNumber = (int) (Math.random() * times);

        open();
        for (int i = 0; i < randomNumber; i++) {
            print();
        }
        close();

    }
}
