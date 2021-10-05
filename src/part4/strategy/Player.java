package part4.strategy;


import part4.strategy.strategies.Strategy;

public class Player {
    private String name;
    private Strategy strategy;
    private int winCount, loseCount, drawCount, gameCount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void reflectResult(int myHandValue, int opponentHandValue, int gameResult) {
        strategy.study(myHandValue, opponentHandValue, gameResult);

        gameCount++;

        if (gameResult == 1) winCount++;
        else if (gameResult == 0) drawCount++;
        else loseCount++;
    }

    @Override
    public String toString() {
        return this.name + "," + this.strategy.getStrategyName() +
                ",승:" + this.winCount + " 무:" + this.drawCount + " 패:" + this.loseCount;
    }

    public int getWinCount() {
        return this.winCount;
    }
}
