package main

import "fmt"



func gcd(n ,m int)int{
	if m == 0 {
		return n
	}
	return gcd(m,n%m)
}

func main() {
	n := 12
	m := 6
	fmt.Println("GCD :",gcd(n,m))
}
