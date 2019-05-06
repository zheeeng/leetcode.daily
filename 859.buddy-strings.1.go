/*
 * @lc app=leetcode id=859 lang=golang
 *
 * [859] Buddy Strings
 */
func buddyStrings(A string, B string) bool {
    lenA := len(A)
    lenB := len(B)
    if lenA != lenB {
        return false
    }

    if A == B {
        for i, _ := range A {
            for j := i + 1; j < lenA; j++ {
                if A[i] == A[j] {
                    return true
                }
            }
        }
        return false
    }

    diffs := []int{}
    for i, _ := range A {
        if A[i] != B[i] {
            diffs = append(diffs, i)
        }
    }

    if len(diffs) != 2 {
        return false
    }

    bA := []byte(A)
    bA[diffs[0]], bA[diffs[1]] = bA[diffs[1]], bA[diffs[0]]
    if (string(bA) == B) {
        return true
    }

    return false
}
