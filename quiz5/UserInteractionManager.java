package quiz5;

import java.util.Scanner;

public class UserInteractionManager {
    private CommunicationManager communicationManager;
    private boolean running;

    public UserInteractionManager(CommunicationManager communicationManager) {
        this.communicationManager = communicationManager;
        this.running = true;
    }

    public void startInteraction() {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (running) {
            System.out.print("User: ");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                endConversation();
            } else {
                String response = communicationManager.sendMessage(userInput);
                System.out.println("Chatbot: " + response);
            }
        }

        scanner.close();
    }

    public void endConversation() {
        System.out.println("Exiting the chat...");
        running = false;
    }
}