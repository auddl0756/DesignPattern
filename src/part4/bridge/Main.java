package part4.bridge;

public class Main {
    public static void main(String[] args) {
        Displays d1 = new Displays(new StringDisplayImpl("hello world"));
        Displays d2 = new CountDisplay(new StringDisplayImpl("bye world"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("ohio world"));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(3);

        RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("goodtentak world"));
        d4.randomDisplay(3);

        /*
         * 기능의 클래스 계층 vs 구현의 클래스 계층 ?
         *
         * <역할들>
         * 1. 기능의 클래스 계층 :: 기능의 확장 (거의 템플릿 메서드 패턴에 가깝다. 틀 정도만 있고 실질적인 구현은 없다.)
         *  - 기본 기능 클래스 (Dispalys)
         *  - 기본 클래스에 기능을 추가한 클래스 (CountDisplay,RandomDisplay)
         *
         * 2. 구현의 클래스 계층 :: 구체적인,실질적인 구현
         *  - 기본 추상 클래스/인터페이스 (DisplayImpl)
         *  - 인터페이스를 구현한 클래스 (StringDisplayImpl)
         *
         *  유용한것은 둘째치고 코드 구성을 되게 신기하게 한다는 생각이 먼저 든다.
         *  "기능 계층"과 "구현 계층"이 분리되어 있는 건 인지했다.
         *  굳이 이렇게 해야만 하는가? 번거로운 느낌이 드는게 사실이다.
         *
         *  아직 적용하기 힘들 것 같다.
         *
         * */
    }
}
