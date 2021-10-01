package part3.builder;

public class TextBuilder extends Builder{
    private static int bodyElementCounter = 1;

    @Override
    public void makeTitle(String title) {
        System.out.println("=== " + title + " ===");
    }

    @Override
    public synchronized void makeBody(String body) {
        System.out.print((bodyElementCounter++)+". ");
        System.out.println("\""+body+"\"");
    }

    @Override
    public void makeItems(String[] items) {
        for(String item: items){
            System.out.println("   - "+item);
        }
    }

    @Override
    public void close() {
        System.out.println("=== END ===\n");
    }
}
