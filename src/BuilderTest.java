public class BuilderTest {

    public static void main(String[] args) {

        Article article = new Article.ArticleBuilder()
                .setId(1L)
                .setTitle("title")
                .setContent("content")
                .build();

        System.out.println(article.toString());

    }

}
