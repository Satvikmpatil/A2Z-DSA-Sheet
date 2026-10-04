package main

import "fmt"

func main() {
	n := 4
	// TODO: implement pattern
	fmt.Println(n)
	f := 2
	for i:=0;i<n;i++{
		for j := 0;j<=i;j++{
			if f % 2 ==0{
				fmt.Print(1)
				f++
			}else{
				fmt.Print(0)
				f++
			}
			
		}
		fmt.Println()
	}
}
