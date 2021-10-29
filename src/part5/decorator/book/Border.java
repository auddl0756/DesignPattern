package part5.decorator.book;

public abstract class Border extends Displayer {
    protected Displayer displayer;

    protected Border(Displayer displayer) {
        this.displayer = displayer;
    }
}
