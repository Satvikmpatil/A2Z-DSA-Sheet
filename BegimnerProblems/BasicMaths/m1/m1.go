package main

import "fmt"

func main(){
	n := 1234
	c := 0
	for n > 0 {
		n = n/10
		c++
	}
	fmt.Println("Count : ",c)
}