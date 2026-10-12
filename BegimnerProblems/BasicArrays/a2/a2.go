package main

import "fmt"

func main(){
	a := []int{1,4,2,5,1,3,6}
	odd :=0
	for _,k := range a{
		if k%2!=0{
			odd++
		}
	} 
	fmt.Println("Odd :",odd)
}