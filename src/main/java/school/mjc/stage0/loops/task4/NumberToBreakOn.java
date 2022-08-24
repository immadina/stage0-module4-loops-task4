package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        //the first is number to break on, the second to iterate till, if number to iterate till is less than
        // to break with -> sout("iterating till the end") and print all the numbers till the end, otherwise
        // all numbers till toBreakWith.
        //int i = 0;

        if (toBreakWith > numberToGoUntil) {
            System.out.println("iterating till the end");
        }
        for (int i = 1; i <= toBreakWith; i++) {
            if (i > numberToGoUntil) {
                break;
            }
            System.out.println(i);
        }

    }
}
