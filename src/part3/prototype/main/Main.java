package part3.prototype.main;

import part3.prototype.framework.Manager;
import part3.prototype.framework.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Product boxing = new Boxing();
//        boxing.use("leemr");
//
//        Product underlining = new UnderLining();
//        underlining.use("leemr");

        Manager manager = new Manager();
        Product boxing = new Boxing();
        Product underlining = new UnderLining();

        manager.register("boxing", boxing);
        manager.register("underlining", underlining);

        Product boxingProduct = manager.create("boxing");
        Product underliningProduct = manager.create("underlining");

        boxingProduct.use("leemr");
        underliningProduct.use("leemr");

        /*
         *  prototype 패턴은 무엇이고 어떤 의의가 있는가. 의미,용도를 확실히 잘 모르겠다.
         *
         * [등장인물]
         *  1. prototype(원형) - 인스턴스 복사 인터페이스
         *  2. 구체적인 prototype -인스턴스 복사 구현체
         *  3. 이용자 - 인스턴스 복사 메서드 이용해서 인스턴스 만듦.
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         * [소스 코드 내에 클래스 이름이 있을 때 문제점]
         * 소스코드에 클래스 이름이 쓰여있으면 그 클래스와 분리해서 재사용할 수 없게 된다.
         * 클래스파일(.class)만 가지고 있어도 그 클래스를 재사용할 수 있는지 여부???
         * 소스파일(.java)가 없어도 재사용할 수 있는지가 포인트다???
         *
         * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
         * [prototype 패턴이 필요한 이유]
         * 물론 Main에서는 new 클래스이름() 으로 인스턴스를 만들고 있지만
         * 이것은 Manager 클래스의 HashMap에 등록하기 위함이다.
         * Manager class에서 인스턴스를 실제로 만드는데, 여기에는 "new 클래스이름()"이 들어간 코드가 없다.
         * 즉, 프레임워크의 코드는 재사용이 가능한 형태로 만들 수 있다.
         *
         * + 모형이 너무 많아서 관리가 힘들 때??
         * */

        /*
         *  [java clone 메서드]
        */

        //하지만 여전히 prototype 패턴은 잘 와닿지 않는다.

        Product boxingProduct2 = manager.create("boxing");

        System.out.println(boxingProduct == boxingProduct2);        //false
        System.out.println(boxingProduct.equals(boxingProduct2));   //true or false
        System.out.println((boxingProduct.getClass() == boxingProduct2.getClass()) + " " + boxingProduct.getClass());   //true maybe

    }
}
