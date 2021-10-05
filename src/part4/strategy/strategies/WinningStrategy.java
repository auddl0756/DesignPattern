package part4.strategy.strategies;

import part4.strategy.Hand;

//이겼다면 이긴 손을 또 내는 전략. 졌다면 랜덤으로 내기
public class WinningStrategy implements Strategy {
    private Hand prevHand;
    private int gameResult;

    public WinningStrategy(Hand hand) {
        this.prevHand = hand;
        this.gameResult = 0;
    }

    @Override
    public Hand nextHand() {
        if (gameResult != 1) {
            prevHand = prevHand.getHand((int) (Math.random() * 3));
        }
        return prevHand;
    }

    @Override
    public void study(int myHandValue, int opponentHandValue,int gameResult) {
        this.gameResult = gameResult;
    }

    @Override
    public String getStrategyName() {
        return "winnigStreakStrategy";
    }
}
