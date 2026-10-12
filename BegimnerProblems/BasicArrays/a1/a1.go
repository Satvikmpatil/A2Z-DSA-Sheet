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
	sum := 0
	for i := 0 ;i < n;i++{
		sum = sum + a[i]
	}
	fmt.Println("Sum :",sum)

}