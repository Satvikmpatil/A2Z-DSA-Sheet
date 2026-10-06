package main

import "fmt"



func prime(n int)bool{
	if n == 0 || n==1{
		return false
	}
	if n == 2 {
		return true
	}
	for i := 2; i <= (n / 2); i++ {
		if n % i == 0{
			return false
		}
	}
	return true
}

func main() {
	n := 100
	count := 0
	sum := 0
	for i := 1 ;i <= n; i++{
		if prime(i) == true{
			count++
			sum = sum + i
			fmt.Println(i)
		}
	}
	fmt.Println("Count :",count)
	fmt.Println("Sum :",sum)
}
