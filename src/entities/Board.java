package entities;

import entities.pieces.Piece;

import java.util.LinkedList;

public class Board {

    private LinkedList<Piece> pieces;

    public Board(LinkedList<Piece> pieces) {
        this.pieces = pieces;
    }

    public LinkedList<Piece> getPieces() {
        return pieces;
    }

    public Piece isPieceCaptured(int x, int y)
    {
        return this.getPieces().stream().filter(piece -> )
    }
}
