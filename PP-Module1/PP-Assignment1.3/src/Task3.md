# Orientation Task 3 – Task 3 (Writing)

**Why can't a Singleton object be created from outside using `new`?**

Because the **constructor is private**.

In the Singleton pattern:

```java
public class Clock {
    private static Clock instance = new Clock();

    private Clock() { }          // ← PRIVATE!

    public static Clock getInstance() {
        return instance;
    }
}

**Prevents external classes from doing: new Clock()
Forces all access through getInstance()
Guarantees only one instance exists
Full control over creation (lazy/eager, thread-safe, etc.)

This is the core mechanism of the Singleton pattern.
Even if someone tries:
javaClock c = new Clock();  // ← Compiler error!
→ Impossible outside the class.**
