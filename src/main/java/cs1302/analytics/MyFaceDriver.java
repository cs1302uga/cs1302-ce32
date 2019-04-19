package cs1302.analytics;

import cs1302.myface.*;
import cs1302.sorting.*;
import java.util.Comparator;
import java.util.Arrays;

/**
 * A program for testing various sorting algorithms on {@code MyFace} users.
 */
public class MyFaceDriver {

    /**
     * The main entry point for the application.
     */
    public static void main(String[] args) {
        // generate myface users
        MyFace socialNetwork = new MyFace(25);
        MyFaceUser[] users = socialNetwork.getUsers().stream().toArray(MyFaceUser[]::new);
        System.out.printf("MyFace user count: %d\n", users.length);

        Comparator<MyFaceUser> c = (u1, u2) -> countLargeWords(u1) - countLargeWords(u2);
        Swapper<MyFaceUser> s = Swapper.getStandardSwapper();
        Sort<MyFaceUser> sort;

        sort = new QuickSort<>(users, 0, users.length - 1, c, s);
        sort.printStats();
        System.out.println("Total Time: " + getTotal(sort));

        //Print user's messages along with the result of calling countLargeWords to verify
        //that your code is working.

    } // main

    /**
     * Returns the number of words that are 5 characters or more across all of the specified
     * user's messages.
     *
     * @param user a reference to the specified {@code MyFaceUser}.
     * @return the number of large words contained in the specified user's messages.
     */
    public static int countLargeWords(MyFaceUser user) {
        int count = 0;
        
        //TODO: IMPLEMENT ME!
        
        return count;
    } // countLargeWords

    /**
     * Calculates the total runtime in seconds for an algorithm. Total runtime is calculated by 
     * adding the total amount of time spent on comparisons and swaps. 
     *
     * @param sort a reference to the {@code Sort} object containing the statistics for each
     * operation.
     * @return the total runtime in seconds for the algorithm.
     */
    public static double getTotal(Sort<MyFaceUser> sort) {
        double result = sort.getCompStats().getSum() + sort.getSwapStats().getSum();

        //convert to seconds and return the result
        return result / 1.0e9;
    } // getTotal
    
} // MyFaceDriver
