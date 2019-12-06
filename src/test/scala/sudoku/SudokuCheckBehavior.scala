package sudoku

import org.scalatest.flatspec.AnyFlatSpec
import sudoku.SudokuCheckerUtils.SudokuChecker
import sudoku.TestValuesObject._

trait SudokuCheckBehavior {
  this: AnyFlatSpec =>

  private val successValue = "корректно"
  private val failValue = "некорректно"

  def sudokuMatrixBaseStructureChecker(checker: SudokuChecker): Unit = {
    "Sudoku matrix with item less than 1" should "return fail" in {
      assert(checker(SudokuWithItemLessThan1) == failValue)
    }

    "Sudoku matrix with item greater than 9" should "return fail" in {
      assert(checker(SudokuWithItemGreaterThan9) == failValue)
    }
    "Jagged sudoku matrix" should "return fail" in {
      assert(checker(JaggedSudoku) == failValue)
    }

    "null sudoku matrix" should "return fail" in {
      assert(checker(null) == failValue)
    }
  }

  def sudokuPropertiesChecker(checker: SudokuChecker): Unit = {
    "Right sudoku matrix" should "return success" in {
      assert(checker(RightSudoku) == successValue)
    }

    "Another right sudoku matrix" should "return success" in {
      assert(checker(RightSudoku) == successValue)
    }

    "Sudoku matrix with repeated item" should "return fail" in {
      assert(checker(SudokuWithRepeatedItem) == failValue)
    }

    "Sudoku matrix with wrong quadrant" should "return fail" in {
      assert(checker(WrongQuadrantSudoku) == failValue)
    }
    "Sudoku matrix with wrong another quadrant" should "return fail" in {
      assert(checker(WrongSudokuLastQuadrant) == failValue)
    }


    "Sudoku matrix with wrong row" should "return fail" in {
      assert(checker(WrongRowSudoku) == failValue)
    }
    "Sudoku matrix with wrong column" should "return fail" in {
      assert(checker(WrongColumnSudoku) == failValue)
    }
  }


}
