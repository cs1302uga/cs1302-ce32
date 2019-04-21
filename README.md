# cs1302-ce100000_2 Streams / Recursion Practice

In this class exercise, students will further explore the use of the Java Stream API and
recursion.

## References and Prerequisites

* Stream Reading **ADD Link**
* Recursion Reading **ADD Link**

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are
logged into the Nike server.

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full
command that you typed to make the related action happen. If context is necessary (e.g., the
command depends on your present working directory), then please note that context as well.

### Getting Started

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce32`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-ce32.git
   ```

1. Change into the `cs1302-ce32` directory that was just created and look around. There are couple
   files distributed with the exercise to get you started on the questions below.

## Exercise Steps

1. Open `MyFaceDriver.java`. Most of the code should look familiar from previous exercises.
   Read through the main method and make sure you have a good idea of what it does.

1. In `MyFaceDriver.java`, implement the method called `countLargeWords`
   **without using loops**. This method takes a `MyFaceUser` as an
   argument and returns the total number of words with  `5` or more
   characters across all of their messages. You may need to reference the
   [MyFace Message API](http://cobweb.cs.uga.edu/~mec/cs1302-mvn-site/cs1302-myface/apidocs/index.html).

1. In `main`, use the array returned by `sort.getSorted()` to ensure that
   your `countLargeWords` method is working properly. For each user in the
   array, you should print the following **without using loops**:

   * the contents of all messages owned by the user; and
   * the count of large words.

   Feel free to write this code in a method instead of directly in `main`.
   Make your print statements clear so that you can easily check that your
   method is working.

   **NOTES:**

   * Each user has a random number of messages between `0` and the
     social network size divided by `10`. That is [`0`, `50/10`].

   * You are reading people's messages. **We don't encourage this
     behavior, in general.** I know it says we can do it in the
     [EULA](https://en.wikipedia.org/wiki/End-user_license_agreement),
     but we know that most MyFace users don't read that thing. Also, some of
     the messages might be a bit odd (people write weird stuff sometimes) -- the
     contents of the messages were populated from the
     [Fortune Cookie Database](https://github.com/bmc/fortunes).

1. Stage and commit your changes locally.

**CHECKPOINT**

Problem B: Sweet Tarts
Sweet Tarts are a hard candy similar to Life Savers. They come in a roll with n Sweet Tarts per roll
and there are four flavors (A, B, C, and D). The package is clear so you can see the order of the flavors
in the roll. You can only get a Sweet Tart from either end of the roll; no breaking open the package
in the middle. Furthermore, you immediately eat a Sweet Tart once you remove it from the package.
Now you have a definite preference for the flavors and like to save your favorites until the end. Being
the computer science type, you’ve come up with a score for the order in which you eat the candies. You
give each of the flavors a number from 1 through 4, depending on your preference (4 is most favored, 1
is least). The score for eating a Sweet Tart is the product of its preference number with the position
you ate it. For example if you ate a flavor B as the 5th Sweet Tart, and B had preference number 3,
then it’s score would be 15.
After you’ve eaten the entire roll, the score is the sum of all the individual Sweet Tarts eaten. Of course,
you’d like to maximize the score. Given a particular roll of Sweet Tarts and the preference order of the
four flavors, you’ll compute the maximum score of the roll. (Note there may be more than one way of
realizing the score.)
Input
There will be multiple input sets. Each input set will have 3 lines. The first line will contain n (n ≤ 100),
the number of Sweet Tarts in the roll. A value of n = 0 indicates there are no more input sets for this
problem. The second line will contain a permutation of {A,B,C,D} indicating preference for the flavors
(most favored to least). The third line will contain the n flavors as they appear in the roll, from left to
right. Note that it may be that not all flavors will be used.
Output
Each input set should produce one line of output of the form:
Case i has a maximum score of s.
where i is the number of the input set (starting at 1) and s is the maximum score you determine.
Sample Input
4
BCDA
ABCD
5
BACD
AAAAA
6
BCDA
BACCCC
0
Sample Output
Case 1 has a maximum score of 30.
Case 2 has a maximum score of 45.
Case 3 has a maximum score of ****.
**CHECKPOINT**
<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
