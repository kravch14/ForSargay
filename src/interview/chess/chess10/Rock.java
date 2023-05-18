package interview.chess.chess10;

public class Rock extends Figure {
    public Rock(Position position) throws Exception {
        super(position);
    }

    @Override
    public String getName() {
        return "Rock";
    }

    @Override
    public boolean hits(Position position) throws Exception {
        if (position == null)
            throw new Exception("Incorrect parameter position");
        return super.getPosition().getRow() == position.getRow() ||
                super.getPosition().getColumn() == position.getColumn();
    }
}
