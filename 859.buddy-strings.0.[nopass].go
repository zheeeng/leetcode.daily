/*
 * @lc app=leetcode id=859 lang=golang
 *
 * [859] Buddy Strings
 */
// Time Limit Exceeded
func buddyStrings(A string, B string) bool {
    lenA := len(A)
    lenB := len(B)
    if lenA != lenB {
        return false
    }
    for i, _ := range A {
        for j := i + 1; j < lenA; j++ {
            if A[i] == B[j] && A[j] == B[i] {
                bA := []byte(A)
                bA[i], bA[j] = bA[j], bA[i]
                if (string(bA) == B) {
                    return true
                }
            }
        }
    }
    return false
}
