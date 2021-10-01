package part3.prototype.main;

import part3.prototype.framework.Product;

public class UnderLining implements Product {
    private static char decoChar = '-';

    @Override
    public void use(String str) {
        int length = str.length();
        StringBuilder decoLine = new StringBuilder();

        for (int i = 0; i < length; i++) {
            decoLine.append(decoChar);
        }

        System.out.println(str);
        System.out.println(decoLine);
    }

    @Override
    public Product createClone() {
        Product product = null;

        try {
            product = (Product) super.clone();
        } catch (CloneNotSupportedException exception) {
            exception.printStackTrace();
        }
        return product;
    }
}
