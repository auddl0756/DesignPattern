package part2.factoryMethod;

import part2.factoryMethod.framework.Factory;
import part2.factoryMethod.framework.Product;
import part2.factoryMethod.idcard.IDCardFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        factory method 패턴
        - 인스턴스를 생성하는 factory(공장)를 template method 패턴으로 구현한 것이라는데.......

        */

        Factory factory = new IDCardFactory();
        List<Product> cards = new ArrayList<>();
        for(int i=0;i<3;i++) cards.add(factory.create("name"+i));

        for(Product card : cards){
            card.use();
        }

        /*
        * factory method 패턴은 어떤 의의가 있을까....
        * 예제에서 factory.create()를 통해 인스턴스를 만드는데,
        * 이렇게 하면 new IDCard() 이런식으로 안 만들어도 된다는 장점이 있고...
        * create()만 호출하면 create() 내부에서 필요한 것들 이것저것 조합해서 완성된 객체를 반환해줄 수 있다는 장점이 있는 듯?
        * */

        /*
        * framework패키지의 Factory와 Product를 다른 객체를 만드는데 사용한다면
        * framework라는 공장을 수정하지 않고 그대로 사용할 수 있다.
        * polymorphism을 실현할 수 있다 (List가 ArrayList,LinkedList로 바뀔 수 있듯이)
        * 또한 객체 생성 코드를 한 군데 모아둠으로써 디버깅,문제 해결하기 더 쉽게 할 수 있다
        *
        * 결론 : 객체 생성 코드를 encapsulate하고 싶다면 factory method 패턴을 고려해보라!!
        *
        * 100퍼센트 이해한 건 아닌듯.
        * */
    }
}
