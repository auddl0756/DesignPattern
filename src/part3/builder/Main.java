package part3.builder;

public class Main {
    public static void main(String[] args) {
        Builder textBuilder = new TextBuilder();

        DocumentMaker textDocmentMaker = new DocumentMaker(textBuilder);
        textDocmentMaker.buildSampleDocument();

        Builder htmlBuilder = new HtmlBuilder();
        DocumentMaker htmlDocumentMaker = new DocumentMaker(htmlBuilder);
        htmlDocumentMaker.buildSampleDocument();


        /*
        *  Builder 패턴은 익숙하고 직관적으로 이해가 된다.
        *  lombok에도 애노테이션 @Builder가 있다. 명시적인 세터라고 보면 된다.
        *  @Builder를 사용하면 단순한 생성자보다 명확히 객체 생성 시에 전달하는 파라미터를 알 수 있어서 좋았다.
        *  그 내부가 Builder 클래스처럼 구현이 되어 있고,
        *  구체적인 Builder는 TextBuilder,HtmlBuilder처럼 어노테이션이 코드를 자동 생성하도록 만들어져있나 보다.
        *
        *  롬복의 빌더 문서 : https://projectlombok.org/features/Builder
        * */

        /*
        * 이 책이 옛날 책이라 그런지 모르겠지만..
        * 디자인 패턴들이 다들 polymorphism(다형성), 교체가능성이 높은 것을 지향한다.
        * 그렇게 해야 재이용가능하다,부품으로서의 가치가 높아진다고 한다.
        * 디자인 패턴 배우는 이유가 재이용하기 쉽도록 하기 위함이라고는 한다만.....
        * 항상 인터페이스,이를 구현한 구체 클래스를 따로 만들고 있는데 이 방식이 좋은지 모르겠다.
        * 이유는 코드의 양이 증가하기 때문이고,꼭 필요하지 않다고도 생각한다.
        * 하지만 라이브러리로 제공되는 Collection 인터페이스들과 구체 클래스들의 관계는 꽤 편하다고 생각한다.
        * 라이브러리 수준의 코드들은 복잡하니까 이렇게 잘 설계하는게 중요할 거라 생각한다.
        * 그런데 내가 쓸 일이 올까. 가까운 미래에 체감할 인터페이스를 두는 방식의 장점을 체감할 날이 올까?
        * */

    }
}
