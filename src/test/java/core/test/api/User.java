package core.test.api;

import lombok.Getter;
import lombok.Setter;

public class User extends ThreadLocal<User> {
    @Getter
    @Setter
    public Attributes Attributes;

    @Getter
    @Setter
    public String FirstName;

    @Getter
    @Setter
    public String LastName;

    @Getter
    @Setter
    public String Email;

    @Getter
    @Setter
    public String Username;

    @Getter
    @Setter
    public String ProfileId;

    @Getter
    @Setter
    public String Extension;

    @Getter
    @Setter
    public Integer Alias;

    @Getter
    @Setter
    public String TimeZoneSidKey;

    @Getter
    @Setter
    public String EmailEncodingKey;

    @Getter
    @Setter
    public String LanguageLocaleKey;

    @Getter
    @Setter
    public String LocaleSidKey;

    @Getter
    @Setter
    public String Id;
}
