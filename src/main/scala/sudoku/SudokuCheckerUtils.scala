package sudoku

import sudoku.SudokuIterators.{ColumnIterator, QuadrantIterator}

object SudokuCheckerUtils {

  type SudokuChecker = Array[Array[Int]] => String

  private val successName = "корректно"
  private val failName = "некорректно"

  private lazy val columnsToCheck = List.range(0, SudokuMatrixSize)

  private lazy val regularRowsToCheck = List.range(0, SudokuMatrixSize)
  private lazy val regularQuadrantsToCheck = List.range(0, SudokuMatrixSize)

  private lazy val fastRowsToCheck = List.range(0, SudokuMatrixSize - 1)
  private lazy val fastQuadrantsToCheck = List(1, 2, 4, 5)

  private lazy val regularItemsToCheck: ItemsToCheck = ItemsToCheck(columnsToCheck, regularRowsToCheck, regularQuadrantsToCheck)
  private lazy val fastItemsToCheck: ItemsToCheck = ItemsToCheck(columnsToCheck, fastRowsToCheck, fastQuadrantsToCheck)


  val regularChecker: SudokuChecker = sudokuMatrix => getResultName(checkSudoku(sudokuMatrix, regularItemsToCheck))
  val fastChecker: SudokuChecker = sudokuMatrix => getResultName(checkSudoku(sudokuMatrix, fastItemsToCheck))

  private val SudokuMatrixSize = 9
  private val SudokuQuadrantSize = 3 //must be factor of SudokuMatrixSize

  private def checkSudoku(matrix: Array[Array[Int]],
                          toCheck: ItemsToCheck): Boolean = {
    isMatrixFitCorrect(matrix) &&
      toCheck.columns.forall(colNumber => isNineDigitsMet(getColumnIterable(matrix, colNumber))) &&
      toCheck.rows.forall(rowNumber => isNineDigitsMet(matrix(rowNumber))) &&
      toCheck.quadrants.forall(quadrantNumber => {
        val row = quadrantNumber / SudokuQuadrantSize
        val col = quadrantNumber % SudokuQuadrantSize
        isNineDigitsMet(getQuadrantIterable(matrix, row * SudokuQuadrantSize, col * SudokuQuadrantSize))
      })

  }


  private def getResultName(isRight: Boolean): String = {
    if (isRight)
      successName
    else
      failName
  }


  private def isMatrixFitCorrect(matrix: Array[Array[Int]]): Boolean = {
    matrix != null &&
      matrix.length == SudokuMatrixSize &&
      matrix.forall(row => row.length == SudokuMatrixSize)
  }

  private def getQuadrantIterable(matrix: Array[Array[Int]], row: Int, col: Int): Iterable[Int] = new Iterable[Int] {
    override def iterator: Iterator[Int] = QuadrantIterator(matrix, row, col, SudokuQuadrantSize)
  }

  private def getColumnIterable(matrix: Array[Array[Int]], col: Int): Iterable[Int] = new Iterable[Int] {
    override def iterator: Iterator[Int] = ColumnIterator(matrix, col, SudokuMatrixSize)
  }

  private val NineNumbersMetSign = 0x1FF

  private def isNineDigitsMet(seq: Iterable[Int]): Boolean = {
    val bitMask = seq.foldLeft(0)((acc, curElement) => {
      if (curElement < 1 || curElement > 9)
        acc
      else
        acc | (1 << (curElement - 1))
    })
    bitMask == NineNumbersMetSign
  }
}
