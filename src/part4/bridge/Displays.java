package part4.bridge;

public class Displays {
    private DisplayImpl displayImpl;

    public Displays(DisplayImpl displayImpl){
        this.displayImpl = displayImpl;
    }

    public void open(){
        displayImpl.rawOpen();
    }

    public void print(){
        displayImpl.rawPrint();
    }

    public void close(){
        displayImpl.rawClose();
    }

    public final void display(){
        open();
        print();
        close();
    }
}
