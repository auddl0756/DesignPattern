package part1.adapter.byExtends;

public class Main {
    public static void main(String[] args) {
        Printer print = new InfoPrinter("leemr",30,"skateboard","developer",500);

        print.printPersonal();
        print.printBusiness();
    }
}

/*
* 상황 : 여러 속성값들의 정보를 제공하는 Info 클래스에서 일부 정보만 골라서 출력하고 싶은 상황
*
* Info : 여러 속성들, getter가 있는 클래스
* Printer : 유의미한 정보를 출력하는 메서드 스펙을 제공하는 인터페이스
* InfoPrinter : Info를 상속받아서 Info의 메서드들을 이용하여 Printer의 스펙에 명시 되어 있는 메서드를 구현.
*
* 언제 유용한지 : Info라는 클래스가 매우 안전하다고 검증된 클래스라면...
*                Printer의 기능을 구현하기 위해
*                Info를 최대한 활용해서 InfoPrinter라는 어댑터를 만들어 사용할 수 있다.
*                그러면 Info로 인해 신뢰성이 올라가고, 문제가 발생해도 어댑터 위주로 검사하면 된다.
*                ........
*                하지만 인터페이스를 두면 코드의 양이 증가한다. 항상 이렇게 하는건 비효율적일 것이다.
* */
