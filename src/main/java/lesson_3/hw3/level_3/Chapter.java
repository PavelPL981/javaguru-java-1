package lesson_3.hw3.level_3;

public class Chapter {

    private String titleOfChapter;
    private String textOfChapter;

    public Chapter(String titleOfChapter, String textOfChapter) {
        this.titleOfChapter = titleOfChapter;
        this.textOfChapter = textOfChapter;
    }

    public String getTitleOfChapter() {
        return titleOfChapter;
    }

    public void setTitleOfChapter(String titleOfChapter) {
        this.titleOfChapter = titleOfChapter;
    }

    public String getTextOfChapter() {
        return textOfChapter;
    }

    public void setTextOfChapter(String textOfChapter) {
        this.textOfChapter = textOfChapter;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "titleOfChapter='" + titleOfChapter + '\'' +
                ", textOfChapter='" + textOfChapter + '\'' +
                '}';
    }
}
