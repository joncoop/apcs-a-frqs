public class Sign {
    
    private String text;
    private int width;

    public Sign(String text, int width) {
        this.text = text;
        this.width = width;
    }

    public int numberOfLines() {
        int lines = text.length() / width; // truncates, be careful!

        if (text.length() % width != 0) {
            lines++;
        }

        return lines;
    }

    public String getLines() {
        if (text.length() == 0) {
            return null;
        }
        
        String result = "";
        int start, end;

        for (int i = 0; i < numberOfLines(); i++) {
            start = i * width;
            end = start + width;

            end = Math.min(end, text.length()); // don't go out-of-bounds on last iteration

            result += text.substring(start, end);

            if (i < numberOfLines() - 1) {
                result += ";";
            }
        }
        
        return result;
    }
}
