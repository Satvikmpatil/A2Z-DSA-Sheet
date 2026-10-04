package main

import "fmt"

func main() {
	fmt.Println("Enter the number")
	var n int
	fmt.Scan(&n)
	for i := 1; i <= n; i++ {
		for j := 1; j+i <= n+1; j++ {
			fmt.Print(j)
		}
		fmt.Println()
	}
}
