public class Article {

    private Long id;
    private String title;
    private String content;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    private Article(ArticleBuilder ab){
        this.id = ab.id;
        this.title = ab.title;
        this.content = ab.content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public static class ArticleBuilder {

        private Long id;
        private String title;
        private String content;

        public ArticleBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public ArticleBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public ArticleBuilder setContent(String content) {
            this.content = content;
            return this;
        }

        public Article build(){
            return new Article(this);
        }
    }

}
