package leetcode;
/*
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 */
import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        if(target<0&&nums[0]>0){
            return new ArrayList<>();
        }
        List<List<Integer>> list=new ArrayList<>();
        long sum=0;
        for(int i=0;i<nums.length-3;i++){
            if(i>0&&nums[i]==nums[i-1])continue;

            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 &&nums[j]==nums[j-1])continue;

                int start=j+1;
                int end=nums.length-1;
                while(start<end){

                    sum=nums[i]+nums[j]+nums[start]+nums[end];

                    if(sum==target){

                        list.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));

                        while(start<end&&nums[start]==nums[start+1]) start++;
                        while(start<end&&nums[end]==nums[end-1])end--;

                        start++;

                        end--;

                    }else if(sum>target){
                        end--;

                    }else{
                        start++;
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        FourSum fs = new FourSum();
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fs.fourSum(nums, target));
    }
}
