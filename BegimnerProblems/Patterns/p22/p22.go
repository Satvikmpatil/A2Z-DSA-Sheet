package main

import "fmt"

func main() {
	n := 4
	// TODO: implement pattern
	fmt.Println(n)
	for i := 0; i < 2*n-1; i++ {
		for j := 0 ; j < 2*n-1; j++ {
			to := i
			lf := j
			bo := (2*n-2)-to
			ri := (2*n-2)-lf
			fmt.Print(n-min(min(to,bo),min(lf,ri))," ")
		}
		fmt.Println()
	}
}
