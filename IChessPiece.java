/**
 * This interface class creates the abstract class for chess piece.
 */
public interface IChessPiece {
  public int getRow();

  public int getColumn();

  public Color getColor();

  public boolean canMove(int row, int col);

  public boolean canKill(ChessPiece piece);

}
