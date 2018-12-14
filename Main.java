import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int positive = 0;
        int negative = 0;

        double expectation = 0.5;

        for (int i = 0; i < 100000; i++) {
            int num = rand.nextInt(6) + 1;
            if (num % 2 == 0) {
                positive++;
            }
            else {
                negative++;
            }
        }
        double condition = positive *100 / 100000.0;
        System.out.printf("\nScenario 1: Using a single 6-sided die, what is the probability of rolling an odd number?\nExpected Outcome: %f\nCount of True: %d\nCount of False: %d\nCondition Reached: %f\n", expectation, positive, negative, condition);

        positive = 0;
        negative = 0;
        expectation = 0.7;
        for (int i = 0; i < 100000; i++) {
            int num = rand.nextInt(10) + 1;
            if ((num > 5) || (num % 2 == 0)) {
                positive++;
            }
            else {
                negative++;
            }
        }
        condition = positive *100/ 100000.0;
        System.out.printf("\nScenario 2: Using a single 10-sided die, what is the probability of rolling an even number, or a number over 5?\nExpected Outcome: %f\nCount of True: %d\nCount of False: %d\nCondition Reached: %f\n", expectation, positive, negative, condition);

        positive = 0;
        negative = 0;
        expectation = 0.25;
        for (int i = 0; i < 100000; i++) {
            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            if ((roll1 % 2 == 0) && (roll2 % 2 == 1)) {
                positive++;
            }
            else {
                negative++;
            }
        }
        condition = positive *100/ 100000.0;
        System.out.printf("\nScenario 3: Using a single 6-sided die, what is the probability of rolling an even number on the first roll, and an odd number on\n" +
                "the second roll?\nExpected Outcome: %f\nCount of True: %d\nCount of False: %d\nCondition Reached: %f\n", expectation, positive, negative, condition);

        positive = 0;
        negative = 0;
        expectation = (1 /27.0);
        for (int i = 0; i < 100000; i++) {
            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            int roll3 = rand.nextInt(6) + 1;
            if ((roll1 > 3) && (roll2 > 2 && roll2 < 5) && (roll3 > 4)) {
                positive++;
            }
            else {
                negative++;
            }
        }
        condition = positive *100/ 100000.0;
        System.out.printf("\nScenario 4: Using a single 6-sided die, what is the probability of rolling a 1 or 2 on the first roll, a 3 or 4 on the second roll, and a\n" +
                "5 or 6 on the last roll?\nExpected Outcome: %f\nCount of True: %d\nCount of False: %d\nCondition Reached: %f\n", expectation, positive, negative, condition);

        positive = 0;
        negative = 0;
        expectation = (10/36.0);
        for (int i = 0; i < 100000; i++) {

            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            int roll3 = rand.nextInt(6) + 1;
            int roll4 = rand.nextInt(6) + 1;

            if ((roll1 != roll2 && roll1 != roll3 && roll1 != roll4) && (roll2 != roll3 && roll2 != roll4) && (roll3 != roll4)) {
                positive++;
            }
            else {
                negative++;
            }
        }
        condition = positive *100/ 100000.0;
        System.out.printf("\nScenario 5: Using a 6-sided die, what is the probability of rolling the die four times and getting a unique number each time,\nExpected Outcome: %f\nCount of True: %d\nCount of False: %d\nCondition Reached: %f\n", expectation, positive, negative, condition);
    }
}
