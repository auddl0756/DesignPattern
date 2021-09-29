package part3.singleton.ex2;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        TicketMaker ticketMaker = TicketMaker.getTicketMaker();
        int[] count = new int[31];
        IntStream.rangeClosed(1,30).parallel().forEach(x->{
            count[ticketMaker.getTicketNumber()]++;
        });

        for(int ticketNumber=1;ticketNumber<=30;ticketNumber++){
            System.out.print(count[ticketNumber]+" ");
        }
        System.out.println();
    }
}
