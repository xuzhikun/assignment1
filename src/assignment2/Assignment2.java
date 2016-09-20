import java.lang.System;

/**
 * Assignment for your lecture 2. Please finish all the questions under
 * 'Assignment'. Please try the two questions under 'Bonus'. Please write some
 * tests as practice. When you are writing tests, you should think about what
 * situations might cause error? like 0,-1... The deadline of this assignment is
 * 09/22/2016 23:59. Please feel free to contact me for any questions.
 *
 * @author Jia
 */

class Person {
    int age;
    boolean gender;// false --> male, true --> female

    Person(int age, boolean gender) {
        this.age = age;
        this.gender = gender;
    }
}

public class Assignment2 {
    // Assignment
    /**
     * Write a Computer program to find the type of a person and print the type.
     * Infant : If the age is less than 1 year Toddler : If the age is less than
     * 3 and greater than 1 Pre Schooler : If the age is less than 5 and greater
     * than 3 KG Girl : If the age is greater than 5 and less than 6 and the
     * gender is female KG Boy : If the age is greater than 5 and less than 6
     * and the gender is male
     */
    public void personType(Person person) {
        int age = person.age;
        int gender = person.gender;

        if (age < 1) {
            System.out.println("Infant");
        }
        else if (age >= 1 && age < 3) {
            System.out.println("Toddler");
        }
        else if (age >= 3 && age < 5) {
            System.out.println("Pre Schooler");
        }
        else if (age >= 5 && age < 6 && gender) {
            System.out.println("KG Girl");
        }
        else if (age >= 5 && age < 6 && !gender) {
            System.out.println("KG Boy");
        }
    }

    /**
     * Given an integer N as input, check the following: If N is odd, print
     * "Weird". If N is even and, in between the range of 2 and 5(inclusive),
     * print "Not Weird". If N is even and, in between the range of 6 and
     * 20(inclusive), print "Weird". If N is even and N>20, print "Not Weird".
     */
    public void weirdNumber(int n) {
        if (n % 2 != 0) {
            System.out.println("Weird");
        }

        if (n % 2 == 0 && n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        }

        if (n % 2 == 0 && n >= 6 && n <= 20) {
            System.out.println("Weird");
        }

        if (n % 2 == 0 && n > 20) {
            System.out.println("Not Weird");
        }

    }

    /**
     * Write a method to determine whether a number is prime
     */
    public void isPrime(int n) {

    }

    /**
     * Find N fibonacci numbers Fibonacci Number: f(N) = f(N-1)+f(N-2).
     * Typically, f(0)=f(1)=1.
     */
    public int[] fibonacciNumber(int n) {
        return null;
    }

    /**
     * Write a function that takes a string as input and returns the string
     * reversed. Given s = "hello", return "olleh".
     */
    public String reverseString(String s) {
        return null;
    }

    /**
     * Given an array of nums, write a function to find the largest two integer.
     */
    public int[] findTheLargestTwo(int[] nums) {
        return null;
    }

    /**
     * Given an array nums, write a function to move all 0's to the end of it
     * while maintaining the relative order of the non-zero elements. For
     * example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
     * should be [1, 3, 12, 0, 0].
     */
    public void moveZeroes(int[] nums) {

    }

    // Bonus
    /**
     * Given a non-negative integer n, repeatedly add all its digits until the
     * result has only one digit. For example: Given n = 38, the process is
     * like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public int addDigits(int n) {
        return 0;
    }

    /**
     * Write a program to check whether a given number is an ugly number. Ugly
     * numbers are positive numbers whose prime factors only include 2, 3, 5.
     * For example, 6, 8 are ugly, while 14 is not ugly since it includes
     * another prime factor 7. Note that 1 is typically treated as an ugly
     * number.
     */
    public boolean isUgly(int n) {
        return false;
    }

}