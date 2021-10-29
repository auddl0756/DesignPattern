package part5.decorator.book;

public abstract class Displayer {
    public abstract int getColumnCount();

    public abstract int getRowCount();

    public abstract String getRowText(int row);

    //show()는 템플릿 메서드 패턴이 사용됨.
    public final void show() {
        for (int rowNum = 0; rowNum < getRowCount(); rowNum++) {
            System.out.println(getRowText(rowNum));
        }
    }
}
