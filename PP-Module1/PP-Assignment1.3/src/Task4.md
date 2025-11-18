
---

### Task 4 (W) – `Task3_4.md`

```markdown
# Orientation Task 3 – Task 4 (Writing)

**Useful distributions in simulation:**

| Distribution       | Real-world Example                          | Use in Simulator                     |
|--------------------|----------------------------------------------|--------------------------------------|
| **Exponential**    | Time between customer arrivals               | Inter-arrival times                  |
| **Normal**         | Service time with small variation            | Human operator service time          |
| **Uniform**        | Random selection (e.g. 50–50 choice)         | Coin flip, random routing            |
| **Poisson**        | Number of arrivals in 1 hour                 | Rarely used directly (use Exp instead)|
| **Erlang/Gamma**   | Service with phases (e.g. multi-step)        | Complex services                     |
| **Discrete Empirical** | Real measured data (e.g. age, delay)     | When real data exists                |

**Best for our simulator:**
- **Exponential** → customer arrivals (memoryless property)
- **Normal** → service times (realistic variation)
- **Discrete** → when we have collected real data