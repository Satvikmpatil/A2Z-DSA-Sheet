package main

import "fmt"

func main() {
	n := 9
	for i := 2; i <= (n / 2); i++ {
		if n % i == 0{
			fmt.Println("Not Prime Number")
			return
		}
	}
	fmt.Println("Prime Number")
}
