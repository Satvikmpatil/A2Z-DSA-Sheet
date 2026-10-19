# Java Collections & Data Structures

## Built-in (Native)

| Collection | Syntax | Dynamic? |
|------------|--------|----------|
| **Array** | `int[] arr = {1,2,3,4,5}` | No (fixed) |
| **ArrayList** | `new ArrayList<>()` | Yes |
| **HashMap** | `new HashMap<>()` | Yes |

---

## Java Collections Framework

| Collection | Class |
|------------|-------|
| Dynamic Array | `ArrayList` |
| Linked List | `LinkedList` |
| Stack | `Stack` or `Deque` |
| Queue | `LinkedList` or `ArrayDeque` |
| Priority Queue | `PriorityQueue` |
| Set | `HashSet`, `TreeSet` |
| Map | `HashMap`, `TreeMap` |

---

## Not Built-in (DIY)

| Collection | How to Make |
|------------|-------------|
| BST/Tree | class with Node |
| Graph | Map + List |

---

## Examples

### Array (Fixed Size)
```java
int[] arr = {1, 2, 3};
System.out.println(arr[0]); // 1
```

### ArrayList (Dynamic Array) - USE MOST
```java
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();
list.add(1);                    // add
list.add(2);
list.add(3);
list.remove(list.size() - 1);   // remove last
System.out.println(list.size()); // length
```

### HashMap (Key-Value)
```java
import java.util.HashMap;

HashMap<String, Integer> map = new HashMap<>();
map.put("a", 1);               // add
map.put("b", 2);
map.put("c", 3);
map.remove("a");               // remove
int val = map.getOrDefault("b", 0); // get (with default)
boolean exists = map.containsKey("b"); // check exists
```

### HashSet (Unique Items)
```java
import java.util.HashSet;

HashSet<Integer> set = new HashSet<>();
set.add(5);                    // add
set.remove(5);                 // remove
if (set.contains(5)) {         // check exists
    System.out.println("exists");
}
```

### Stack
```java
import java.util.Stack;

Stack<Integer> stack = new Stack<>();

// Push
stack.push(1);
stack.push(2);

// Peek
int top = stack.peek();

// Pop
int popped = stack.pop();

// Empty?
boolean isEmpty = stack.isEmpty();
```

### Queue (Using LinkedList)
```java
import java.util.LinkedList;
import java.util.Queue;

Queue<Integer> queue = new LinkedList<>();

// Enqueue
queue.offer(1);
queue.offer(2);

// Peek
int front = queue.peek();

// Dequeue
int removed = queue.poll();

// Empty?
boolean isEmpty = queue.isEmpty();
```

### LinkedList
```java
import java.util.LinkedList;

LinkedList<Integer> list = new LinkedList<>();
list.addLast(1);               // add to end
list.addFirst(0);              // add to front
list.removeFirst();            // remove first
```

### PriorityQueue (Min Heap by Default)

**Min Heap Example:**
```java
import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        minHeap.offer(5);
        minHeap.offer(3);
        minHeap.offer(8);
        minHeap.offer(1);
        
        System.out.println(minHeap.peek()); // peek min: 1
        
        int min = minHeap.poll();           // remove min
        System.out.println(min);            // 1
    }
}
```

**Max Heap:** Use `Collections.reverseOrder()`:
```java
import java.util.PriorityQueue;
import java.util.Collections;

PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
maxHeap.offer(5);
maxHeap.offer(3);
maxHeap.offer(8);

System.out.println(maxHeap.peek()); // 8
```

---

## Quick Reference

| Need This | Use This |
|-----------|----------|
| Dynamic array | `ArrayList<T>` |
| Key-value store | `HashMap<K,V>` |
| Unique items (Set) | `HashSet<T>` |
| LIFO (Stack) | `Stack<T>` or `ArrayDeque<T>` |
| FIFO (Queue) | `LinkedList<T>` or `ArrayDeque<T>` |
| Linked List | `LinkedList<T>` |
| Priority Queue | `PriorityQueue<T>` |
| Tree/BST/Graph | Custom class |

---

## Remember
> Java Collections Framework gives you everything. ArrayList + HashMap = 90% of what you need.
