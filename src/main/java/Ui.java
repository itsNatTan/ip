import java.util.Random;

public class Ui {
    public static String logo = "\n" +
            "                                                                                                    \n" +
            "                                                             ____                                   \n" +
            "    ,---,.                                ,---,            ,'  , `.                                 \n" +
            "  ,'  .' |,-.----.                      ,--.' |         ,-+-,.' _ |  ,--,                     ,---, \n" +
            ",---.'   |\\    /  \\    ,---.            |  |  :      ,-+-. ;   , ||,--.'|         ,---,     ,---.'| \n" +
            "|   |   .'|   :    |  '   ,'\\           :  :  :     ,--.'|'   |  ;||  |,      ,-+-. /  |    |   | : \n" +
            ":   :  |-,|   | .\\ : /   /   |   ,---.  :  |  |,--.|   |  ,', |  ':`--'_     ,--.'|'   |    |   | | \n" +
            ":   |  ;/|.   : |: |.   ; ,. :  /     \\ |  :  '   ||   | /  | |  ||,' ,'|   |   |  ,\"' |  ,--.__| | \n" +
            "|   :   .'|   |  \\ :'   | |: : /    / ' |  |   /' :'   | :  | :  |,'  | |   |   | /  | | /   ,'   | \n" +
            "|   |  |-,|   : .  |'   | .; :.    ' /  '  :  | | |;   . |  ; |--' |  | :   |   | |  | |.   '  /  | \n" +
            "'   :  ;/|:     |`-'|   :    |'   ; :__ |  |  ' | :|   : |  | ,    '  : |__ |   | |  |/ '   ; |:  | \n" +
            "|   |    \\:   : :    \\   \\  / '   | '.'||  :  :_:,'|   : '  |/     |  | '.'||   | |--'  |   | '/  ' \n" +
            "|   :   .'|   | :     `----'  |   :    :|  | ,'    ;   | |`-'      ;  :    ;|   |/      |   :    :| \n" +
            "|   | ,'  `---'.|              \\   \\  / `--''      |   ;/          |  ,   / '---'        \\   \\  /   \n" +
            "`----'      `---`               `----'             '---'            ---`-'                `----'    \n" +
            "                                                                                                    \n";

    public static String[] exitMessage = {"May you seek the truth.",
            "May the truth prevail.", "May you yet again thirst for wisdom.", "May your quest for wisdom be unwavering.",
            "May your pursuit of knowledge illuminate your path."};

    /**
     * Exit message
     */
    public static void bye() {
        System.out.println(exitMessage[new Random().nextInt(exitMessage.length)]);
        System.exit(0);
    }

    /**
     * Greeting message
     */
    public static void greeting() {
        System.out.println(logo + "___________________________________________________________________________________________________________\n" +
                " Greetings! I'm EpochMind, Seer of the Cosmos, Keeper of Knowledge, Pantheon of Wisdom, the Eternal Truth\n" +
                " Ask and ye may receive.\n" +
                "___________________________________________________________________________________________________________\n");
    }

    /**
     * Print horizontal line breaks
     */
    public static void line() {
        System.out.println("___________________________________________________________________________________________________________\n");
    }
}
