package interview.chess.chess10;

import java.util.Arrays;

public class Situation {
    private Figure[] _figures;

    public Figure[] getFigures() {
        return _figures;
    }

    private int lastPassedNumber = 0;

    public Situation(Figure[] figures) {
        _figures = figures;
    }

    public boolean isPeace() throws Exception {
        for (int i = 0; i < _figures.length; i++) {
            for (int j = 0; j < _figures.length; j++) {
                if ((i != j) && (_figures[i].hits(_figures[j]))) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean addQueen() throws Exception {
        Figure[] result = new Figure[_figures.length + 1];
        Figure[] temp = _figures;
        for (int i = 0; i < _figures.length; i++) {
            result[i] = _figures[i];
        }
        _figures = result;
        for (int n = lastPassedNumber; n < 64; n++) {
            Position position = new Position(n);
            System.out.print("*");
            if (isPositionFree(temp, position)) {
                _figures[_figures.length - 1] = new Queen(position);
                if (isPeace()) {
                    lastPassedNumber = n + 1;
                    System.out.println();
                    return true;
                }
            }
        }
        _figures = temp;
        System.out.println();
        return false;
    }

    public boolean isPositionFree(Figure[] figures, Position position) {
        for (Figure figure : figures) {
            if (Positions.equals(figure.getPosition(), position))
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Quantity: " + _figures.length + ' ' +
                "figures = " + Arrays.toString(_figures);
    }
}
