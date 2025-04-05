/**
 * Class to implement the Rook chess piece.
 */

public class Rook extends ChessPiece implements IChessPiece {

  /**
   * Construct a Rook chess piece through position and color.
   * @param row the row location of the piece.
   * @param col the column location of the piece.
   */

  public Rook(int row, int col, Color color) {
    super(row, col, color);
  }


  /**
   * Method used to ensure the piece can move using row and column.
   * @return true if the piece can move.
   */

  @Override
  public boolean canMove(int row,int col) {
    return (this.col == col || this.row == row);

  }

  /**
   * Method used to kill a chess piece using Chess piece.
   * @return true if the chess piece can be killed.
   */

  @Override
  public boolean canKill(ChessPiece piece) {
    if (canMove(piece.getRow(), piece.getColumn())) {
      if (this.getColor() != piece.getColor()) {
        return true;
      }
    }
    return false;
  }



}

