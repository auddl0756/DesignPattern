package part4.strategy.strategies;

import part4.strategy.Hand;

//완전 무작위로 내는 전략
public class RandomStrategy implements Strategy{
    private Hand randomHand;

    public RandomStrategy(Hand initialHand){
        this.randomHand = initialHand;
    }

    @Override
    public Hand nextHand() {
        return randomHand.getHand((int)(Math.random()*3));
    }

    @Override
    public void study(int myHandValue, int opponentHandValue,int gameResult) {
        //no study.
    }

    @Override
    public String getStrategyName() {
        return "allRandomStrategy";
    }
}
