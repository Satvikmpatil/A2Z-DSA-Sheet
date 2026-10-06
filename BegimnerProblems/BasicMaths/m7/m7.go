package main

import (
	"fmt"
	"math"
)

func main(){
	n := 12
	original := n
	var a[] int
	for n > 0{
		temp := n % 10
		a = append(a, temp)
		n = n/10
	}
	s := len(a)
	sum := 0
	for i := range a{
		sum = sum + int(math.Pow(float64(a[i]),float64(s)))
	}
	if sum == original {
		fmt.Println("Armstrong")
	} else {
		fmt.Println("Not Armstrong")
	}
}