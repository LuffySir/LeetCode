/**
两数之和
 *
 */
public class TwoSum {
    public int[] sum(int[] nums, int target){
        int len = nums.length;
        int i=0,j=0;

        for(i=0;i<len;i++) {
            for (j=i+1;j<len;j++){
                if (nums[i]+nums[j]==target)
                    System.out.println(i+"and"+j);
            }
        }
        int[] res;
        res = new int[]{i,j};
        return res;
    }
    public static final void  main(String[] args){
        sum();
    }
}
