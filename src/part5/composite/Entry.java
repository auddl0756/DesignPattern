package part5.composite;

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    public void printList(){
        printList("",0);
    }

    protected abstract void printList(String prefix);
    protected abstract void printList(String prefix,int depth);

    @Override
    public String toString() {
        return getName()+" "+getSize();
    }
}
