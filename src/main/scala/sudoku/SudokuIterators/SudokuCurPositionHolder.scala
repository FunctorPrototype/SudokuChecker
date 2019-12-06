package sudoku.SudokuIterators

class SudokuCurPositionHolder(val matrix: Array[Array[Int]], val row: Int, val col: Int)  {
  protected var curRow: Int = row;
  protected var curCol: Int = col;
}
