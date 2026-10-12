package main

import "fmt"

func main(){
	a := []int{1,2,3,45,6}
	i := 0
	j := len(a) - 1 
	for i<j{
		temp := a[i]
		a[i] = a[j]
		a[j] = temp
		i ++
		j --
	}
	fmt.Println(a)
}