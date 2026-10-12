package main

import (
	"fmt"
	"math"
)

func main(){
	num := []int{4,4,5,5,6}
	ma := make(map[int]int)
	for _,v := range num{
		ma[v]++
	}
	maxC := 0
	minC := math.MaxInt
	for _,v := range ma{
		if maxC < v {
			maxC = v
		}
		if minC > v{
			minC =v
		}
	}
	fmt.Println("Sum of Highest and Lowest Frequency: ",maxC+minC)
}