package part5.decorator.book;

public class FullBorder extends Border {
    public FullBorder(Displayer displayer) {
        super(displayer);
    }

    @Override
    public int getColumnCount() {
        return 1 + displayer.getColumnCount() + 1;
    }

    @Override
    public int getRowCount() {
        return 1 + displayer.getRowCount() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return "+" + makeLine('-', displayer.getColumnCount()) + "+";
        } else if (row == displayer.getRowCount() + 1) {
            return "+" + makeLine('-', displayer.getColumnCount()) + "+";
        } else {
            return "|" + displayer.getRowText(row - 1) + "|";
        }
    }

    private String makeLine(char ch, int count) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buffer.append(ch);
        }
        return buffer.toString();
    }
}
