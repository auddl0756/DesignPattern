package part2.factoryMethod.framework;

public abstract class Factory {
    //create()를 보면 틀이 정해져 있고, createProduct,registerProduct의 구체적인 구현은 하위 클래스로 미루고 있다.
    //즉, template method 패턴이 사용됐음.
    //인스턴스 생성할 때 이렇게 template method 패턴을 사용하면 factory method 패턴이라 부른다.
    public final Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
