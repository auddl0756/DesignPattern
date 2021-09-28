package part1.adapter.byExtends;

public interface Printer {
    public abstract void printPersonal();
    public abstract void printBusiness();

    //interface에서 public abstract는 default이므로 생략할 수 있다.
    //하지만 초보 단계에서 의미를 명확히 표시하기 위해 한번씩 붙여 쓰는 것도 나쁘진 않다.
}
