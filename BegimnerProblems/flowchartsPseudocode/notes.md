# Flowcharts and Pseudocode

## What Are They?
- **Flowchart** — Visual diagram of steps
- **Pseudocode** — Written steps (not real code)

---

## Flowchart Symbols

```
  ╭───────────╮
  │   Start   │      Oval = Start / End
  ╰───────────╯

  ╱╲
 ╱  ╲
╱ ?? ╲               Diamond = Decision (Yes/No)
╲    ╱
 ╲  ╱
  ╲╱

┌─────────────┐
│  Process    │      Rectangle = Calculation
└─────────────┘

╱─────────────╲
│   Input     │      Parallelogram = Input/Output
╲─────────────╱

      │
      ▼              Arrow = Flow direction
```

---

## 1. Sequence

```
    ┌─────────┐
    │  Start  │
    └────┬────┘
         │
         ▼
    ┌─────────┐
    │ Read a  │
    └────┬────┘
         │
         ▼
    ┌─────────┐
    │ Read b  │
    └────┬────┘
         │
         ▼
    ┌─────────┐
    │ sum=a+b │
    └────┬────┘
         │
         ▼
    ┌─────────┐
    │  Print  │
    └────┬────┘
         │
         ▼
    ┌─────────┐
    │   End   │
    └─────────┘
```

---

## 2. Selection (If-Else)

```
         ┌─────────┐
         │  Start  │
         └────┬────┘
              │
              ▼
         ┌─────────┐
         │ Read age│
         └────┬────┘
              │
              ▼
           ╱╲
          ╱  ╲
         ╱age ╲
        ╱ >=18 ╲
        ╲  ?   ╱
         ╲    ╱
          ╲  ╱
           ╲╱
      Yes / \ No
         /   \
        ▼     ▼
   ┌──────┐ ┌──────┐
   │Adult │ │Minor │
   └──┬───┘ └──┬───┘
      │        │
      └───┬────┘
          │
          ▼
      ┌───────┐
      │  End  │
      └───────┘
```

---

## 3. Iteration (Loop)

```
       ┌─────────┐
       │  Start  │
       └────┬────┘
            │
            ▼
       ┌─────────┐
       │  i = 1  │
       └────┬────┘
            │
            ▼
         ╱╲
        ╱  ╲
       ╱i<=n╲──── No ───▶ ┌─────┐
       ╲  ? ╱              │ End │
        ╲  ╱               └─────┘
         ╲╱
          │ Yes
          ▼
     ┌─────────┐
     │ Print i │
     └────┬────┘
          │
          ▼
     ┌─────────┐
     │  i++    │◀──┐
     └────┬────┘   │
          │        │
          └────────┘
```

---

## Loop Must Have

1. **Init** — `i := 1`
2. **Condition** — `i <= n`
3. **Body** — what to repeat
4. **Update** — `i++`

---

## Pseudocode Example: Sum 1 to N

```
READ N
SET sum = 0
SET i = 1

WHILE i <= N
    sum = sum + i
    i = i + 1
END WHILE

DISPLAY sum
```

**Go Version:**
```go
sum := 0
for i := 1; i <= n; i++ {
    sum += i
}
fmt.Println(sum)
```

---

## Remember
> Flowchart = see logic. Pseudocode = write logic. Code = run logic.
