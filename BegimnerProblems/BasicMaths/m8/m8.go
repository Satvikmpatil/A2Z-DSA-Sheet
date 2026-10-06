package main

import "fmt"

func main(){
	n := 28
	sum := 0
	for i:= 1;i<=(n/2);i++{
		if n % i==0{
			sum = sum + i
		}
	}
	if sum == n {
		fmt.Println("Perfect Number")
	} else {
		fmt.Println("Not Perfect Number")
	}
}