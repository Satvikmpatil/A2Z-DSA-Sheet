package main

import "fmt"

func main(){
	n := 134241
	c := 0
	for n > 0 {
		m := n % 10
		c = max(m,c)
		n = n/10 
	}
	fmt.Println("Max : ",c)
}