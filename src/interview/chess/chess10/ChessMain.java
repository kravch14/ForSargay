package interview.chess.chess10;

public class ChessMain {
    public static void main(String[] args) {
        try {
            Position position = new Position("E7");
            System.out.println("Row = " + position.getRow() +
            " Column = " + position.getColumn() +
            " Name = " + position.getName() +
            " Number = " + position.getNumber());
            /*Position[] positions = {
                    new Position("D5"),
                    new Position("C7"),
                    new Position("F1"),
                    new Position("H8"),
                    new Position("E8")
            };*/
            Figure[] figures = {
                    //new Rock(new Position("D5")),
                    //new Rock(new Position("C7")),
                    new Queen(new Position("A8")),
                    new Queen(new Position("C7")),
                    //new Queen(new Position("B5"))
            };
            Situation situation = new Situation(figures);
            System.out.println(situation);
            System.out.println("isPeace = " + situation.isPeace());
            while (true) {
                boolean success = situation.addQueen();
                if (success) {
                    System.out.println("Success " + situation);
                } else {
                    System.out.println("Not success");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e);
        }
    }
}
