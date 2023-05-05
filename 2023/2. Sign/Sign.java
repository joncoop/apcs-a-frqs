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
        String result = "";
        int numLines = numberOfLines();
        int start, end;

        for (int i = 0; i < numLines; i++) {
            start = i * width;
            end = start + width;

            end = Math.min(end, text.length()); // don't go out-of-bounds on last iteration

            result += text.substring(start, end);

            if (i < numLines - 1) {
                result += ";";
            }
        }
        
        return result;
    }
}
