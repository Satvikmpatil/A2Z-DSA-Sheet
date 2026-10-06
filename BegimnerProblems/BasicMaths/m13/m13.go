package main

import "fmt"

func gcd(n ,m int)int{
	if m == 0 {
		return n
	}
	return gcd(m,n%m)
}

func lcm (n,m int)int{
	return (n*m)/gcd(n,m)
}

func main() {
	n := 3
	m := 5
	fmt.Println("LCM :",lcm(n,m))
}
