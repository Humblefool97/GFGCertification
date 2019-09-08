package com.example.dsa.gfg.arrays;

/**
 * Created by rajeevranganathan
 */
public class MajorityWins {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        majorityWins(arr,arr.length,1,7);
    }
    public static void majorityWins(int arr[],int n,int x,int y)
    {
        int count_x=0;//counter to count frequency of x
        int count_y=0;//counter to count frequency of y

        int highest;
        for(int i = 0;i<n;i++){
            if(arr[i] == x)
                count_x++;
            else if(arr[i] == y)
                count_y++;
        }
        if(count_x != count_y )
            highest = count_x > count_y ? x:y;
        else
            highest = x > y?y:x;

        System.out.print(highest);
        System.out.println();
    }
}
