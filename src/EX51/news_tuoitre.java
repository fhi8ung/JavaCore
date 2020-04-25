package EX51;

public class news_tuoitre {
    private int newsId;
    private String newsName;
    private int authorId;
    private String authorName;
    private String tag;

    public news_tuoitre(int newsId, String newsName, int authorId, String authorName, String tag) {
        this.newsId = newsId;
        this.newsName = newsName;
        this.authorId = authorId;
        this.authorName = authorName;
        this.tag = tag;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
