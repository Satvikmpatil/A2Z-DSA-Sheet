package main

import "fmt"

func main() {
	n := 4
	// TODO: implement pattern
	fmt.Println(n)
	for i:= 0;i<n;i++{
		for j:=0;j<=i;j++{
			fmt.Print(j+1)
		}
		for j:=i+1;j<n;j++{
			fmt.Print("  ")
		}
		for j:=0;j<=i;j++{
			fmt.Print(i+1-j)
		}
		fmt.Println()
	}
}
