
/**
 * This class represents the class for the Knight chess piece.
 */
public class Knight extends ChessPiece implements IChessPiece {

  /**
   * Construct a Knight chesspiece through position and color.
   * @param row the row location of the Knight.
   * @param col the column location of the Knight.
   */

  public Knight(int row, int col, Color color) {
    super(row, col, color);
  }

  /**
   * Method used to ensure the Knight can move using row and column.
   * @return true if the piece can move.
   */
  @Override
  public boolean canMove(int row,int col) {
    return ((Math.abs(this.row - row) == 2 && Math.abs(this.col - col) == 1)
            || (Math.abs(this.row - row) == 1 && Math.abs(this.col - col) == 2));
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
