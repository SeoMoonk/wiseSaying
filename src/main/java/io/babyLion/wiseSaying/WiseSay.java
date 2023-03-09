package io.babyLion.wiseSaying;


public class WiseSay {
    private long id;
    private String content;
    private String authorName;

    public WiseSay(long id, String content, String authorName) {
        this.id = id;
        this.content = content;
        this.authorName = authorName;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getAuthorName() {
        return authorName;
    }
}