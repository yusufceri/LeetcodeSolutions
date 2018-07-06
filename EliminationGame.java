public class EliminationGame {
    /*
    here is a list of sorted integers from 1 to n. Starting from left to right, remove the first number and every other number afterward until you reach the end of the list.

Repeat the previous step again, but this time from right to left, remove the right most number and every other number from the remaining numbers.

We keep repeating the steps again, alternating left to right and right to left, until a single number remains.

Find the last number that remains starting with a list of length n.
     */


    public static void main(String[] args) {
        System.out.println(lastRemaining(9));
    }

    public static int lastRemaining(int n) {
        boolean isLeftToRight = true;
        int remaining = n, step=1, head=1;

        while (remaining > 1) {
            if (isLeftToRight || remaining % 2 ==1) {
                head = head + step;
            }
            step = step * 2;
            remaining = remaining / 2;

            isLeftToRight = !isLeftToRight;
        }
        return head;
    }
}
