package medium;

import java.util.HashMap;
import java.util.Map;

public class EncodeAndDecodeTinyURL {

    Map<String, String> tinyUrl = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String shortUrl = longUrl.hashCode() + "";
        tinyUrl.put(shortUrl, longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return tinyUrl.get(shortUrl);
    }

}


