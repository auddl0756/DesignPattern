package part3.singleton.ex2;

public class TicketMaker {
    private static TicketMaker singletonTicketMaker = new TicketMaker();
    private int ticketNumber = 1;

    private TicketMaker(){
    }

    public static TicketMaker getTicketMaker(){
        return singletonTicketMaker;
    }

    public synchronized int getTicketNumber(){
        return ticketNumber++;
    }
}
