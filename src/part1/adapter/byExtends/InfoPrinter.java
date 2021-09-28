package part1.adapter.byExtends;

import part1.adapter.Info;

//getter들을 사용할 수 있도록 Info를 확장(extends::상속)
//print 기능을 구현하기 위해 Printer를 구현(implements)
public class InfoPrinter extends Info implements Printer {
    public InfoPrinter(String name, int age, String hobby,
                       String job, int pay) {
        super(name, age, hobby, job, pay);
    }

    @Override
    public void printPersonal() {
        System.out.println(getName()+" "+getAge()+" "+getHobby());
    }

    @Override
    public void printBusiness() {
        System.out.println(getJob()+" "+getPay());
    }
}
