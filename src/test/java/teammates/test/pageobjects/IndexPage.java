package teammates.test.pageobjects;

public class IndexPage extends AppPage {

    public IndexPage(Browser browser) {
        super(browser);
    }

    @Override
    protected boolean containsExpectedPageContents() {
        String pageSource = getPageSource();
        return pageSource.contains("Student peer evaluations/feedback, shareable instructor comments, and more...");
    }

}
