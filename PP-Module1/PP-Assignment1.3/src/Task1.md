# Orientation Task 3 – Task 1 (Writing)

**Question:**  
How do you generate 1000 random ages that follow the real age distribution of students in your group?

**Answer – Algorithm (Empirical Distribution Sampling)**

We basically use the **empirical (observed) distribution** method like how its used in the "Your own distribution" example.

**Steps:**

1. **Collect real data** – Count how many students are 18, 19, 20, ..., 30+ years old.
2. **Convert to cumulative percentages**:
    - Example: 5 students 19 y/o → 5%, cumulative = 5%
    - 12 students 20 y/o → 12%, cumulative = 17%
    - ...
    - 100% at the oldest age
3. **Create a lookup table**:
   ```java
   int[][] ageTable = {
       {5,  19},   // 1–5  → age 19
       {17, 20},   // 6–17 → age 20
       {40, 21},   // 18–40→ age 21
       ...
       {100, 28}   // 95–100 → age 28
   };