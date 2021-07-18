package core.test.api;

import java.util.List;

public class DummyResponse {

    public static List<User> users;

    public static List<AvsUser> avsUsers;

    public static AvsGroup avsGroup;

    public DummyResponse(List<User> users,
                         List<AvsUser> avsUsers,
                         AvsGroup avsGroup) {
        this.users = users;
        this.avsUsers = avsUsers;
        this.avsGroup = avsGroup;

    }
}
