
/**
 * Construct an abstract chess piece with methods applying to all pieces.
 */

public abstract class ChessPiece {
  protected int row;
  protected int col;
  protected Color color;

  public ChessPiece(int row, int col, Color color){
    if (row < 0 || col < 0) {
      throw new IllegalArgumentException("Row or Col must be greater than zero");
    }
    else {
      this.row = row;
      this.col = col;
      this.color = color;
    }
  }

  /**
   * Method used to get the row as x.
   * @return x.
   */
  public int getRow() {
    return this.row;
  }

  /**
   * Method used to get the column as y.
   * @return y.
   */
  public int getColumn() {
    return this.col;
  }

  /**
   * Method used to get the color through the enum color.
   * @return the color.
   */
  public Color getColor() {
    return this.color;
  }

  abstract boolean canMove(int row, int col);

  abstract boolean canKill(ChessPiece piece);



}
