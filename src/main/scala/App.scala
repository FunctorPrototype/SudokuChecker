import java.nio.charset.Charset

import sudoku.SudokuCheckerUtils

object App {
  def main(args: Array[String]) = {

    val rightSudoku: Array[Array[Int]] = Array(
      Array(7, 2, 6, 4, 9, 3, 8, 1, 5),
      Array(3, 1, 5, 7, 2, 8, 9, 4, 6),
      Array(4, 8, 9, 6, 5, 1, 2, 3, 7),
      Array(8, 5, 2, 1, 4, 7, 6, 9, 3),
      Array(6, 7, 3, 9, 8, 5, 1, 2, 4),
      Array(9, 4, 1, 3, 6, 2, 7, 5, 8),
      Array(1, 9, 4, 8, 3, 6, 5, 7, 2),
      Array(5, 6, 7, 2, 1, 4, 3, 8, 9),
      Array(2, 3, 8, 5, 7, 9, 4, 6, 1)
    )
    println(SudokuCheckerUtils.regularChecker(rightSudoku))

  }
}
