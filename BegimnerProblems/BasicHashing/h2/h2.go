package main

import "fmt"

func main() {
	nums := []int{4, 4, 5, 5, 6, 7}
	ma := make(map[int]int)
	for _, v := range nums {
		ma[v]++
	}
	maxC := 0
	for _, v := range ma {
		if v > maxC {
			maxC = v
		}
	}
	for k, v := range ma {
		if v == maxC {
			delete(ma, k)
		}
	}
	maxC = 0
	mostOcc := 0
	first := true
	for k, v := range ma {
		if first || v > maxC || (v == maxC && k < mostOcc) {
			maxC = v
			mostOcc = k
			first = false
		}
	}
	fmt.Println("Second Highest Occurring Element:", mostOcc)

}
