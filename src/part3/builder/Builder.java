package part3.builder;

public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeBody(String body);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
