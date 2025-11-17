# Orientation Tasks 2 – Task 4 (Writing)
## Hand simulation of the call centre until one customer of type Y exits the system

Below is the step-by-step three-phase simulation of the call centre described in the course material (two customer types: X every 5 minutes, Y every 10 minutes; router takes 1 minute; Operator 1 serves X in 4 minutes; Operator 2 serves Y in 7 minutes).

I continue the simulation from the given starting point until **the first Y-customer leaves the system**.

| Clock | Phase / Event(s) executed                                                                                     | Router Queue | Router | Op1 Queue | Op1   | Op2 Queue | Op2   | Event List (time)                              | X done | Y done |
|-------|---------------------------------------------------------------------------------------------------------------|--------------|--------|-----------|-------|-----------|-------|------------------------------------------------|--------|--------|
| 0     | **Initialization** – schedule first arrivals                                                                  | –            | Idle   | –         | Idle  | –         | Idle  | B1(5), B2(10)                                  | 0      | 0      |
| 5     | **A** → clock = 5<br>**B** → B1 (X1 arrives) → schedule next B1 at 10<br>**C** → C1 true → start router → schedule B3 at 6 | (empty)      | X1     | –         | Idle  | –         | Idle  | B3(6), B2(10), B1(10)                          | 0      | 0      |
| 6     | **A** → clock = 6<br>**B** → B3 (router finishes X1) → move X1 to Op1 queue<br>**C** → C2 true → Op1 starts X1 → schedule B4 at 10 | –            | Idle   | (empty)   | X1    | –         | Idle  | B2(10), B1(10), B4(10)                         | 0      | 0      |
| 10    | **A** → clock = 10<br>**B** → B2 (Y1 arrives), B1 (X2 arrives), B4 (X1 finishes) → X done = 1<br>→ schedule next B1 at 15, next B2 at 20 | Y1,X2        | Idle   | –         | Idle  | –         | Idle  | B3(11), B1(15), B2(20)                         | 1      | 0      |
| 11    | **A** → clock = 11<br>**B** → B3 (router finishes Y1) → move Y1 to Op2 queue<br>**C** → C1 true → router takes X2 → schedule B3 at 12<br>  C3 true → Op2 starts Y1 → schedule B5 at 18 | X2           | X2     | –         | Idle  | (empty)   | Y1    | B3(12), B1(15), B5(18), B2(20)                 | 1      | 0      |
| 12    | **A** → clock = 12<br>**B** → B3 (router finishes X2) → move X2 to Op1 queue<br>**C** → C2 true → Op1 starts X2 → schedule B4 at 16 | –            | Idle   | (empty)   | X2    | –         | Y1    | B1(15), B4(16), B5(18), B2(20)                 | 1      | 0      |
| 18    | **A** → clock = 18<br>**B** → B5 (Operator 2 finishes Y1) → Y1 leaves the system<br>→ **Y done = 1**                                      | –            | Idle   | –         | X2    | Idle      | Idle  | B1(15), B4(16), B2(20)                         | 1      | **1**  |

### Result
**The first customer of type Y (Y1) exits the system at simulation time 18 minutes.**

At this point the required condition is satisfied, so the hand simulation stops here.
