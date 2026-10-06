package main

import "fmt"

func main(){
	n := 15222
	c := 0
	for n > 0 {
		k := n%10
		if k % 2 != 0{
			c++
		}
		n = n/10
	}
	fmt.Println("Count : ",c)
}