# 3501lab5
## Overview
I used an implementation of the Gale Shapley algorithm for this lab as I found the stable marriage problem to be very similar to the programmer and company hiring problem.
I based my algorithm off of the code provided by geeksforgeeks https://www.geeksforgeeks.org/stable-marriage-problem/
## How to Run
The testing suite is setup in Main.java
There is a demo test setup using the provided table from the lab, additional testing can be done through the command line when main.java is run.
The pairing system uses hashmaps to give values to each preference, so you must provide the value in the ranking along with the programmer or company.
## Pairing Analysis

The pairing `{A=p2, B=p3, C=p1, D=p5, E=p4}` is satisfactory if no programmer or company can improve their situation by switching partners. Given the preferences:

- **p2 and A** are satisfied because A prefers p2 the most.
- **p3 and B** are satisfied because B prefers p3 the most.
- **p1 and C** are satisfied because C prefers p1 the most.
- **p5 and D** are not ideally matched, but D prefers p5 over p4.
- **p4 and E** are satisfied because E prefers p4 the most.

Despite some unsatisfactory pairings (e.g., p2 with A and p5 with D), the overall pairing is considered satisfactory because no one can improve their situation by switching partners.