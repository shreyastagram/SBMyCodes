package GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Masonry {//Pinterest code
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(27, 21, 17, 15, 12, 9, 8, 7, 2));
        stackCards(list1, 3);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(27, 17, 15, 12, 8, 7, 2));
        stackCards(list2, 3);
    }

    private static void stackCards(List<Integer> list, int numColumns) {
        System.out.println("Stacking cards into " + numColumns + " columns from " + list);
        Masonry pinterest = new Masonry();
        List<List<Integer>> columns = pinterest.arrangeCards(list, numColumns);
        for (int i = 0; i < columns.size(); i++) {
            System.out.println("Column " + (i + 1) + ": " + printList(columns.get(i)));
        }
    }

    private static String printList(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (Integer value : list) {
            sb.append(value).append(", ");
        }
        return sb.toString();
    }

    private static Integer sum(List<Integer> list) {
        Integer sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }

    public List<List<Integer>> arrangeCards(List<Integer> cards, int numColumns) {
        // Create a copy of the original list of cards
        List<Integer> sortedCards = new ArrayList<>(cards);
        // Sort the copy in descending order
        Collections.sort(sortedCards, Collections.reverseOrder());

        Integer optimum = (int) Math.ceil((double) sum(sortedCards) / numColumns);

        List<List<Integer>> columns = new ArrayList<>();

        for (int i = 0; i < numColumns; i++) {
            List<Integer> column = new ArrayList<>();

            // Filling the ith column
            if (sortedCards.get(0) >= optimum) {
                column.add(sortedCards.remove(0));
            } else {
                int currLength = 0;
                int suitableIndex = binarySearchForNextSuitableCard(
                        optimum - currLength, sortedCards, 0, sortedCards.size() - 1);
                while (suitableIndex < sortedCards.size()) {
                    Integer cardToAdd = sortedCards.remove(suitableIndex);
                    column.add(cardToAdd);
                    currLength += cardToAdd;
                    suitableIndex = binarySearchForNextSuitableCard(
                            optimum - currLength, sortedCards, 0, sortedCards.size() - 1);
                }
            }
            columns.add(column);
        }

        // If there are still some cards remaining, add them one by one to the shortest available column
        while (!sortedCards.isEmpty()) {
            int shortestIndex = findShortestColumn(columns);
            columns.get(shortestIndex).add(sortedCards.remove(0));
        }

        return columns;
    }

    private int binarySearchForNextSuitableCard(Integer maxLength, List<Integer> sortedCards, int left, int right) {
        if (left > right) {
            return left;
        }
        int mid = (left + right) / 2;
        if (sortedCards.get(mid) < maxLength) {
            return binarySearchForNextSuitableCard(maxLength, sortedCards, left, mid - 1);
        } else {
            return binarySearchForNextSuitableCard(maxLength, sortedCards, mid + 1, right);
        }
    }

    // Method to find the index of the shortest column
    private int findShortestColumn(List<List<Integer>> columns) {
        int minSum = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < columns.size(); i++) {
            int columnSum = sum(columns.get(i));
            if (columnSum < minSum) {
                minSum = columnSum;
                minIndex = i;
            }
        }

        return minIndex;
    }
}
