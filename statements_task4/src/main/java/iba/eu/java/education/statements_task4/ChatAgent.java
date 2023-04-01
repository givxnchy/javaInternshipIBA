package iba.eu.java.education.statements_task4;

import java.util.logging.Logger;

public class ChatAgent {
    public static boolean reply(String phrase) {
        Logger logger = Logger.getLogger(ChatAgent.class.getName());

        if (phrase.equals("Hello")) {
            logger.info("Agent1 said 'Hello' ");
            logger.info("Agent2 said Hello friend!' ");
        }

        if (phrase.equals("How are you?")) {
            logger.info("Agent1 asked 'How are you?' ");
            logger.info("Agent2 'Im fine thank you' ");
        }

        if (phrase.equals("Bye-Bye")) {
            logger.info("Agent1 said Bye-Bye");
            logger.info("Agent2 Cya soon!");
        }
        return true;
    }
}
