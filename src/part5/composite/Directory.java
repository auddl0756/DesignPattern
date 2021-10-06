package part5.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> entries = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (Entry entry : entries) {
            totalSize += entry.getSize();
        }
        return totalSize;
    }

    @Override
    public Entry add(Entry entry) throws FileTreatmentException {
        entries.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this.toString());
        for (Entry entry : entries) {
            entry.printList(prefix + "/" + name);
        }
    }

    @Override
    protected void printList(String prefix, int depth) {
        System.out.println(prefix + "/" + this.toString());
        for (Entry entry : entries) {
            entry.printList(" "+prefix + "/" + name, depth + 1);
        }
    }
}
