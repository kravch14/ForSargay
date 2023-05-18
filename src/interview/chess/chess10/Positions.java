package interview.chess.chess10;

public class Positions {
    public static boolean equals(Position position1, Position position2) {
        if (position1 == position2) {
            return true;
        }
        if ((position1 == null) || (position2 == null)) {
            return false;
        }

        if (position1.getRow() != position2.getRow()) {
            return false;
        }

        if (position1.getColumn() != position2.getColumn()) {
            return false;
        }
        return true;
    }
}
