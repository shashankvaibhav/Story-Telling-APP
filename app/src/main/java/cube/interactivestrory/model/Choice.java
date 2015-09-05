package cube.interactivestrory.model;

public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String s, int i) {
        mText = s;
        mNextPage =i;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }
}

