import java.util.HashMap;

public class ex5Nicknames {

    public static void main (String [] args) {
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("matti", "mage");
        nicknames.put("mikael", "mixu");
        nicknames.put("arto", "arppa");

        System.out.println(nicknames.get("matti"));
        System.out.println(nicknames.get("mikael"));
        System.out.println(nicknames.get("arto"));

    }
}
