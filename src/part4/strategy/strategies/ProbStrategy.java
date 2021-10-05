package part4.strategy.strategies;

import part4.strategy.Hand;

//이전에 (상대가 낸손,내가 낸 손) 조합의 과거 승점을 보고 가장 큰 것을 내기
public class ProbStrategy implements Strategy {
    private Hand opponentHand, myHand;
    int[][] winPoint;  //이전 [상대 손 종류][나의 손 종류] = 승리 포인트
    int gameCount = 0;

    public ProbStrategy(Hand opponentHand, Hand myHand) {
        this.opponentHand = opponentHand;
        this.myHand = myHand;

        this.winPoint = new int[3][3];
    }

    @Override
    public Hand nextHand() {
        int maxPoint = 0;
        int maxHand = 0;

        for (int nxtHandValue = 0; nxtHandValue < 3; nxtHandValue++) {
            if (winPoint[opponentHand.getHandValue()][nxtHandValue] > maxPoint) {
                maxPoint = winPoint[opponentHand.getHandValue()][nxtHandValue];
                maxHand = nxtHandValue;
            }
        }

        myHand = myHand.getHand(maxHand);

        return myHand;
    }

    //묵,찌,빠 = 0,1,2
    @Override
    public void study(int myHandValue, int opponentHandValue, int gameResult) {
        if (gameResult == 1) {
            winPoint[opponentHandValue][myHandValue] += 3;    //승
            //winPoint[opponentHandValue][(myHandValue + 1) % 3]++; //패
            winPoint[opponentHandValue][(myHandValue + 2) % 3]++;   //무
        } else if (gameResult == 0) {
            winPoint[opponentHandValue][myHandValue]++;    //무
            //winPoint[opponentHandValue][(myHandValue + 1) % 3]++; //패
            winPoint[opponentHandValue][(myHandValue + 2) % 3] += 3;   //승
        } else {
            //winPoint[opponentHandValue][myHandValue]+=3;    //패
            winPoint[opponentHandValue][(myHandValue + 1) % 3] += 3; //승
            winPoint[opponentHandValue][(myHandValue + 2) % 3]++;   //무
        }

//        System.out.println("opponent : "+opponentHandValue+"my : "+myHandValue+ " gameResult = "+gameResult);
//        for (int i = 0; i < 3; i++) {
//            System.out.print(winPoint[opponentHandValue][i] + " ");
//        }
//        System.out.println();

        opponentHand = opponentHand.getHand(opponentHandValue);
        gameCount++;
    }

    @Override
    public String getStrategyName() {
        return "probabilityBasedStrategy";
    }
}
