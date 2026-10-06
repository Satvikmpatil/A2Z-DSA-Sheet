package main

import "fmt"

func main(){
	n := 1234
	var rem int 
	rev :=0
	for n > 0 {
		rem = n%10
		rev = rev * 10 + rem
		n = n /10
	}
	fmt.Println("rev : ",rev)
}