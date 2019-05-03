/*
 * @lc app=leetcode id=925 lang=golang
 *
 * [925] Long Pressed Name
 */
func isLongPressedName(name string, typed string) bool {
    skip := 0
    lowBound := 0
    nameLen := len(name)
    if typed[len(typed) - 1] != name[nameLen - 1] || typed[0] != name[0] {
        return false
    }
    for i := range typed {
        if i - skip > nameLen - 1 {
            if name[nameLen - 1] != typed[i] {
                return false
            } else {
                continue
            }
        }
        if name[i - skip] == typed[i] {
            lowBound++
        }
        for skip <= i && name[i - skip] != typed[i] {
            skip++
        }
        if i - skip < lowBound  - 1 {
            return false
        }
    }
    return true
}
