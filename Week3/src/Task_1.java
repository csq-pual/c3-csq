import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Task_1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers=new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i]=in.nextInt();
        }
        int target=in.nextInt();
        List<List<Integer>> list=threeSum(numbers,target);
        for (List<Integer> arr : list) {
            System.out.println(arr);
        }
    }
    public static List<List<Integer>> threeSum(int[] nums,int target){
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        int len=nums.length;
        if(nums==null||len<3){
            return ans;
        }
        Arrays.sort(nums);//排序
        for(int i=0;i<len;i++){
            if(nums[i]>target){
                break;
            }
            if(i>0&&nums[i]==nums[i-1]){
                continue;//去重复，遍历，如果有重复的就跳过
            }
            int left=i+1;
            int right=len-1;
            while (left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left<right&&nums[left]==nums[left+1]){//去重
                        left++;
                    }
                    while (left<right&&nums[right]==nums[right-1]){//去重
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(sum<target){
                    left++;
                }
                else if(sum>target){
                    right--;
                }
            }
        }
        return ans;
    } }
