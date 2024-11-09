package application;

import java.util.Scanner;

import entities.Board;
import entities.pieces.Piece;

public class Program {
    static Scanner sc = new Scanner(System.in);

    public static void showBoard(Board board)
    {
        boolean hasPieceInPos;
        System.out.println("  - - - - - - - --");
        System.out.println("  1 2 3 4 5 6 7 8");
        for(int y = 1; y <= 8; y++)
        {
            System.out.print(y+" ");
            for(int x = 1; x <= 8; x++)
            {

                hasPieceInPos = false;
                for(Piece piece : board.getPieces())
                {
                    if(piece.getX() == x && piece.getY() == y && !piece.getCaptured())
                    {
                        System.out.print("p ");
                        hasPieceInPos = true;
                    }
                }

                if(!hasPieceInPos) System.out.print("x ");
            }
            System.out.println();
        }
        System.out.println(" - - - - - - - -");
    }

    public static int[] askPiece()
    {
        int[] posPiece = new int[2];
        System.out.println("Digite a coordenada que a peça que você quer movimentar");
        System.out.print("x: ");
        posPiece[0] = sc.nextInt();
        sc.nextLine();

        System.out.print("y: ");
        posPiece[1] = sc.nextInt();

        return posPiece;
    }


    public static int[] askPos()
    {
        int[] pos = new int[2];
        System.out.println("Digite o movimento que a peça deve fazer");
        System.out.print("x: ");
        pos[0] = sc.nextInt();
        sc.nextLine();

        System.out.print("y: ");
        pos[1] = sc.nextInt();

        return pos;
    }
}
