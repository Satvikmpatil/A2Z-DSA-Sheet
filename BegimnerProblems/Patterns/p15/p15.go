package main

import "fmt"

func main() {
	n := 4
	// TODO: implement pattern
	fmt.Println(n)
	for i:=0;i<n;i++{
		for j :=0;j+i<n;j++{
			fmt.Printf("%c",65+j)
		}
		fmt.Println()
	}
}
