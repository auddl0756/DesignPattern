package part3.builder;

public class HtmlBuilder extends Builder {
    @Override
    public void makeTitle(String title) {
        System.out.println("<html>\n" +
                "<head></head>\n" +
                "<body>\n" +
                "<h1>\n" +
                title + "\n" +
                "</h1>");
    }

    @Override
    public void makeBody(String body) {
        System.out.println("<div>\n" +
                body +"\n" +
                "</div>");
    }

    @Override
    public void makeItems(String[] items) {
        System.out.println("<ul>");
        for (String item : items) {
            System.out.println("<li>" + item + "</li>");
        }
        System.out.println("</ul>");
    }

    @Override
    public void close() {
        System.out.println("</body>\n" +
                "</html>\n");
    }
}
