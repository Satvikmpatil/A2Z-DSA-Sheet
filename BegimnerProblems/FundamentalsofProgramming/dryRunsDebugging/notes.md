# Dry Runs, Edge Cases & Debugging

## Debugging Steps

```
Reproduce → Predict → Trace → Find mismatch → Fix → Retest
```

---

## What is a Dry Run?

Manually execute your code step by step on paper.

**Example: Sum of Digits (472)**

| N | digit (N%10) | sum | N after (N/10) |
|---|--------------|-----|----------------|
| 472 | 2 | 2 | 47 |
| 47 | 7 | 9 | 4 |
| 4 | 4 | 13 | 0 |

**Output: 13**

```java
int sum = 0;
while (n > 0) {
    sum += n % 10;
    n /= 10;
}
```

---

## 3 Types of Errors

| Type | Meaning | Example |
|------|---------|---------|
| **Syntax** | Code grammar wrong | Missing `}` |
| **Runtime** | Crashes while running | Divide by 0 |
| **Logical** | Runs but wrong answer | `>` instead of `>=` |

---

## Edge Cases vs Invalid Input

| Type | Meaning | Example |
|------|---------|---------|
| **Normal** | Common input | age = 25 |
| **Edge** | At boundary (valid) | age = 18 |
| **Invalid** | Outside rules | age = -5 |

---

## Test Around Boundaries

For rule `marks >= 40`:

| Test | Expected |
|------|----------|
| 39 | Fail |
| 40 | Pass |
| 41 | Pass |

> This catches `>` vs `>=` bugs!

---

## Common Bugs

### Bug 1: Loop Never Stops
```java
// WRONG - i never changes
while (i <= n) {
    System.out.println(i);
}

// FIX - add i++
while (i <= n) {
    System.out.println(i);
    i++;
}
```

### Bug 2: Wrong Init Value
```java
// WRONG - factorial always 0
int answer = 0;
for (int i = 1; i <= n; i++) {
    answer *= i;
}

// FIX - start with 1
int answer = 1;
for (int i = 1; i <= n; i++) {
    answer *= i;
}
```

### Bug 3: Off-by-One
```java
// WRONG - misses last element
for (int i = 0; i < n; i++)   // runs 0 to n-1

// Be careful with < vs <=
```

---

## Debugging Checklist

- [ ] Can I reproduce the bug?
- [ ] What's the expected output?
- [ ] Trace variables step by step
- [ ] Where does actual ≠ expected?
- [ ] Fix ONE thing at a time
- [ ] Test edge cases after fix

---

## Remember
> Bug = your logic is wrong, not the computer.
> Find the FIRST mismatch, fix there.
