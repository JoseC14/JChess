package entities.pieces;
import java.lang.Override;
import entities.pieces.Piece;
import exceptions.MovementNotAllowedException;

public class Pawn extends Piece{

    private Boolean firstMove;

    public Pawn(int x, int y) {
        super(x, y);
        this.firstMove = true;
    }

    public Boolean getFirstMove() {
        return firstMove;
    }

    public void setFirstMove(Boolean firstMove) {
        this.firstMove = firstMove;
    }

    @Override
    public void move(int posX, int posY) throws MovementNotAllowedException
    {
        if(posX > 0 || posY < this.getY())
        {
            throw new MovementNotAllowedException("Movemento do Peão não permitido");
        }

        this.setY(posY);
    }

    public void capture(Piece piece)
    {
        piece.setCaptured(true);
        this.setX(piece.getX());
        this.setY(piece.getY());
    }
}
