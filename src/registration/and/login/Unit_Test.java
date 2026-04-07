package registration.and.login;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class Unit_Test {

    private Login login;

    @Before
    public void setUp() {
        login = new Login(); // ✅ fixed constructor
    }

    @Test
    public void testUsernameCorrectlyFormatted() {
        assertTrue(login.checkUserName("kyl_1"));
    }

    @Test
    public void testUsernameIncorrectlyFormatted() {
        assertFalse(login.checkUserName("kyle!!!!"));
    }

    @Test
    public void testPasswordMeetsComplexity() {
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));
    }

    @Test
    public void testPasswordFailsComplexity() {
        assertFalse(login.checkPasswordComplexity("password"));
    }

    @Test
    public void testValidCellPhoneNumber() {
        assertTrue(login.checkCellPhoneNumber("+27838968976"));
    }

    @Test
    public void testInvalidCellPhoneNumber() {
        assertFalse(login.checkCellPhoneNumber("08966553"));
    }

    @Test
    public void testRegisterUserSuccess() {
        boolean result = login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertTrue(result); // ✅ fixed (boolean, not String)
    }

    @Test
    public void testLoginSuccess() {
        login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976");

        boolean status = login.loginUser("kyl_1", "Ch&&sec@ke99!");
        assertTrue(status);

        String message = login.returnLoginStatus(status, "kyl_1");
        assertEquals("Welcome kyl_1, it is great to see you again!", message);
    }
}