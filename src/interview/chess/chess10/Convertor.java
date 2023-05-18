package interview.chess.chess10;

public class Convertor {

    public static int charToColumn(char ch) throws Exception {
        if ((ch < 'A') || (ch > 'H'))
            throw new Exception("charToColumn method, param ch");
        return ch - 'A';
    }

    public static int charToRow(char ch) throws Exception {
        if ((ch < '1') || (ch > '8'))
            throw new Exception("charToRow method, param ch");
        return ch - '1';
    }

    public static char columnToChar(int column) throws  Exception {
        if ((column < 0) || (column > 7))
            throw new Exception("columnToChar method, param column");
        return (char) (column + 'A');
    }

    public static char rowToChar(int row) throws Exception {
        if ((row < 0) || (row > 7))
            throw new Exception("rowToChar method, param row");
        return (char) (row + '1');
    }
}
