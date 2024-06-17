package quiz5;

public class DummyCommunicationManager implements CommunicationManager {
    @Override
    public String sendMessage(String message) {
        // Dummy implementation for testing purposes
        switch (message.toLowerCase()) {
            case "hello":
                return "Hello! How can I assist you today?";
            case "what time is it?":
                return "It's 9:00 AM.";
            case "i should go!":
                return "Wait for me!";
            default:
                return "I'm sorry, I don't understand.";
        }
    }
}
