package main

import "fmt"

func res(num int)int{
	if num == 0|| num ==1{
		return 1
	}
	return num * res(num-1)
}

func main(){
	n := 3
	mul := 1
	for i := n ;i > 1;i--{
		mul = mul * i
	}
	fmt.Println("Fact : ",mul)
	fmt.Println("RFact : ",res(n))
}