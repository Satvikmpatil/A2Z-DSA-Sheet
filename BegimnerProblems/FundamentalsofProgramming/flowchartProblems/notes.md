# Flowchart Problem-Solving

## Problem-Solving Steps

```
Understand → Draw → Dry-run → Code
```

---

## Before Drawing, Ask:
1. What **input** is given?
2. What **output** is needed?
3. What **conditions** create different paths?
4. What **repeats**?

---

## Problem 1: Largest of 3 Numbers

```
       ┌───────────┐
       │   Start   │
       └─────┬─────┘
             ▼
       ┌───────────┐
       │Read a,b,c │
       └─────┬─────┘
             ▼
       ┌───────────┐
       │ largest=a │
       └─────┬─────┘
             ▼
          ╱╲
         ╱  ╲
        ╱b >  ╲___Yes__→ largest=b
        ╲largest╱            │
         ╲  ? ╱              │
          ╲╱ ◀───────────────┘
           │ No
           ▼
          ╱╲
         ╱  ╲
        ╱c >  ╲___Yes__→ largest=c
        ╲largest╱            │
         ╲  ? ╱              │
          ╲╱ ◀───────────────┘
           │ No
           ▼
       ┌───────────┐
       │  Print    │
       │  largest  │
       └─────┬─────┘
             ▼
       ┌───────────┐
       │    End    │
       └───────────┘
```

**Java:**
```java
int largest = a;
if (b > largest) { largest = b; }
if (c > largest) { largest = c; }
System.out.println(largest);
```

---

## Problem 2: Sum of 1 to N

```
       ┌───────┐
       │ Start │
       └───┬───┘
           ▼
       ┌───────┐
       │Read N │
       └───┬───┘
           ▼
       ┌───────┐
       │sum = 0│
       │i = 1  │
       └───┬───┘
           ▼
          ╱╲
         ╱  ╲
        ╱i<=N╲___No___→ Print sum → End
        ╲  ? ╱
         ╲  ╱
          ╲╱
           │ Yes
           ▼
       ┌────────┐
       │sum += i│
       │ i++    │
       └───┬────┘
           │
           └──────┘ (loop back)
```

**Java:**
```java
int sum = 0;
for (int i = 1; i <= n; i++) {
    sum += i;
}
System.out.println(sum);
```

---

## Problem 3: Sum of Digits

**Logic:** Extract last digit with `% 10`, remove it with `/ 10`

```
472 → 2 (472%10) → 47 (472/10)
47  → 7 (47%10)  → 4  (47/10)
4   → 4 (4%10)   → 0  (4/10)

Sum = 2 + 7 + 4 = 13
```

**Java:**
```java
int sum = 0;
while (n > 0) {
    sum += n % 10;
    n /= 10;
}
System.out.println(sum);
```

---

## Problem 4: Grade Classification

| Marks | Grade |
|-------|-------|
| 90-100 | A |
| 75-89 | B |
| 60-74 | C |
| 40-59 | D |
| 0-39 | F |

**Java:**
```java
if (marks >= 90) {
    System.out.println("A");
} else if (marks >= 75) {
    System.out.println("B");
} else if (marks >= 60) {
    System.out.println("C");
} else if (marks >= 40) {
    System.out.println("D");
} else {
    System.out.println("F");
}
```

> Order matters! Check highest first.

---

## Key Terms

| Term | Meaning |
|------|---------|
| Validation | Check if input is valid |
| Boundary | Value where behavior changes (e.g., 40, 90) |
| Accumulator | Variable storing growing result (`sum`) |
| Counter | Variable counting steps (`i`) |

---

## Remember
> Validate first → Calculate → Decide → Output
