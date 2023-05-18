package interview.chess.chess10;

public class Queen extends Figure {
    public Queen(Position position) throws Exception {
        super(position);
    }

    @Override
    public String getName() {
        return "Queen";
    }

    @Override
    public boolean hits(Position position) throws Exception {
        if (position == null)
            throw new Exception("Incorrect parameter position");
        return super.getPosition().getRow() == position.getRow() ||
                super.getPosition().getColumn() == position.getColumn() ||
                super.getPosition().getLeftDiagonal() == position.getLeftDiagonal() ||
                super.getPosition().getRightDiagonal() == position.getRightDiagonal();
    }
}
