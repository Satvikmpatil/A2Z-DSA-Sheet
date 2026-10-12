package main

import "fmt"

func main(){
	nums := []int{4,4,5,5,6}
	ma := make(map[int]int)
	maxC := 0
	moO := nums[0]
	for _,v := range nums{
		ma[v] ++
	}
	for k, v := range ma{
		if v > maxC || (v == maxC &&  k < moO){
			maxC = v
			moO = k
		}
	}
	fmt.Println("MaxCount : ",maxC)
	fmt.Println("MostOcc : ",moO)
	
}