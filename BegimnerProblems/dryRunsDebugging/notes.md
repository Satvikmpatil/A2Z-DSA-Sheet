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

```go
sum := 0
for n > 0 {
    sum += n % 10
    n /= 10
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
```go
// WRONG - i never changes
for i <= n {
    fmt.Println(i)
}

// FIX - add i++
for i <= n {
    fmt.Println(i)
    i++
}
```

### Bug 2: Wrong Init Value
```go
// WRONG - factorial always 0
answer := 0
for i := 1; i <= n; i++ {
    answer *= i
}

// FIX - start with 1
answer := 1
for i := 1; i <= n; i++ {
    answer *= i
}
```

### Bug 3: Off-by-One
```go
// WRONG - misses last element
for i := 0; i < n; i++   // runs 0 to n-1

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
