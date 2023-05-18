package interview.chess.chess10;

public class Position {
    private int _row;
    private int _column;

    private static final int BOARD_SIZE = 8;
    private static final int BOARD_MIN_INDEX = 0;
    private static final int BOARD_MAX_INDEX = BOARD_SIZE - 1;
    private static final int NAME_LENGTH = 2;
    private static final int NAME_COLUMN_INDEX = 0;
    private static final int NAME_ROW_INDEX = 1;

    public int getRow() {
        return _row;
    }

    public int getColumn() {
        return _column;
    }

    public String getName() throws Exception {
        char columnCh = Convertor.columnToChar(_column);
        char rowCh = Convertor.rowToChar(_row);
        return Character.toString(columnCh) + rowCh;
    }

    public int getNumber() {
        return _row * 8 + _column;
    }

    public int getLeftDiagonal() {
        return _row + _column;
    }

    public int getRightDiagonal() {
        return BOARD_MAX_INDEX - _row + _column;
    }

    public Position(int row, int column) throws Exception {
        if ((row < BOARD_MIN_INDEX || row > BOARD_MAX_INDEX) || (column < BOARD_MIN_INDEX || column > BOARD_MAX_INDEX))
            throw new Exception("Incorrect parameter or parameters row/column");
        _row = row;
        _column = column;
    }

    public Position(String name) throws Exception {
        if ((name == null) || (name.length() != NAME_LENGTH))
            throw new Exception("Incorrect name");
        char columnCh = name.charAt(NAME_COLUMN_INDEX);
        char rowCh = name.charAt(NAME_ROW_INDEX);
        _row = Convertor.charToRow(rowCh);
        _column = Convertor.charToColumn(columnCh);
    }

    public Position(int number) throws Exception {
        if (number < 0 || number > 63)
            throw new Exception("Incorrect number");
        _row = number / 8;
        _column = number % 8;
    }

    @Override
    public String toString() {
        try {
            return getName();
        } catch (Exception e) {
            return "Unknown name. Details: " + e;
        }
    }
}
