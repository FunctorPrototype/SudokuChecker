package sudoku

case class ItemsToCheck(columns: List[Int],
                        rows: List[Int],
                        quadrants: List[Int])
