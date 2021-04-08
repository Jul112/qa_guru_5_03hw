package tests;

import org.junit.jupiter.api.Test;
import pages.StudentRegistrationFormPage;

public class StudentRegistrationFormTest {

    public StudentRegistrationFormPage page = new StudentRegistrationFormPage();

    @Test
    public void fillPracticeFormTest() {
        page.openPage();
        page.fillForm();
        page.checkData();
    }
}