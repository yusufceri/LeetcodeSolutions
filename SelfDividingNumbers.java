import java.util.ArrayList;
import java.util.List;


/* A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
Also, a self-dividing number is not allowed to contain the digit zero.
Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
*/
public class SelfDividingNumbers {

    public static void main(String[] args) {
        int left=1, right=22;

        System.out.println(selfDividingNumbers(left,right));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> nums = new ArrayList();
        int tmp;
        boolean isOk = false;

        while(left <= right){
            tmp = left;

            while(tmp>0){
                int lastdigit = tmp%10;
                if(lastdigit==0 || (left%lastdigit)!=0){
                    isOk=false;
                    break;
                }else{
                    isOk = true;
                }

                tmp = tmp/10;
            }

            if(isOk){
                nums.add(left);
            }

            left++;
        }

        return nums;
    }
}
