package interview.chess.chess10;

public class Knight extends Figure {
    public Knight(Position position) throws Exception {
        super(position);
    }

    @Override
    public String getName() {
        return "Knight";
    }

    @Override
    public boolean hits(Position position) throws Exception {
        if (position == null)
            throw new Exception("Incorrect parameter position");
        int deltaRow = Math.abs(super.getPosition().getRow() - position.getRow());
        int deltaColumn = Math.abs(super.getPosition().getColumn() - position.getColumn());
        return  (deltaRow == 2 && deltaColumn == 1) ||
                (deltaRow == 1 && deltaColumn == 2);
    }
}
