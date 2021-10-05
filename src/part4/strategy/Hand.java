package part4.strategy;

public enum Hand {
    ROCK(0), SCISSOR(1), PAPER(2);

    private int handValue;

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public Hand getHand(int handValue) {
        if (handValue == 0) return ROCK;
        else if (handValue == 1) return SCISSOR;
        else return PAPER;
    }

    public int getHandValue(){
        return this.handValue;
    }

    public int match(Hand hand) {
        if (this.handValue == hand.handValue) {  //draw
            return 0;
        }

        if (this.handValue == (hand.handValue + 2) % 3) { //win
            return 1;
        } else {  //lose
            return -1;
        }
    }
}
