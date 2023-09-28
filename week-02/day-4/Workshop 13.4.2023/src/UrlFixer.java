public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it in more than one way using different String functions!
        System.out.println(url.indexOf("b"));
        System.out.println(url.length());
        buildAString(url);


    }
    public static void buildAString (String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.insert(5, ":");
        sb.replace(38, 43, "odds");
        System.out.println(sb.toString());
    }
}
