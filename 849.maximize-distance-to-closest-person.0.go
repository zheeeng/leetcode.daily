/*
 * @lc app=leetcode id=849 lang=golang
 *
 * [849] Maximize Distance to Closest Person
 */
func maxDistToClosest(seats []int) int {
    l := len(seats)

    max2 := -1
    max3 := -1
    for i := 0; i < l; i++ {
        if seats[i] == 1 && max2 == -1 {
            max2 = i
        }
        if seats[l - 1 - i] == 1 && max3 == -1 {
            max3 = i
        }
        if max2 != -1 && max3 != -1 {
            break
        }
    }

    lastIndex := 0
    max := -1
    for i := 0; i < l; i++ {
        n := seats[i]
        if n != 1 {
            continue
        }
        dis := i - lastIndex
        if dis > max {
            max = dis
        }
        lastIndex = i
    }

    max = max / 2

    if max >= max2 && max >= max3 {
        return max
    }

    if max2 >= max && max2 >= max3 {
        return max2
    }

    return max3
}
