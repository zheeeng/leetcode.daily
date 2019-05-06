/*
 * @lc app=leetcode id=844 lang=golang
 *
 * [844] Backspace String Compare
 */
func backspaceCompare(S string, T string) bool {
    backS := 0
    backT := 0
    i, j := len(S) - 1, len(T) - 1
    for i >= 0 || j >= 0 {
        if i >= 0 {

            if S[i] == '#' {
                backS++
                i--
                continue
            }

            if backS > 0 {
                backS--
                i--
                continue
            }

        }

        if j >= 0 {

            if T[j] == '#' {
                backT++
                j--
                continue
            }

            if backT > 0 {
                backT--
                j--
                continue
            }

        }

        if i >= 0 && j >= 0 && S[i] != T[j] {
            return false
        }

        i--
        j--
    }

    return i == -1 && j == -1
}
