package part4.strategy.strategies;

import part4.strategy.Hand;

public interface Strategy {
    Hand nextHand();
    void study(int myHandValue, int opponentHandValue,int gameResult);
    String getStrategyName();
}
