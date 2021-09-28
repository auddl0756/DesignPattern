package part1.adapter.byInjection;

import part1.adapter.Info;

public class InfoPrinter2 extends Printer2{
    private Info info;

    public InfoPrinter2(Info info){
        this.info = info;
    }

    @Override
    public void printPersonal() {
        System.out.println(info.getName()+" "+info.getAge()+" "+info.getHobby());
    }

    @Override
    public void printBusiness() {
        System.out.println(info.getJob()+" "+info.getPay());
    }
}
