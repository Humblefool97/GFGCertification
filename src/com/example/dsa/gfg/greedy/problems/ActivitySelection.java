package com.example.dsa.gfg.greedy.problems;

import java.util.*;

/**
 * Given N activities with their start and finish times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.
 * <p>
 * Note : The start time and end time of two activities may coincide.
 * <p>
 * Input:
 * The first line contains T denoting the number of testcases. Then follows description of testcases. First line is N number of activities then second line contains N numbers which are starting time of activies.Third line contains N finishing time of activities.
 * <p>
 * Output:
 * For each test case, output a single number denoting maximum activites which can be performed in new line.
 * <p>
 * Constraints:
 * 1<=T<=50
 * 1<=N<=1000
 * 1<=A[i]<=100
 * <p>
 * Example:
 * Input:
 * 2
 * 6
 * 1 3 2 5 8 5
 * 2 4 6 7 9 9
 * 4
 * 1 3 2 5
 * 2 4 3 6
 * <p>
 * Output:
 * 4
 * 4
 */
public class ActivitySelection {

    static class Activity implements Comparable<Activity> {
        int index;
        int startTime;
        int endTime;

        public Activity(int index, int startTime, int endTime) {
            this.index = index;
            this.startTime = startTime;
            this.endTime = endTime;
        }

        @Override
        public int compareTo(Activity o) {
            if (this.endTime > o.endTime)
                return 1;
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tc = input.nextInt();
        for (int i = 1; i <= tc; i++) {
            int n = input.nextInt();
            ArrayList<Activity> activities = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                Activity activity = new Activity(j, input.nextInt(), -1);
                activities.add(activity);
            }
            for (int k = 0; k < n; k++) {
                Activity activity = activities.get(k);
                activity.endTime = input.nextInt();
            }
            System.out.println(getNumberOfActivities(activities, n));
        }
    }

    private static int getNumberOfActivities(List<Activity> activityList, int n) {
        Collections.sort(activityList);
        int maxStartTime = activityList.get(0).startTime;
        int num = 1;
        for (int i = 1; i < n; i++) {
            int startTime = activityList.get(i).startTime;
            if (startTime > maxStartTime) {
                maxStartTime = startTime;
                num++;
            }
        }
        return num;
    }
}
