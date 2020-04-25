package EX42;

public class post_tuoitre {
    private int postId;
    private String postName;
    private int authorId;
    private String authorName;
    private String tag;

    public post_tuoitre(int postId, String postName, int authorId, String authorName, String tag) {
        this.postId = postId;
        this.postName = postName;
        this.authorId = authorId;
        this.authorName = authorName;
        this.tag = tag;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
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
