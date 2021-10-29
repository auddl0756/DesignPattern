package part5.decorator.book;

public class StringDisplayer extends Displayer {
    private String string;

    public StringDisplayer(String string) {
        this.string = string;
    }

    @Override
    public int getColumnCount() {
        //return string.getBytes().length;
        return string.length();
    }

    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        return row == 0 ? string : null;
    }
}
