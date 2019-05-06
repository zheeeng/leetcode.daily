/*
 * @lc app=leetcode id=860 lang=golang
 *
 * [860] Lemonade Change
 */
func lemonadeChange(bills []int) bool {
    got5 := []int{}
    got10 := []int{}
    got20 := []int{}
    for _, b := range bills {
        if b == 5 {
            got5 = append(got5, 5)
        } else if b == 10 {
            if len(got5) > 0 {
                got5 = got5[1:]
                got10 = append(got10, 10)
            } else {
                return false
            }
        } else if b == 20 {
            if len(got10) > 0 && len(got5) > 0 {
                got10 = got10[1:]
                got5 = got5[1:]
                got20 = append(got20, 20)
            } else if len(got5) > 2 {
                got5 = got5[3:]
                got20 = append(got20, 20)
            } else {
                return false
            }
        }
    }
    return true
}
