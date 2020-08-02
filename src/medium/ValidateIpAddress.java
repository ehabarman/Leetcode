package medium;

import java.util.regex.Pattern;

public class ValidateIpAddress {

    public String validIPAddress(String IP) {
        String ip4Regex = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        Pattern ip4Pattern = Pattern.compile("^(" + ip4Regex + "\\.){3}" + ip4Regex + "$");
        String ip6Regex = "([0-9a-fA-F]{1,4})";
        Pattern ip6Pattern = Pattern.compile("^(" + ip6Regex + "\\:){7}" + ip6Regex + "$");
        if (ip4Pattern.matcher(IP).matches()) return "IPv4";
        if (ip6Pattern.matcher(IP).matches()) return "IPv6";
        return "Neither";
    }
}
