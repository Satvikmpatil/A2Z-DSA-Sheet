package main

import "fmt"

func main() {
	n := 4
	// TODO: implement pattern
	fmt.Println(n)
	k :=1
	for i := 0 ;i<n;i++{
		for j := 0;j<=i;j++{
			fmt.Print(k)
			k++
		}
		fmt.Println()
	}
}
