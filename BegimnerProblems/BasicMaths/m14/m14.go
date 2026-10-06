package main

import "fmt"

func divisors(n  int) [] int{
	var num []int
	for i := 1 ;i<=n/2;i++{
		if n %i ==0{
			num = append(num,i)
		}
	}
	return num
}

func main() {
	n := 6
	fmt.Println("divisors :",divisors(n))
}
