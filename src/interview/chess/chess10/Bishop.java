package interview.chess.chess10;

public class Bishop extends Figure {
    public Bishop(Position position) throws Exception {
        super(position);
    }

    @Override
    public String getName() {
        return "Bishop";
    }

    @Override
    public boolean hits(Position position) throws Exception {
        if (position == null)
            throw new Exception("Incorrect parameter position");
        return super.getPosition().getLeftDiagonal() == position.getLeftDiagonal() ||
                super.getPosition().getRightDiagonal() == position.getRightDiagonal();
    }
}
