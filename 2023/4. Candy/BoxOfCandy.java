public class BoxOfCandy {
    
    private Candy[][] box;

    public boolean moveCandyToFirstRow(int col) {
        if (box[0][col] != null) {
            return true;
        }

        for (int row = 1; row < box.length; row++) {
            Candy piece = box[row][col];

            if (piece != null) {
                box[0][col] = piece;
                box[row][col] = null;
                return true;
            }
        }

        return false;
    }

    public Candy removeNextByFlavor(String flavor) {
        for (int row = box.length - 1; row >= 0; row--) {
            for (int col = 0; col < box[0].length; col++) {
                Candy piece = box[row][col];

                if (piece != null && piece.getFlavor.equals(flavor)) {
                    box[row][col] = null;
                    return piece;
                }
            }
        }

        return null;
    }
}
