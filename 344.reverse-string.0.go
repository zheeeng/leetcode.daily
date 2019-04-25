/*
 * @lc app=leetcode id=344 lang=golang
 *
 * [344] Reverse String
 */
func reverseString(s []byte)  {
    l := len(s)
    if l == 0 {
        return
    }
    m := l / 2
    for i := 0; i < m; i++ {
        s[i], s[l - i - 1] =  s[l - i - 1], s[i]
    }
}
