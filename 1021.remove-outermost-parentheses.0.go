/*
 * @lc app=leetcode id=1021 lang=golang
 *
 * [1021] Remove Outermost Parentheses
 */
func removeOuterParentheses(S string) string {
    count := 0
    ret := ""
    for _, c := range S {
        if c == '(' {
            count++
            if count != 1 {
                ret = ret + string(c)
            }
        } else {
            count--
            if count != 0 {
                ret = ret + string(c)
            }
        }
    }
    return ret
}
