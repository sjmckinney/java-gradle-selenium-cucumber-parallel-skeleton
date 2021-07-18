package core.test.api;

import io.restassured.path.json.JsonPath;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UserApi {

    static String jsonResponse = "{" +
            "\"users\": [" +
            "{" +
            "\"attributes\": {" +
            "\"type\": \"User\"," +
            "\"url\": \"\\/services\\/data\\/v51.0\\/sobjects\\/User\\/0053z00000CX3v0AAD\"" +
            "}," +
            "\"FirstName\": \"Automation\"," +
            "\"LastName\": \"User 1\"," +
            "\"Email\": \"alex.gould@redmatter.com\"," +
            "\"Username\": \"18252alex.gould@redmatter.com1\"," +
            "\"ProfileId\": \"00e3z0000026arTAAQ\"," +
            "\"Extension\": \"18253\"," +
            "\"Alias\": \"18253\"," +
            "\"TimeZoneSidKey\": \"Europe\\/London\"," +
            "\"EmailEncodingKey\": \"ISO-8859-1\"," +
            "\"LanguageLocaleKey\": \"en_US\"," +
            "\"LocaleSidKey\": \"en_GB\"," +
            "\"Id\": \"0053z00000CX3v0AAD\"" +
            "}," +
            "{" +
            "\"attributes\": {" +
            "\"type\": \"User\"," +
            "\"url\": \"\\/services\\/data\\/v51.0\\/sobjects\\/User\\/0053z00000CX3v1AAD\"" +
            "}," +
            "\"FirstName\": \"Automation\"," +
            "\"LastName\": \"User 2\"," +
            "\"Email\": \"alex.gould@redmatter.com\"," +
            "\"Username\": \"18252alex.gould@redmatter.com2\"," +
            "\"ProfileId\": \"00e3z0000026arTAAQ\"," +
            "\"Extension\": \"18254\"," +
            "\"Alias\": \"18254\"," +
            "\"TimeZoneSidKey\": \"Europe\\/London\"," +
            "\"EmailEncodingKey\": \"ISO-8859-1\"," +
            "\"LanguageLocaleKey\": \"en_US\"," +
            "\"LocaleSidKey\": \"en_GB\"," +
            "\"Id\": \"0053z00000CX3v1AAD\"" +
            "}," +
            "{" +
            "\"attributes\": {" +
            "\"type\": \"User\"," +
            "\"url\": \"\\/services\\/data\\/v51.0\\/sobjects\\/User\\/0053z00000CX3v1AAD\"" +
            "}," +
            "\"FirstName\": \"Automation\"," +
            "\"LastName\": \"User 3\"," +
            "\"Email\": \"alex.gould@redmatter.com\"," +
            "\"Username\": \"18252alex.gould@redmatter.com3\"," +
            "\"ProfileId\": \"00e3z0000026arTAAQ\"," +
            "\"Extension\": \"18254\"," +
            "\"Alias\": \"18254\"," +
            "\"TimeZoneSidKey\": \"Europe\\/London\"," +
            "\"EmailEncodingKey\": \"ISO-8859-1\"," +
            "\"LanguageLocaleKey\": \"en_US\"," +
            "\"LocaleSidKey\": \"en_GB\"," +
            "\"Id\": \"0053z00000CX3v1DAA\"" +
            "}," +
            "{" +
            "\"attributes\": {" +
            "\"type\": \"User\"," +
            "\"url\": \"\\/services\\/data\\/v51.0\\/sobjects\\/User\\/0053z00000CX3v1AAD\"" +
            "}," +
            "\"FirstName\": \"Automation\"," +
            "\"LastName\": \"User 4\"," +
            "\"Email\": \"alex.gould@redmatter.com\"," +
            "\"Username\": \"18252alex.gould@redmatter.com4\"," +
            "\"ProfileId\": \"00e3z0000026arTAAQ\"," +
            "\"Extension\": \"18254\"," +
            "\"Alias\": \"18254\"," +
            "\"TimeZoneSidKey\": \"Europe\\/London\"," +
            "\"EmailEncodingKey\": \"ISO-8859-1\"," +
            "\"LanguageLocaleKey\": \"en_US\"," +
            "\"LocaleSidKey\": \"en_GB\"," +
            "\"Id\": \"0053z00000CX3v1DAA\"" +
            "}" +
            "]," +
            "\"avsUsers\": [" +
            "{" +
            "\"attributes\": {" +
            "\"type\": \"User__c\"," +
            "\"url\": \"\\/services\\/data\\/v51.0\\/sobjects\\/User__c\\/a103z00000KMsFfAAL\"" +
            "}," +
            "\"FirstName__c\": \"Automation\"," +
            "\"LastName__c\": \"User 1\"," +
            "\"Id__c\": 18253," +
            "\"SipExtension__c\": \"18253\"," +
            "\"Username__c\": \"18252alex.gould@redmatter.com1\"," +
            "\"User__c\": \"0053z00000CX3v0AAD\"," +
            "\"PBX__c\": true," +
            "\"CTI__c\": true," +
            "\"Manager__c\": true," +
            "\"Record__c\": true," +
            "\"Freedom__c\": true," +
            "\"Id\": \"a103z00000KMsFfAAL\"" +
            "}," +
            "{" +
            "\"attributes\": {" +
            "\"type\": \"User__c\"," +
            "\"url\": \"\\/services\\/data\\/v51.0\\/sobjects\\/User__c\\/a103z00000KMsFgAAL\"" +
            "}," +
            "\"FirstName__c\": \"Automation\"," +
            "\"LastName__c\": \"User 2\"," +
            "\"Id__c\": 18254," +
            "\"SipExtension__c\": \"18254\"," +
            "\"Username__c\": \"18252alex.gould@redmatter.com2\"," +
            "\"User__c\": \"0053z00000CX3v1AAD\"," +
            "\"PBX__c\": true," +
            "\"CTI__c\": true," +
            "\"Manager__c\": true," +
            "\"Record__c\": true," +
            "\"Freedom__c\": true," +
            "\"Id\": \"a103z00000KMsFgAAL\"" +
            "}" +
            "]," +
            "\"avsGroup\": {" +
            "\"attributes\": {" +
            "\"type\": \"Group__c\"," +
            "\"url\": \"\\/services\\/data\\/v51.0\\/sobjects\\/Group__c\\/a0R3z00000LSUhpEAH\"" +
            "}," +
            "\"Name\": \"Automation\"," +
            "\"Email__c\": \"alex.gould@redmatter.com\"," +
            "\"Extension__c\": \"18252\"," +
            "\"Id__c\": 18252," +
            "\"PBX__c\": true," +
            "\"Manager__c\": true," +
            "\"Record__c\": true," +
            "\"Id\": \"a0R3z00000LSUhpEAH\"" +
            "}" +
            "}";

    public static DummyResponse GetUsers() {

        System.out.println("***************** Creating users *****************");

        // Get dummy response from jsonResponse field above
        JsonPath jsonPath = JsonPath.from(jsonResponse);

        //List<User> users = Arrays.asList(jsonPath.getObject("users", User[].class));
        LinkedList<User> users = new LinkedList<>(Arrays.asList(jsonPath.getObject("users", User[].class)));
        List<AvsUser> avsUsers = Arrays.asList(jsonPath.getObject("avsUsers", AvsUser[].class));
        AvsGroup avsGroup = jsonPath.getObject("avsGroup", AvsGroup.class);

        //Create singleton
        DummyResponse dummyResponse = new DummyResponse(users, avsUsers, avsGroup);
        return dummyResponse;
    }
}
