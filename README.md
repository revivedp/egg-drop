# egg-drop

Multiple Java solutions to the _Egg Drop Problem_.

Time Complexity:

    - V0: O(n)
    - V1: O(log n)
    - V2: O(2 log T)
    - V3: O(√n)
    - V4: O(√T)

_EGG DROP PROBLEM_
Suppose that you have an n-story building (with floors 1 through n) and plenty of eggs. An egg breaks if it is dropped from floor T or higher and does not break otherwise. Determine the value of T given the following limitations on the number of eggs and tosses.


SOLUTION V0:
1 egg and T tosses.

Simply write a loop that iterates until _i_ is equal to T.

SOLUTION V1:
Log(n) eggs and Log(n) tosses.

Write a binary search algorithm.

SOLUTION V2:
Log(T) eggs and 2 Log(T) tosses.

Write a method to find the upper bound by exponencially increasing the number of floors attempted until ONE egg is broken. Take that upper bound to determine the lower bound (upper / 2) and write a binary search algorithm using those bounds.

SOLUTION V3:
2 eggs and 2√n tosses.

Define a _x_ variable √n that will be the amount of steps that will take to find the upper bound. Then, linearly, in a loop find the T.

SOLUTION V4:
2 eggs and √T tosses.

In a similar way that V3, define a _x_ variable that will be the base amount of steps + increasing regression (x - 0; x - 1; x -2; x -3; etc.) that will take to find the upper bound. Then, linearly, in a loop find the T.

