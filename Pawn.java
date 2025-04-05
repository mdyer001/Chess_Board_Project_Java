/**
 * Class for creating the Pawn piece.
 */
public class Pawn extends ChessPiece implements IChessPiece {

  /**
   * Construct a Pawn chess piece through position and color.
   * @param row the row location of the piece.
   * @param col the column location of the piece.
   * @param color the color of the piece
   */

  public Pawn(int row, int col, Color color) {
    super(row, col, color);
  }

  /**
   * Method used to ensure the piece can move using row and column.
   * @return true if the piece can move.
   */

  @Override
  public boolean canMove(int row,int col) {
    return (row == this.row && Math.abs(this.col - col) == 1);

  }

  /**
   * Method used to kill a chess piece using Chess piece.
   * @return true if the chess piece can be killed.
   */
  @Override
  public boolean canKill(ChessPiece piece) {
    if ((Math.abs(piece.getRow() - this.row) == 1 && (Math.abs(piece.getColumn() - this.col) == 1))) {
      if (this.getColor() != piece.getColor()) {
        return true;
      }
    }
    return false;
  }



}

