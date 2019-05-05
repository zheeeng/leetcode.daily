/*
 * @lc app=leetcode id=874 lang=golang
 *
 * [874] Walking Robot Simulation
 */
func robotSim(commands []int, obstacles [][]int) int {
    x, y := 0, 0
    xDir, yDir := 0, 1
    for _, command := range commands {
        switch command {
        case -1:
            xDir, yDir = yDir, -xDir
        case -2:
            xDir, yDir = -yDir, xDir
        default:
            diffX := xDir * command
            diffY := yDir * command
            for _, o := range obstacles {
                if o[0] == x {
                    if diffY > 0 && o[1] > y && o[1] <= y + diffY {
                        diffY = o[1] - 1 - y
                        break
                    }
                    if diffY < 0 && o[1] < y && o[1] >= y + diffY {
                        diffY = o[1] - 1 - y
                        break
                    }
                }
                if o[1] == y {
                    if diffX > 0 && o[0] > x && o[0] <= x + diffX {
                        diffX = o[0] - 1 - x
                        break
                    }
                    if diffX < 0 && o[0] < x && o[0] >= x + diffX {
                        diffX = o[0] - 1 - x
                        break
                    }
                }
            }

            x += diffX
            y += diffY
        }
    }
    return x * x + y * y
}
