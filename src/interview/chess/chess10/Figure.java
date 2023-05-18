package interview.chess.chess10;

public abstract class Figure {
    Position _position;
    public Figure(Position position) throws Exception {
        if (position == null)
            throw new Exception("Incorrect parameter position");
        _position = position;
    }

    public abstract String getName();

    public Position getPosition() {
        return _position;
    }

    public abstract boolean hits(Position position) throws Exception;

    public boolean hits(Figure figure) throws Exception {
        return hits(figure.getPosition());
    }

    @Override
    public String toString() {
        return getName() + " " + _position;
    }
}
