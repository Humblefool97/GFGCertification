package com.example.dsa.gfg.hashing;

import java.util.*;

public class SortFrequency {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 1; i <= tc; i++) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = in.nextInt();
            }
            sortFrequency(a, n);
        }
    }

    /**
     * TC: O(nLogn)
     * @param a
     * @param n
     */
    private static void sortFrequency(int a[], int n) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> valList = new ArrayList<>();
        for (int i : a) {
            int val = freqMap.getOrDefault(i, 0);
            freqMap.put(i, ++val);
            valList.add(i);
        }

        FrequencyComparator comparator = new FrequencyComparator(freqMap);
        valList.sort(comparator);
        for (int i : valList) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static class FrequencyComparator implements Comparator<Integer> {
        private HashMap<Integer, Integer> freqCounter;

        public FrequencyComparator(HashMap<Integer, Integer> freqCounter) {
            this.freqCounter = freqCounter;
        }

        @Override
        public int compare(Integer val1, Integer val2) {
            int freqCompare = freqCounter.get(val2).compareTo(freqCounter.get(val1));
            int valCompare = val1.compareTo(val2);
            if (freqCompare == 0) {
                return valCompare;
            } else {
                return freqCompare;
            }
        }
    }
}
