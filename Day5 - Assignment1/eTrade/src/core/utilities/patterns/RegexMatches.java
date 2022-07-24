package core.utilities.patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    public boolean emailPattern(String email)
    {
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(email);
        return matcher.find();
    }

    public boolean passwordPattern(String password)
    {
        Pattern pattern = Pattern.compile("[A-Z0-9.%-]{6}",Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(password);
        return matcher.find();
    }

    public boolean namePattern(String name)
    {
        Pattern pattern = Pattern.compile("[A-Z]{2}",Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(name);
        return matcher.find();
    }


}

