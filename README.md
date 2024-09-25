# 3501lab5

## Overview

I used an implementation of the Gale Shapley algorithm for this lab as I found the stable marriage problem to be very similar to the programmer and company hiring problem. I based my algorithm off of the code provided by GeeksforGeeks: <https://www.geeksforgeeks.org/stable-marriage-problem/>

## How to Run

There are two separate testing files. `StaticTest.java` contains pre-configured tests, while `CLITesting.java` uses the command line to take user input for writing new tests. Running the file will provide you with prompts to walk you through setting up a table.

## Pairing Analysis

Looking at the example provided in the assignment details, the pairing `{A=p2, B=p1, C=p5, D=p3, E=p4}` is satisfactory if no programmer or company can improve their situation by switching partners. Given the preferences:

- **p2 and A** are satisfied because A prefers p2 the most.
- **p1 and B** are satisfied because B prefers p1 the most.
- **p5 and C** are satisfied because C prefers p5 the most.
- **p3 and D** are not ideally matched, because D prefers p1 the most.
- **p4 and E** are not ideally matched, because E prefers p2 the most.

Despite some unsatisfactory pairings, the overall pairing is considered satisfactory because no one can improve their situation by switching partners, and the majority of the groups are satisfied. The number of programmers and companies is finite, and programmers cannot apply to the same company twice, so the algorithm is guaranteed to terminate.

### Efficiency

The worst-case scenario would be when every programmer applies to every company. With `n` programmers and `n` companies, we have `n*n` applications. For each application, we have to check if the company prefers the new programmer over its current match, which takes constant time as it's just a single comparison. This leads to a final worst-case run time complexity of `O(n^2)`.
