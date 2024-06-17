package quiz6;

import java.util.ArrayList;
import java.util.List;

public class SpecialCommunicationManager implements CommunicationManager {
    private String commonServiceUrl;
    private String specialServiceUrl;
    private List<String> conversationHistory;

    public SpecialCommunicationManager(String commonServiceUrl, String specialServiceUrl) {
        this.commonServiceUrl = commonServiceUrl;
        this.specialServiceUrl = specialServiceUrl;
        this.conversationHistory = new ArrayList<>();
    }

    @Override
    public String sendMessage(String message) {
        conversationHistory.add(message);
        String serviceUrl = commonServiceUrl;

        // Check if the message or conversation history contains the word "help"
        if (message.toLowerCase().contains("help") || conversationHistory.stream().anyMatch(m -> m.toLowerCase().contains("help"))) {
            serviceUrl = specialServiceUrl;
        }

        // Here you would send the POST request to the serviceUrl and get the response
        // For demonstration purposes, we'll just return a dummy response

        return "Response from " + (serviceUrl.equals(specialServiceUrl) ? "special service (I will save you, AM BATMAN!!!)" : "common service");
    }

    public List<String> getConversationHistory() {
        return conversationHistory;
    }
}
