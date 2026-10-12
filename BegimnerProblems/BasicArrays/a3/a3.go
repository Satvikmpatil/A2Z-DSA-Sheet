package main

import "fmt"

func main(){
	fmt.Println("Enter the size of array")
	var n int
	fmt.Scan(&n)
	a := make([]int, n)
	fmt.Println("Enter the elems of array")
	for i := 0; i < n; i++ {
		fmt.Scan(&a[i])
	}
	ls := a[0]
	for i := 1; i < n; i++ {
		if a[i] < ls{
			fmt.Println("Not sorted")
			ls = a[i]
			return
		}
	}
	fmt.Println("Sorted")
}