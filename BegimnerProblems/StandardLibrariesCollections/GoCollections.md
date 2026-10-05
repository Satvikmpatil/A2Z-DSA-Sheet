# Go Collections & Data Structures

## Built-in (Native)

| Collection | Syntax | Dynamic? |
|------------|--------|----------|
| **Array** | `[5]int{1,2,3,4,5}` | No (fixed) |
| **Slice** | `[]int{1,2,3}` | Yes |
| **Map** | `map[string]int{}` | Yes |

---

## Standard Library

| Collection | Package |
|------------|---------|
| Linked List | `container/list` |
| Heap | `container/heap` |
| Ring | `container/ring` |

---

## Not Built-in (DIY)

| Collection | How to Make |
|------------|-------------|
| HashSet | `map[T]bool{}` |
| Stack | slice |
| Queue | slice |
| BST/Tree | struct |
| Graph | map + slice |

---

## Examples

### Array (Fixed Size)
```go
arr := [3]int{1, 2, 3}
fmt.Println(arr[0]) // 1
```

### Slice (Dynamic Array) - USE MOST
```go
s := []int{1, 2, 3}
s = append(s, 4)       // add
s = s[:len(s)-1]       // remove last
fmt.Println(len(s))    // length
```

### Map (Key-Value / HashMap)
```go
m := map[string]int{
    "a": 1,
    "b": 2,
}
m["c"] = 3             // add
delete(m, "a")         // remove
val, ok := m["b"]      // get (ok = exists?)
```

### Set (Using Map)
```go
set := map[int]bool{}
set[5] = true          // add
delete(set, 5)         // remove
if set[5] {            // check exists
    fmt.Println("exists")
}
```

### Stack (Using Slice)
```go
stack := []int{}

// Push
stack = append(stack, 1)
stack = append(stack, 2)

// Peek
top := stack[len(stack)-1]

// Pop
stack = stack[:len(stack)-1]

// Empty?
isEmpty := len(stack) == 0
```

### Queue (Using Slice)
```go
queue := []int{}

// Enqueue
queue = append(queue, 1)
queue = append(queue, 2)

// Peek
front := queue[0]

// Dequeue
queue = queue[1:]

// Empty?
isEmpty := len(queue) == 0
```

### Linked List (container/list)
```go
import "container/list"

l := list.New()
l.PushBack(1)          // add to end
l.PushFront(0)         // add to front
l.Remove(l.Front())    // remove first
```

### Priority Queue (container/heap)

**Min Heap Example:**
```go
package main

import (
	"container/heap"
	"fmt"
)

// MinHeap type
type MinHeap []int

func (h MinHeap) Len() int           { return len(h) }
func (h MinHeap) Less(i, j int) bool { return h[i] < h[j] } // Min: < | Max: >
func (h MinHeap) Swap(i, j int)      { h[i], h[j] = h[j], h[i] }

func (h *MinHeap) Push(x any) {
	*h = append(*h, x.(int))
}

func (h *MinHeap) Pop() any {
	old := *h
	n := len(old)
	x := old[n-1]
	*h = old[:n-1]
	return x
}

func main() {
	h := &MinHeap{5, 3, 8, 1}
	heap.Init(h)           // build heap

	heap.Push(h, 2)        // add
	fmt.Println((*h)[0])   // peek min: 1

	min := heap.Pop(h)     // remove min
	fmt.Println(min)       // 1
}
```

**Quick Usage:**
```go
h := &MinHeap{}
heap.Init(h)

heap.Push(h, 5)        // add
heap.Push(h, 2)
heap.Push(h, 8)

top := (*h)[0]         // peek (smallest)
val := heap.Pop(h)     // remove smallest
```

**Max Heap:** Change `<` to `>` in `Less()`:
```go
func (h MaxHeap) Less(i, j int) bool { return h[i] > h[j] }
```

---

## Quick Reference

| Need This | Use This |
|-----------|----------|
| Dynamic array | `[]T` slice |
| Key-value store | `map[K]V` |
| Unique items (Set) | `map[T]bool` |
| LIFO (Stack) | slice |
| FIFO (Queue) | slice |
| Linked List | `container/list` |
| Priority Queue | `container/heap` |
| Tree/BST/Graph | Custom struct |

---

## Remember
> Go keeps it simple. Slice + Map = 90% of what you need.
