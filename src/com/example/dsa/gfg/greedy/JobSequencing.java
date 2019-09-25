package com.example.dsa.gfg.greedy;

import java.util.Arrays;

public class JobSequencing {
    static class Job implements Comparable<Job> {
        int jobId;
        int dead;
        int profit;

        public Job(int jobId, int dead, int profit) {
            this.jobId = jobId;
            this.dead = dead;
            this.profit = profit;
        }

        @Override
        public int compareTo(Job o) {
            if (this.profit < o.profit) return 1;
            return -1;
        }
    }

    private static void scheduleJobs(Job[] arr, int highestDeadline) {
        Arrays.sort(arr);
        int[] result = new int[highestDeadline];
        boolean[] slotArr = new boolean[highestDeadline];
        for (int i = 0; i < highestDeadline; i++) {
            for (int j = Math.min(highestDeadline, arr[i].dead); j >= 0; j--) {
                if (!slotArr[j]) {
                    slotArr[j] = true;
                    result[j] = i;
                }
            }
        }
    }
}
