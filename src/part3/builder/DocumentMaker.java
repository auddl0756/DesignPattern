package part3.builder;

public class DocumentMaker {
    private Builder builder;

    public DocumentMaker(Builder builder){
        this.builder = builder;
    }

    public void buildSampleDocument(){
        builder.makeTitle("Today's to do list");
        builder.makeBody("in the morning");
        builder.makeItems(new String[]{
                "read \"when I don't know what I want\" ",
                "design pattern"
        });

        builder.makeBody("in the afternoon");
        builder.makeItems(new String[]{
                "develop reservation system",
                "study network and web performance"
        });

        builder.close();
    }
}
