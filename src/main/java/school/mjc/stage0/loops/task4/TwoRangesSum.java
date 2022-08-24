package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
//Write a program that will consume 2 args: the first is number to skip, the second to iterate till.
// You should consider the cases: 3.1. when numberToSkip is greater than lastInRow -> output is:
// "number to skip is bugger then the last"
// 3.2. when lastInRow is negative -> output is:"last number in row is negative"
// 3.3. for the rest cases output is: "skipped sum is number" "counted sum is number",
// where number is an actual sum of them:
       if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            //System.out.println("skipped sum is " + numberToSkip);
            int countedSum = 0;
            int skippedSum = 0;
            for (int i = 1; i <= lastInRow; i++) {
                if (i <= numberToSkip) {
                    skippedSum += i;
                    continue;
                }
                countedSum += i;
            }
            System.out.println("skipped sum is " + skippedSum);
            System.out.println("counted sum is " + countedSum);
        }
    }
}
