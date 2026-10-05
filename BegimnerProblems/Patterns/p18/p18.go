package main

import "fmt"

func main() {
	n := 4
	for i := 0; i < n; i++ {
		for j := 0; j <= i; j++ {
			fmt.Printf("%c ", 'A'+n-1-i+j)
		}
		fmt.Println()
	}
}
