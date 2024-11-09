package application;

import entities.Board;
import entities.pieces.Pawn;
import entities.pieces.Piece;
import exceptions.MovementNotAllowedException;

import java.util.LinkedList;

import static application.Program.askPos;

public class Main {
    public static void main(String[] args) {

        LinkedList<Piece> pieces = new LinkedList<>();
        Piece pieceToMove = null;
        Piece pieceCaptured = null;
        for(int i = 1; i <= 8; i++)
        {
            pieces.add(new Pawn(i,2));
        }

        pieces.add(new Pawn(4,4));

        Board board = new Board(pieces);

        while(true)
        {
            Program.showBoard(board);
            int[] posPiece = Program.askPiece();


            pieceToMove = board.getPieces().stream().filter(piece -> piece.getX() == posPiece[0] && piece.getY() == posPiece[1]).
            findFirst().get();

            int[]  pos = Program.askPos();

            if(pieceToMove instanceof Pawn)
            {
                Pawn pawn = (Pawn) pieceToMove;

            }

            pieceToMove.move(pos[0], pos[1]);

        }
    }
}