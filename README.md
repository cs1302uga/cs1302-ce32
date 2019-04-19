# cs1302-ce32 Streams / Recursion Practice

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

1. Open the file named `MyFaceDriver.java`. Most of the code contained in the file should look
   familiar from our exercises last week. Read through the main method and make sure you
   have a good idea of what it does.
   
1. In `MyFaceDriver.java`, implement the method called `countLargeWords` *without using loops*.
   This method takes a `MyFaceUser` as an argument and returns the total number of words with
   `5` or more characters across all of their messages. You may need to reference the
   [MyFace Message API](http://cobweb.cs.uga.edu/~mec/cs1302-mvn-site/cs1302-myface/apidocs/index.html).
   
   To make sure your method is working properly, print the contents of all messages for each
   user along with the total count of large words across all messages. Again, *no loops*.
   However, feel free to write this code in a method instead of directly in main. Make your print
   statements clear so that you can easily check that your method is working.
   **Note:** Each user has a random number of messages between `0` and the social network
   size divided by 10. That is [`0`, `25/10`]. 
   
   **Warning:** You are reading people's messages. **We don't encourage this behavior, in general.** 
   I know it says we can do it in the [EULA](https://en.wikipedia.org/wiki/End-user_license_agreement),
   but we know that most MyFace users don't read that thing. Also, some of the messages might be a bit 
   odd (people write weird stuff sometimes) -- the contents of the messages were populated from the 
   [Fortune Cookie Database](https://github.com/bmc/fortunes).
   
   1. Stage and commit your changes locally.

**CHECKPOINT**

     
<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
