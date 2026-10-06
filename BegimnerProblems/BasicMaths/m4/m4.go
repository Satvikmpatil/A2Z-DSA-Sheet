// package main

// import "fmt"

// func main(){
// 	n := 1221
// 	var a []int
// 	for n > 0{
// 		r := n %10
// 		a = append(a, r)
// 		n = n/10
// 	}
// 	i := 0
// 	j := len(a) - 1
// 	for i < j{
// 		if a[i] != a[j]{
// 			fmt.Println("Not Palindrome Number")
// 			return
// 		}
// 		i++
// 		j--
// 	}
// 	fmt.Println("Palindrome Number")
// }

package main

import "fmt"

func main(){
	n := 121
	temp := n
	var rem int 
	rev :=0
	for n > 0 {
		rem = n%10
		rev = rev * 10 + rem
		n = n /10
	}
	if temp == rev {
		fmt.Println("Palindrome Number")
	}else{
		fmt.Println("Not Palindrome Number")
	}
}