package medium;

import java.util.Arrays;
import java.util.LinkedList;

public class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        int len = deck.length;
        LinkedList<Integer> indices = new LinkedList();
        for (int i = 0; i < len; ++i) indices.add(i);

        Arrays.sort(deck);
        int[] answer = new int[len];
        for (int card : deck) {
            answer[indices.poll()] = card;
            if (!indices.isEmpty())
                indices.add(indices.poll());
        }
        return answer;
    }
}
