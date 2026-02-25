/**
 * Name: Dylan Hardin
 * Date: February 25, 2026
 * Professor: Professor Dole
 * Class: BooleanChallenge
 *
 * Program Description:
 * This program evaluates a series of boolean expressions using given
 * variables and prints whether each expression is true or false.
 * The purpose of this program is to compare hand-calculated boolean
 * expression results with the computer's results and improve understanding
 * of boolean logic in Java.
 *
 * 
 */

public class BooleanChallenge {

    public static void main(String[] args) {

        // Variable declarations
        boolean havingFun, amTired;
        int i, j, x, y;
        double a, b;

        // Initializations
        havingFun = true;
        amTired = false;
        i = 0;
        j = 10;
        x = 5;
        y = -3;
        a = 5.5;
        b = 3.2;

        // Boolean expressions
        System.out.println("1. " + amTired);

        System.out.println("2. " + (i < 0));

        System.out.println("3. " + (j < i || j < 100));

        System.out.println("4. " + ((i < j) && (j < 100)));

        System.out.println("5. " + (!amTired || havingFun && i > 10));

        System.out.println("6. " + (!havingFun || j > 0 || amTired));

        System.out.println("7. " + (!(i > 0 && !havingFun) || amTired));

        System.out.println("8. " + (x > y && a < b));

        System.out.println("9. " + (x + y > 0 && a - b < 2.5));

        System.out.println("10. " + (i == j || a != b && havingFun));

        System.out.println("11. " + ((i + j) % 2 == 0 && amTired));

        System.out.println("12. " + (i == 0 || y < x && a > b));

        System.out.println("13. " + (!(j == 10) || havingFun && !amTired));

        System.out.println("14. " + (x > 0 && i >= 0 && j <= 20));

        System.out.println("15. " + ((x - y) < 10 || (b - a) > 0));

        System.out.println("16. " + (x * y > -20 && j / 2 == 5));

        System.out.println("17. " + (x != 5 || j < 20 && !havingFun));

        System.out.println("18. " + (i + x >= j && b * 2 <= a));

        System.out.println("19. " + (!(x == 5 || y != -3) && amTired));

        System.out.println("20. " + (i == j && a == b || havingFun && amTired));

        // Custom expression (#21)
        System.out.println("21. " + (havingFun && x > 0 && a > b));
    }
}
