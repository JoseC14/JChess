package entities.pieces;

import exceptions.MovementNotAllowedException;

public abstract class Piece {
    private Integer x;
    private Integer y;

    private Boolean isCaptured;

    public Piece( int x, int y)
    {
        this.x = x;
        this.y = y;
        this.isCaptured = false;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Boolean getCaptured() {
        return isCaptured;
    }

    public void setCaptured(Boolean captured) {
        isCaptured = captured;
    }

    public abstract void move(int posX, int posY) throws MovementNotAllowedException;


}
