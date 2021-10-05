package part4.strategy;

import part4.strategy.strategies.ProbStrategy;
import part4.strategy.strategies.RandomStrategy;

public class Main {
    public static void main(String[] args) {
        Player probPlayer = new Player("leemr", new ProbStrategy(Hand.ROCK, Hand.ROCK));
        Player randomPlayer = new Player("kimhj", new RandomStrategy(Hand.ROCK));

        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = randomPlayer.nextHand();
            Hand nextHand2 = probPlayer.nextHand();

            int gameResult = nextHand1.match(nextHand2);

            randomPlayer.reflectResult(nextHand1.getHandValue(), nextHand2.getHandValue(), gameResult);
            probPlayer.reflectResult(nextHand2.getHandValue(), nextHand1.getHandValue(), gameResult * -1);
        }

        System.out.println(randomPlayer.getWinCount()+" "+ probPlayer.getWinCount());
    }

    /*
    * <역할>
    *  1. Strategy 인터페이스 (Strategy)
    *  2. Strategy 구현체들 (ProbStrategy,RandomStrategy 등)
    *  3. Strategy 위임(주입)받아 사용하는 클래스 (Player)
    *
    * <장점>
    *  Strategy 자체를 주입하여 쉽게 교체할 수 있다는 점이 가장 편한 것 같다.
    *  정말 부품처럼 갈아 끼우기 쉬워서 유용하게 쓰일 수 있을 것 같고 마음에 든다.
    *
    *  여러 전략을 런타임에 선택하게 하거나 (적절히 분기할 수 있을 것이다)
    *  여러 전략을 함께 실행해 볼 수도 있어서 유용하다고 한다.(검산에 쓰일 수 있다고 함)
    * */
}
