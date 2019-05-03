/*
 * @lc app=leetcode id=933 lang=golang
 *
 * [933] Number of Recent Calls
 */
type RecentCounter struct {
    lastPingAt []int
}

func Constructor() RecentCounter {
    return RecentCounter{}
}

func (this *RecentCounter) Ping(t int) int {
    for len(this.lastPingAt) > 0 && this.lastPingAt[0] < t - 3000 {
        this.lastPingAt = this.lastPingAt[1:]
    }
    this.lastPingAt = append(this.lastPingAt, t)
    return len(this.lastPingAt)
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * obj := Constructor();
 * param_1 := obj.Ping(t);
 */
