import java.util.HashMap;

/*
The set S originally contains numbers from 1 to n. But unfortunately, due to the data error, one of the numbers in the set got duplicated to another number in the set, which results in repetition of one number and loss of another number.
Given an array nums representing the data status of this set after the error. Your task is to firstly find the number occurs twice and then find the number that is missing. Return them in the form of an array.
 */

public class SetMissmatch {
    public static void main(String[] args) {
//        int[] nums = {1,2,2,4,5,6};
//        int[] nums = {1,1};
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,11};
//        int[] nums = {5,4,3,3,2};

        int[] result = new int[2];
        result = findErrorNums(nums);
        System.out.println(result[0]+" - "+result[1]);
    }

    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        HashMap<Integer,Boolean> numberTable = new HashMap();
        numberTable.put(nums[0], true);

        for(int i=1;i<nums.length;i++){
            if(!numberTable.containsKey(nums[i]))
                numberTable.put(nums[i],true);
            else
                result[0]= nums[i];

        }

        for(int i=1;i<nums.length+1;i++){
            if(!numberTable.containsKey(i))
                result[1] = i;
        }

        return result;
    }
}
