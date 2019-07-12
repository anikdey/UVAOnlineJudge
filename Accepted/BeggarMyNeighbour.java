import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BeggarMyNeighbour {

    private static Queue<String> dealersQueue = new LinkedList<>();
    private static Queue<String> nonDealersQueue = new LinkedList<>();
    private static Queue<String> runningBoard = new LinkedList<>();
    private static int counter = 1;
    private static int cardsToPlayForNonDealer = 1;
    private static int cardsToPlayForDealer = 1;
    private static boolean nonDealerNeedsToShowFacedCard = false;
    private static boolean dealerNeedsToShowFacedCard = false;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        while (!line.equals("#")){
            counter = 1;
            dealersQueue.clear();
            nonDealersQueue.clear();
            runningBoard.clear();
            cardsToPlayForNonDealer = 1;
            cardsToPlayForDealer = 1;
            nonDealerNeedsToShowFacedCard = false;
            dealerNeedsToShowFacedCard = false;

            distributeDeck(line);
            for(int i=1; i<=3; i++){
                line = br.readLine();
                distributeDeck(line);
            }

            reverseQueue(dealersQueue);
            reverseQueue(nonDealersQueue);
            startGame();
            line = br.readLine();
        }
    }

    private static void startGame() {
        nonDealersTurn();
    }

    private static void nonDealersTurn() {

        dispatchingOfNonDealersCard:
        for(int i = 1; i<=cardsToPlayForNonDealer; i++){

            if(!nonDealersQueue.isEmpty()){
                String card = nonDealersQueue.peek();
                nonDealersQueue.remove();
                runningBoard.add(card);

                if( card.charAt(1) == 'A' ) {
                    cardsToPlayForDealer = 4;
                    dealerNeedsToShowFacedCard = true;
                    nonDealerNeedsToShowFacedCard = false;
                    break dispatchingOfNonDealersCard;
                } else if( card.charAt(1) == 'K' ) {
                    cardsToPlayForDealer = 3;
                    dealerNeedsToShowFacedCard = true;
                    nonDealerNeedsToShowFacedCard = false;
                    break dispatchingOfNonDealersCard;
                } else if( card.charAt(1) == 'Q' ) {
                    cardsToPlayForDealer = 2;
                    dealerNeedsToShowFacedCard = true;
                    nonDealerNeedsToShowFacedCard = false;
                    break dispatchingOfNonDealersCard;
                } else if( card.charAt(1) == 'J' ) {
                    cardsToPlayForDealer = 1;
                    dealerNeedsToShowFacedCard = true;
                    nonDealerNeedsToShowFacedCard = false;
                    break dispatchingOfNonDealersCard;
                } else {
                    cardsToPlayForDealer = 1;
                    dealerNeedsToShowFacedCard = false;
                }

                if( i== cardsToPlayForNonDealer && nonDealerNeedsToShowFacedCard ){
                    dealersQueue.addAll(runningBoard);
                    runningBoard.clear();
                    nonDealerNeedsToShowFacedCard = false;
                    dealerNeedsToShowFacedCard = false;
                }
            }else {
                gameOver(1, dealersQueue.size());
                return;
            }
        }
        dealersTurn();
    }

    private static void dealersTurn() {
        dispatchingOfDealersCard:
        for(int i=1; i<=cardsToPlayForDealer; i++){
            if(!dealersQueue.isEmpty()){
                String card = dealersQueue.peek();
                dealersQueue.remove();
                runningBoard.add(card);

                if( card.charAt(1) == 'A' ) {
                    cardsToPlayForNonDealer = 4;
                    nonDealerNeedsToShowFacedCard = true;
                    dealerNeedsToShowFacedCard = false;
                    break dispatchingOfDealersCard;
                } else if( card.charAt(1) == 'K' ) {
                    cardsToPlayForNonDealer = 3;
                    nonDealerNeedsToShowFacedCard = true;
                    dealerNeedsToShowFacedCard = false;
                    break dispatchingOfDealersCard;

                } else if( card.charAt(1) == 'Q' ) {

                    cardsToPlayForNonDealer = 2;
                    nonDealerNeedsToShowFacedCard = true;
                    dealerNeedsToShowFacedCard = false;

                    break dispatchingOfDealersCard;

                } else if( card.charAt(1) == 'J' ) {
                    cardsToPlayForNonDealer = 1;
                    nonDealerNeedsToShowFacedCard = true;
                    dealerNeedsToShowFacedCard = false;
                    break dispatchingOfDealersCard;
                } else {
                    cardsToPlayForNonDealer = 1;
                    nonDealerNeedsToShowFacedCard = false;
                }


                if( i== cardsToPlayForDealer && dealerNeedsToShowFacedCard ){
                    nonDealersQueue.addAll(runningBoard);
                    runningBoard.clear();
                    nonDealerNeedsToShowFacedCard = false;
                    dealerNeedsToShowFacedCard = false;
                }

            }else {
                gameOver(2, nonDealersQueue.size());
                return;
            }
        }
        nonDealersTurn();
    }


    private static void distributeDeck(String line) {
        String[] cardArray = line.split(" ");
        for(String card : cardArray) {
            if( counter % 2 == 0 ) {
                dealersQueue.add(card);
            } else {
                nonDealersQueue.add(card);
            }
            counter++;
        }
    }

    private static void reverseQueue(Queue<String> queue) {
        Stack<String> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
    }

    private static void gameOver(int player, int cardsOnHand) {
        System.out.printf( player+"%3d\n", cardsOnHand);
    }

}
