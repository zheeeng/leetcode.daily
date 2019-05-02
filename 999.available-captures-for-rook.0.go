/*
 * @lc app=leetcode id=999 lang=golang
 *
 * [999] Available Captures for Rook
 */
import (
    "fmt"
)
func getRookPosition(board [][]byte) (int, int) {
    for x := 0; x < 8; x++ {
        for y := 0; y < 8; y++ {
            if board[x][y] == "R"[0] {
                return x, y
            }
        }
    }
    return 0, 0
}
func numRookCaptures(board [][]byte) int {
    x, y := getRookPosition(board)
    count := 0
    for i := x + 1; i < 8; i++ {
        if board[i][y] == "p"[0] {
            count++
            break
        }
        if board[i][y] != "."[0] {
            break
        }
    }
    for i := x - 1; i >= 0; i-- {
        if board[i][y] == "p"[0] {
            count++
            break
        }
        if board[i][y] != "."[0] {
            break
        }
    }
    for j := y + 1; j < 8; j++ {
        if board[x][j] == "p"[0] {
            count++
            break
        }
        if board[x][j] != "."[0] {
            break
        }
    }
    for j := y - 1; j >= 0; j-- {
        if board[x][j] == "p"[0] {
            count++
            break
        }
        if board[x][j] != "."[0] {
            break
        }
    }
    return count
}
