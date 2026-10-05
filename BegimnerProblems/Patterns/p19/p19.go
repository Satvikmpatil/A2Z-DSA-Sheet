package main

import "fmt"

func main() {
	n := 4
	// TODO: implement pattern
	fmt.Println(n)
	for i:=0;i<n;i++{
		for j :=i;j<n;j++{
			fmt.Print("*")
		}
		for j :=0;j<=i;j++{
			fmt.Printf(" ")
		}
		for j :=1;j<=i;j++{
			fmt.Printf(" ")
		}
		for j :=i;j<n;j++{
			fmt.Print("*")
		}
		fmt.Println()
	}
	for i:=n-1;i>=0;i--{
		for j :=i;j<n;j++{
			fmt.Print("*")
		}
		for j :=0;j<=i;j++{
			fmt.Printf(" ")
		}
		for j :=1;j<=i;j++{
			fmt.Printf(" ")
		}
		for j :=i;j<n;j++{
			fmt.Print("*")
		}
		fmt.Println()
	}
}
