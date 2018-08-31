package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(searchInsertPosition35(new int[]{1,2}, 2));

    }

    public static int searchInsertPosition35(int[] nums, int target) {

        for(int i=0;i<nums.length;i++)
            if(nums[i] == target || nums[i] > target)
                return i;
        return nums.length;
    }
}
