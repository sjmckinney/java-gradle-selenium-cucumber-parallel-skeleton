package core.test.api;

import java.util.List;

public class TestUsers {

    private static volatile TestUsers instance;
    private static Object mutex = new Object();
    public static List<User> users;
    public static List<AvsUser> avsUsers;
    public static AvsGroup avsGroup;
    public static DummyResponse dummyResponse;

    private TestUsers() {
        dummyResponse = UserApi.GetUsers();
    }

    public static User getInstance() {
        TestUsers result = instance;
        if (result == null) {
            synchronized (mutex) {
                result = instance;
                if (result == null) {
                    instance = result = new TestUsers();
                    result.users = dummyResponse.users;
                    result.avsUsers = dummyResponse.avsUsers;
                    result.avsGroup = dummyResponse.avsGroup;
                }
            }
        }
        return result.users.remove(0);
    }

    public static TestUsers getTestUsersInstance() {
        TestUsers result1 = instance;
        if (result1 == null) {
            synchronized (mutex) {
                result1 = instance;
                if (result1 == null) {
                    instance = result1 = new TestUsers();
                    result1.users = dummyResponse.users;
                    result1.avsUsers = dummyResponse.avsUsers;
                    result1.avsGroup = dummyResponse.avsGroup;
                }
            }

        }
        return result1;
    }
}

