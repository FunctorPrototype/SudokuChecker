package sudoku.SudokuIterators

class ColumnIterator(matrix: Array[Array[Int]], col: Int, val sudokuMatrixSize: Int)
  extends SudokuCurPositionHolder(matrix, 0, col) with Iterator[Int] {

  override def hasNext: Boolean = curRow <= sudokuMatrixSize - 1

  override def next(): Int = {
    val nextItem = matrix(curRow)(col)
    curRow += 1
    nextItem
  }
}

object ColumnIterator {
  def apply(matrix: Array[Array[Int]], col: Int, sudokuMatrixSize: Int): ColumnIterator =
    new ColumnIterator(matrix, col, sudokuMatrixSize)
}
