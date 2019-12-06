package sudoku

import org.scalatest.flatspec.AnyFlatSpec

class RegularCheckingSpec extends AnyFlatSpec with SudokuCheckBehavior {
  "Regular sudoku checker" should behave like sudokuMatrixBaseStructureChecker(SudokuCheckerUtils.regularChecker)
  "Regular sudoku checker" should behave like sudokuPropertiesChecker(SudokuCheckerUtils.regularChecker)
}
