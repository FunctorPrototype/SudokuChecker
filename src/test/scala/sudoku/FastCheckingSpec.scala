package sudoku

import org.scalatest.flatspec.AnyFlatSpec

class FastCheckingSpec extends AnyFlatSpec with SudokuCheckBehavior {
  "Fast sudoku checker" should behave like sudokuMatrixBaseStructureChecker(SudokuCheckerUtils.fastChecker)
  "Fast sudoku checker" should behave like sudokuPropertiesChecker(SudokuCheckerUtils.fastChecker)
}
