package sudoku.SudokuIterators

class QuadrantIterator(matrix: Array[Array[Int]], row: Int, col: Int, val quadrantSize: Int)
  extends SudokuCurPositionHolder(matrix, row, col) with Iterator[Int] {

  private val rightColBoundary = col + quadrantSize - 1
  private val bottomRowBoundary = row + quadrantSize - 1

  override def hasNext: Boolean =
    curRow <= bottomRowBoundary

  private def updateNextItemsCoordinates(): Unit = {
    if (curCol == rightColBoundary) {
      curCol = col
      curRow += 1
    } else
      curCol += 1
  }

  override def next(): Int = {
    val nextItem = matrix(curRow)(curCol)
    updateNextItemsCoordinates()
    nextItem
  }
}

object QuadrantIterator {
  def apply(matrix: Array[Array[Int]], row: Int, col: Int, quadrantSize: Int): QuadrantIterator =
    new QuadrantIterator(matrix, row, col, quadrantSize)
}
