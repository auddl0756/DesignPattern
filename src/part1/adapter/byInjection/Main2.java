package part1.adapter.byInjection;

import part1.adapter.Info;

public class Main2 {
    public static void main(String[] args) {
        Info info = new Info("leemr",30,"skateboard","developer",500);
        Printer2 printer = new InfoPrinter2(info);

        printer.printPersonal();
        printer.printBusiness();

    }
}
