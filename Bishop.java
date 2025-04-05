/**
 * class that provides the methods for the Bishop piece.
 */

public class Bishop extends ChessPiece implements IChessPiece {

  /**
   * Construct a Bishop chess piece through position and color.
   * @param row the row location of the chess piece.
   * @param col the column location of the chess piece.
   */

  public Bishop(int row, int col, Color color) {
    super(row, col, color);
  }

  /**
   * Method used to ensure the Knight can move using row and column.
   * @return true if the piece can move.
   */

  @Override
  public boolean canMove(int row,int col) {
    return (Math.abs(row - this.row) == Math.abs(col - this.col));

  }

  /**
   * Method used to kill a chess piece using Chess piece.
   * @return true if the chess piece can be killed.
   */

  @Override
  public boolean canKill(ChessPiece piece) {
    if (canMove(piece.getRow(), piece.getRow())) {
      if (this.getColor() != piece.getColor()) {
        return true;
      }
    }
    return false;
  }



}


