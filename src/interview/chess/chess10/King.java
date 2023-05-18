package interview.chess.chess10;

public class King extends Figure {
    public King(Position position) throws Exception {
        super(position);
    }

    @Override
    public String getName() {
        return "King";
    }

    @Override
    public boolean hits(Position position) throws Exception {
        if (position == null)
            throw new Exception("Incorrect parameter position");
        int deltaRow = Math.abs(super.getPosition().getRow() - position.getRow());
        int deltaColumn = Math.abs(super.getPosition().getColumn() - position.getColumn());
        return (deltaRow == 1 && deltaColumn == 0) ||
                (deltaRow == 0 && deltaColumn == 1) ||
                (deltaRow == 1 && deltaColumn == 1);
    }
}
