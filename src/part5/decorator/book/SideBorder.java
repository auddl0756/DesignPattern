package part5.decorator.book;

public class SideBorder extends Border {
    private char borderChar;

    public SideBorder(Displayer displayer, char ch) {
        super(displayer);
        this.borderChar = ch;
    }

    @Override
    public int getColumnCount() {
        return 1 + displayer.getColumnCount() + 1;
    }

    @Override
    public int getRowCount() {
        return displayer.getRowCount();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + displayer.getRowText(row) + borderChar;
    }
}
