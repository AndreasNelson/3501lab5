# 3501lab5

## Pairing Analysis
### Output
#### Unsatisfactory Pairings
Programmer p1 is proposing to Company A
Company A is free and accepts the proposal from Programmer p1
Programmer p2 is proposing to Company A
Company A is currently matched with Programmer p1
Company A prefers Programmer p2 over Programmer p1
Unsatisfactory pairing: A with p1
Programmer p1 is proposing to Company A
Company A is currently matched with Programmer p2
Company A prefers Programmer p2 over Programmer p1
Programmer p1 is proposing to Company B
Company B is free and accepts the proposal from Programmer p1
Programmer p3 is proposing to Company A
Company A is currently matched with Programmer p2
Company A prefers Programmer p2 over Programmer p3
Programmer p3 is proposing to Company B
Company B is currently matched with Programmer p1
Company B prefers Programmer p3 over Programmer p1
Unsatisfactory pairing: B with p1
Programmer p1 is proposing to Company A
Company A is currently matched with Programmer p2
Company A prefers Programmer p2 over Programmer p1
Programmer p1 is proposing to Company B
Company B is currently matched with Programmer p3
Company B prefers Programmer p3 over Programmer p1
Programmer p1 is proposing to Company C
Company C is free and accepts the proposal from Programmer p1
Programmer p4 is proposing to Company A
Company A is currently matched with Programmer p2
Company A prefers Programmer p2 over Programmer p4
Programmer p4 is proposing to Company B
Company B is currently matched with Programmer p3
Company B prefers Programmer p3 over Programmer p4
Programmer p4 is proposing to Company C
Company C is currently matched with Programmer p1
Company C prefers Programmer p1 over Programmer p4
Programmer p4 is proposing to Company D
Company D is free and accepts the proposal from Programmer p4
Programmer p5 is proposing to Company A
Company A is currently matched with Programmer p2
Company A prefers Programmer p2 over Programmer p5
Programmer p5 is proposing to Company B
Company B is currently matched with Programmer p3
Company B prefers Programmer p3 over Programmer p5
Programmer p5 is proposing to Company C
Company C is currently matched with Programmer p1
Company C prefers Programmer p1 over Programmer p5
Programmer p5 is proposing to Company D
Company D is currently matched with Programmer p4
Company D prefers Programmer p5 over Programmer p4
Unsatisfactory pairing: D with p4
Programmer p4 is proposing to Company A
Company A is currently matched with Programmer p2
Company A prefers Programmer p2 over Programmer p4
Programmer p4 is proposing to Company B
Company B is currently matched with Programmer p3
Company B prefers Programmer p3 over Programmer p4
Programmer p4 is proposing to Company C
Company C is currently matched with Programmer p1
Company C prefers Programmer p1 over Programmer p4
Programmer p4 is proposing to Company D
Company D is currently matched with Programmer p5
Company D prefers Programmer p5 over Programmer p4
Programmer p4 is proposing to Company E
Company E is free and accepts the proposal from Programmer p4
Pairing: {A=p2, B=p3, C=p1, D=p5, E=p4}
Checking if Programmer p3 prefers Company A over Company B
Checking if Programmer p1 prefers Company A over Company C
Checking if Programmer p1 prefers Company B over Company C
Checking if Programmer p5 prefers Company A over Company D
Checking if Programmer p5 prefers Company B over Company D
Checking if Programmer p5 prefers Company C over Company D
Checking if Programmer p4 prefers Company A over Company E
Checking if Programmer p4 prefers Company B over Company E
Checking if Programmer p4 prefers Company C over Company E
Checking if Programmer p4 prefers Company D over Company E
Is the pairing satisfactory? true
#### Final Pairing
{A=p2, B=p3, C=p1, D=p5, E=p4}

## Conclusion
The pairing `{A=p2, B=p3, C=p1, D=p5, E=p4}` is satisfactory if no programmer or company can improve their situation by switching partners. Given the preferences:

- **p2 and A** are satisfied because A prefers p2 the most.
- **p3 and B** are satisfied because B prefers p3 the most.
- **p1 and C** are satisfied because C prefers p1 the most.
- **p5 and D** are not ideally matched, but D prefers p5 over p4.
- **p4 and E** are satisfied because E prefers p4 the most.

Despite some unsatisfactory pairings (e.g., p2 with A and p5 with D), the overall pairing is considered satisfactory because no one can improve their situation by switching partners.