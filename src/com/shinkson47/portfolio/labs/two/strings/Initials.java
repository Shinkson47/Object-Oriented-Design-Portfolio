package com.shinkson47.portfolio.labs.two.strings;

import java.util.Arrays;

/**
 * Utility class to find initlas of provided names
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray</a>
 * @version 1
 */
public class Initials {

    /**
     * E-mail domain string
     *
     * Used when constructing e-mails.
     */
    public static final String DEFAULT_EMAIL_DOMAIN = "email.dmu.ac.uk";

    /**
     * Executable test.
     *
     * Prints initials of multiple names.
     */
    public static void main(String[] args) {
        printInitials("Big Boy");
        printInitials("Biggest of Boys");
        printInitials("David rooney");
        printInitials("Steve Rooney Cornelius Gates");
        printInitials("Steve");
        printInitials("    a    ");

        print(generateEmail(getInitials("Steve Rooney Cornelius Gates")));
    }

    /**
     * Finds initials of provided string, then prints them to output stream.
     * @param name name to find initials of.
     */
    public static void printInitials(String name){
        print((getInitials(name)));
    }


    /**
     * Finds initials of the provided name,
     * splitting names by a space. Initials are not seperated, i.e with an '.',
     * and are capitalized regardless of input case.
     *
     * @param name Name to return the initials of.
     * @return Non-seperated, capitalized initials of the name provided.
     */
    public static String getInitials(String name){
        String Initials = "";
        for(String currentName : Arrays.asList(name.split(" "))){
            if(currentName.length()<1) continue;
            Initials += currentName.substring(0,1).toUpperCase(); // Can't perform to upper on a char, but to char it more ideal here.
        }
        return Initials;
    }

    /**
     * Generates an email using the default domain, and the prefix provided in the format
     * prefix@defaultdomain
     * @return generated e-mail
     */
    public static String generateEmail(String prefix){
        return generateEmail(prefix, DEFAULT_EMAIL_DOMAIN);
    }

    /**
     * Generates an email using the default domain, and the prefix provided in the format
     * <i>prefix@domain</i>
     *
     * Appends provided <i>prefix</i> and <i>domain</i>, separated by an '<i>@</i>'
     *
     * @param prefix user name section of the e-mail. <i>prefix@domain</i>
     * @param domain domain section of the e-mail <i>prefix@domain</i>
     * @return Generated e-mail.
     */
    public static String generateEmail(String prefix, String domain){
        return prefix + '@' + domain;
    }

    /**
     * Parses to system out.
     *
     * A shortcut, and consolodation for all output of this class.
     * If a change needs to be made to all output, it can be done in one place.
     * @param string to print to console.
     */
    private static void print(String string) {
        System.out.println(string);
    }

}
