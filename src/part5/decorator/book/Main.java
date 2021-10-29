package part5.decorator.book;
/*
* <구성 요소 >
*  1. Component(Display) , Concrete Component(StringDisplay)
*   내용물
*
*  2. Decorator(Border), Concrete Decorator(SideBorder,FullBorder)
*   장식 역할을 하는 클래스.
*   Component를 주입 받음.
*
* <첫 인상>
*   이게 뭐하는 건지?
*   다른 디자인들과 비슷한 거 같다. 잘 기억에 안 남는다.
*   Decorator객체가 Component객체를 주입받아서 사용하는 거말고 특별할 게 있나?
*
* <책 설명>
*  장식과 내용물을 동일시 하고 있다고 함. -> 그러고 보니 신기하게 Border가 Displayer의 sub class네
*  장식이 내용물을 감싸고 있어도 인터페이스들(메서드들) 장식에도 다 있음. 이런 걸 API가 투과적이라고 부른다고 함..
*  composite 패턴과 비슷하다고 함. 러시아 인형 안에 인형 또 있는 형태라고 함..
*
* <장단점>
*  기능을 추가해 가는 것에만 목적이 있다고 함.
*  내용물을 변경하지 않고 기능을 계속 추가할 수 있어서 다양한 요구에 적합하다고 함..
*  작은 클래스가 많이 생긴다?
*
* <실제 사용 예시>
*  java.io는 Decorator 패턴이다.
*  ex1) BufferedReader(new InputStreamReader(System.in));
*  ex2) Reader reader  = new BufferedReader(new FileReader("filename.txt"));
*
* */
public class Main {
    public static void main(String[] args) {
        Displayer stringDisplayer = new StringDisplayer("my name is leemr");
        Displayer sideBorder = new SideBorder(stringDisplayer, '#');
        Displayer fullBorder = new FullBorder(sideBorder);

//        stringDisplayer.show();
//        sideBorder.show();
//        fullBorder.show();

        Displayer displayer4 =
                new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new FullBorder(
                                                        new StringDisplayer("this is not familiar to me")
                                                ), '*'
                                        )
                                )
                        ),'/'
                );

        displayer4.show();

    }
}
