package com.company;

import java.util.Scanner;

public class Lab3Unit3Ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        final double ML_IN_FL_OZ = 29.5735;
        final double ML_IN_GAL = 3785.41;
        final double G_IN_OZ = 28.3495;
        final double G_IN_LB = 453.592;
        final double M_IN_IN = 0.0254;
        final double M_IN_FT = 0.3048;
        final double M_IN_MI = 1609.34;


        System.out.print("What unit do you want to convert? (fl.oz, gal, oz, lb, in, ft, mi): ");
        String unit1 = scanner.next();

        System.out.print("Which unit do you want to convert to? (ml, l, g, kg, mm, cm, m, km): ");
        String unit2 = scanner.next();

        char lastPos = unit2.charAt(unit2.length() - 1);

        if (unit1.compareTo("fl.oz") == 0)
        {
            if (lastPos == 'l')
            {
                System.out.print("How many fl. oz? ");
                double howMuchUnit1 = scanner.nextDouble();

                double howMuchUnit2 = howMuchUnit1 * ML_IN_FL_OZ;

                if (unit2.charAt(0) == 'l')
                {
                    howMuchUnit2 /= 1000;
                }
                System.out.printf("Here's your conversion clown: " + "%.2f %s = %.2f %s", howMuchUnit1, unit1, howMuchUnit2, unit2);
            }
            else
            {
                System.out.println("Rejection: Incompatible conversion units.");
            }
        }

        if (unit1.compareTo("gal") == 0)
        {
            if (lastPos == 'l')
            {
                System.out.print("How many gal? ");
                double howMuchUnit1 = scanner.nextDouble();

                double howMuchUnit2 = howMuchUnit1 * ML_IN_GAL;

                if (unit2.charAt(0) == 'l')
                {
                    howMuchUnit2 /= 1000;
                }
                System.out.printf("Here's your conversion clown: " + "%.2f %s = %.2f %s", howMuchUnit1, unit1,
                        howMuchUnit2, unit2);
            }
            else
            {
                System.out.println("Rejection: Incompatible conversion units.");
            }
        }

        if (unit1.compareTo("oz") == 0)
        {

            if (lastPos == 'g')
            {
                System.out.print("How many oz? ");
                double howMuchUnit1 = scanner.nextDouble();

                double howMuchUnit2 = howMuchUnit1 * G_IN_OZ;

                if (unit2.charAt(0) == 'k')
                {
                    howMuchUnit2 /= 1000;
                }
                System.out.printf("Here's your conversion clown: " + "%.2f %s = %.2f %s", howMuchUnit1, unit1,
                        howMuchUnit2, unit2);
            }
            else
            {
                System.out.println("Rejection: Incompatible conversion units.");
            }
        }

        if (unit1.compareTo("lb") == 0){

            if (lastPos == 'g')
            {
                System.out.print("How many lb? ");
                double howMuchUnit1 = scanner.nextDouble();

                double howMuchUnit2 = howMuchUnit1 * G_IN_LB;

                if (unit2.charAt(0) == 'k')
                {
                    howMuchUnit2 /= 1000;
                }
                System.out.printf("Here's your conversion clown: " + "%.2f %s = %.2f %s", howMuchUnit1, unit1,
                        howMuchUnit2, unit2);
            }
            else
            {
                System.out.println("Rejection: Incompatible conversion units.");
            }
        }

        if (unit1.compareTo("in") == 0) {

            if (lastPos == 'm')
            {
                System.out.print("How many in? ");

                double howMuchUnit1 = scanner.nextDouble();

                double howMuchUnit2 = howMuchUnit1 * M_IN_IN;

                if (unit2.compareTo("km") == 0)
                {
                    howMuchUnit2 /= 1000;
                }
                else if (unit2.compareTo("cm") == 0)
                {
                    howMuchUnit2 *= 100;
                }
                else if (unit2.compareTo("mm") == 0)
                {
                    howMuchUnit2 *= 1000;
                }
                System.out.printf("Here's your conversion clown: " + "%.2f %s = %.2f %s", howMuchUnit1, unit1,
                        howMuchUnit2, unit2);
            }
            else
            {
                System.out.println("Rejection: Incompatible conversion units.");
            }
        }

        if (unit1.compareTo("ft") == 0)
        {

            if (lastPos == 'm')
            {
                System.out.print("How many ft? ");
                double howMuchUnit1 = scanner.nextDouble();

                double howMuchUnit2 = howMuchUnit1 * M_IN_FT;

                if (unit2.compareTo("km") == 0)
                {
                    howMuchUnit2 /= 1000;
                }
                else if (unit2.compareTo("cm") == 0)
                {
                    howMuchUnit2 *= 100;
                }
                else if (unit2.compareTo("mm") == 0)
                {
                    howMuchUnit2 *= 1000;
                }
                System.out.printf("Here's your conversion clown: " + "%.2f %s = %.2f %s", howMuchUnit1, unit1,
                        howMuchUnit2, unit2);
            }
            else
            {
                System.out.println("Rejection: Incompatible conversion units.");
            }
        }

        if (unit1.compareTo("mi") == 0)
        {
            if (lastPos == 'm')
            {
                System.out.print("How many mi? ");
                double howMuchUnit1 = scanner.nextDouble();

                double howMuchUnit2 = howMuchUnit1 * M_IN_MI;

                if (unit2.compareTo("km") == 0)
                {
                    howMuchUnit2 /= 1000;
                }
                else if (unit2.compareTo("cm") == 0)
                {
                    howMuchUnit2 *= 100;
                }
                else if (unit2.compareTo("mm") == 0)
                {
                    howMuchUnit2 *= 10;
                }
                System.out.printf("Here's your conversion clown: " + "%.2f %s = %.2f %s", howMuchUnit1, unit1,
                        howMuchUnit2, unit2);
            }
            else
            {
                System.out.println("Rejection: Incompatible conversion units.");
            }

        }

    }

}
