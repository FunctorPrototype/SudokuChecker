package sudoku

object TestValuesObject {


  val RightSudoku: Array[Array[Int]] = Array(
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
  val AnotherRightSudoku: Array[Array[Int]] = Array(
    Array(9, 5, 7, 6, 1, 3, 2, 8, 4),
    Array(4, 8, 3, 2, 5, 7, 1, 9, 6),
    Array(6, 1, 2, 8, 4, 9, 5, 3, 7),
    Array(1, 7, 8, 3, 6, 4, 9, 5, 2),
    Array(5, 2, 4, 9, 7, 1, 3, 6, 8),
    Array(3, 6, 9, 5, 2, 8, 7, 4, 1),
    Array(8, 4, 5, 7, 9, 2, 6, 1, 3),
    Array(2, 9, 1, 4, 3, 6, 7, 8, 5),
    Array(7, 3, 6, 1, 8, 5, 4, 2, 9)
  )
  val WrongSudokuLastQuadrant: Array[Array[Int]] = Array(
    Array(7, 2, 6, 4, 9, 1, 3, 8, 5),
    Array(3, 1, 5, 7, 2, 4, 8, 9, 6),
    Array(4, 8, 9, 6, 5, 3, 1, 2, 7),
    Array(8, 5, 2, 1, 4, 9, 7, 6, 3),
    Array(6, 7, 3, 9, 8, 2, 5, 1, 4),
    Array(9, 4, 1, 3, 6, 5, 2, 7, 8),
    Array(1, 9, 4, 8, 3, 7, 6, 5, 2),
    Array(5, 6, 7, 2, 1, 8, 4, 3, 9),
    Array(2, 3, 8, 5, 7, 6, 9, 4, 1)
  )
  val WrongQuadrantSudoku: Array[Array[Int]] = Array(
    Array(7, 1, 2, 6, 4, 9, 3, 8, 5),
    Array(3, 4, 1, 5, 7, 2, 8, 9, 6),
    Array(4, 3, 8, 9, 6, 5, 1, 2, 7),
    Array(8, 9, 5, 2, 1, 4, 7, 6, 3),
    Array(6, 2, 7, 3, 9, 8, 5, 1, 4),
    Array(9, 5, 4, 1, 3, 6, 2, 7, 8),
    Array(1, 7, 9, 4, 8, 3, 6, 5, 2),
    Array(5, 8, 6, 7, 2, 1, 4, 3, 9),
    Array(2, 6, 3, 8, 5, 7, 9, 4, 1)
  )
  val JaggedSudoku: Array[Array[Int]] = Array(
    Array(7, 2, 6, 4, 9, 3, 8, 1),
    Array(3, 1, 5, 7, 2, 8, 9, 4, 6),
    Array(4, 8, 9, 6, 5, 1, 2, 3, 7),
    Array(8, 5, 2, 1, 4, 7, 6, 9, 3),
    Array(6, 7, 3, 9, 8, 5, 1, 2, 4),
    Array(9, 4, 1, 3, 6, 2, 7, 5, 8),
    Array(1, 9, 4, 8, 3, 6, 5, 7, 2),
    Array(5, 6, 7, 2, 1, 4, 3, 8, 9),
    Array(2, 3, 8, 5, 7, 9, 4, 6, 1)
  )
  val SudokuWithItemLessThan1: Array[Array[Int]] = Array(
    Array(0, 2, 6, 4, 9, 3, 8, 1, 5),
    Array(3, 1, 5, 7, 2, 8, 9, 4, 6),
    Array(4, 8, 9, 6, 5, 1, 2, 3, 7),
    Array(8, 5, 2, 1, 4, 7, 6, 9, 3),
    Array(6, 7, 3, 9, 8, 5, 1, 2, 4),
    Array(9, 4, 1, 3, 6, 2, 7, 5, 8),
    Array(1, 9, 4, 8, 3, 6, 5, 7, 2),
    Array(5, 6, 7, 2, 1, 4, 3, 8, 9),
    Array(2, 3, 8, 5, 7, 9, 4, 6, 1)
  )
  val SudokuWithItemGreaterThan9: Array[Array[Int]] = Array(
    Array(10, 2, 6, 4, 9, 3, 8, 1, 5),
    Array(3, 1, 5, 7, 2, 8, 9, 4, 6),
    Array(4, 8, 9, 6, 5, 1, 2, 3, 7),
    Array(8, 5, 2, 1, 4, 7, 6, 9, 3),
    Array(6, 7, 3, 9, 8, 5, 1, 2, 4),
    Array(9, 4, 1, 3, 6, 2, 7, 5, 8),
    Array(1, 9, 4, 8, 3, 6, 5, 7, 2),
    Array(5, 6, 7, 2, 1, 4, 3, 8, 9),
    Array(2, 3, 8, 5, 7, 9, 4, 6, 1)
  )
  val SudokuWithRepeatedItem: Array[Array[Int]] = Array(
    Array(1, 2, 6, 4, 9, 3, 8, 1, 5),
    Array(3, 1, 5, 7, 2, 8, 9, 4, 6),
    Array(4, 8, 9, 6, 5, 1, 2, 3, 7),
    Array(8, 5, 2, 1, 4, 7, 6, 9, 3),
    Array(6, 7, 3, 9, 8, 5, 1, 2, 4),
    Array(9, 4, 1, 3, 6, 2, 7, 5, 8),
    Array(1, 9, 4, 8, 3, 6, 5, 7, 2),
    Array(5, 6, 7, 2, 1, 4, 3, 8, 9),
    Array(2, 3, 8, 5, 7, 9, 4, 6, 1)
  )


  val WrongRowSudoku: Array[Array[Int]] = Array(
    Array(7, 1, 6, 4, 9, 3, 8, 1, 5),
    Array(3, 2, 5, 7, 2, 8, 9, 4, 6),
    Array(4, 8, 9, 6, 5, 1, 2, 3, 7),
    Array(8, 5, 2, 1, 4, 7, 6, 9, 3),
    Array(6, 7, 3, 9, 8, 5, 1, 2, 4),
    Array(9, 4, 1, 3, 6, 2, 7, 5, 8),
    Array(1, 9, 4, 8, 3, 6, 5, 7, 2),
    Array(5, 6, 7, 2, 1, 4, 3, 8, 9),
    Array(2, 3, 8, 5, 7, 9, 4, 6, 1)
  )
  val WrongColumnSudoku: Array[Array[Int]] = Array(
    Array(7, 6, 2, 4, 9, 3, 8, 1, 5),
    Array(3, 1, 5, 7, 2, 8, 9, 4, 6),
    Array(4, 8, 9, 6, 5, 1, 2, 3, 7),
    Array(8, 5, 2, 1, 4, 7, 6, 9, 3),
    Array(6, 7, 3, 9, 8, 5, 1, 2, 4),
    Array(9, 4, 1, 3, 6, 2, 7, 5, 8),
    Array(1, 9, 4, 8, 3, 6, 5, 7, 2),
    Array(5, 6, 7, 2, 1, 4, 3, 8, 9),
    Array(2, 3, 8, 5, 7, 9, 4, 6, 1)
  )
}
