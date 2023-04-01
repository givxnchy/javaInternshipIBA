package iba.eu.java.education.statements_task4;

class ChatAgentTest {
    public static void main(String[] args) {
        ChatAgent agent1 = new ChatAgent();
        ChatAgent agent2 = new ChatAgent();
        if (agent1.reply("Hello")){
            agent2.reply("How are you?");
        }
        agent1.reply("Bye-Bye");
    }
}