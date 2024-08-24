package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("xxx","123");
        userList.addUser("yyy","456");
        userList.addUser("zzz","789");

        // TODO: find one of them
        User user = userList.findUserByUsername("xxx");

        // TODO: assert that UserList found User
        String expected = "xxx";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList1 = new UserList();
        userList1.addUser("xxx","123");
        userList1.addUser("yyy","456");
        userList1.addUser("zzz","789");

        // TODO: change password of one user
        boolean actual;
        actual = userList1.changePassword("xxx","123","258");

        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList2 = new UserList();
        userList2.addUser("xxx","123");
        userList2.addUser("yyy","456");
        userList2.addUser("zzz","789");

        // TODO: call login() with correct username and password
        User actual = userList2.login("xxx","123");

        // TODO: assert that User object is found
        //assertEquals( actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList3 = new UserList();
        userList3.addUser("xxx","123");
        userList3.addUser("yyy","456");
        userList3.addUser("zzz","789");

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList3.login("xxx","223");

        // TODO: assert that the method return null
        assertNull(actual);
    }

}