package quiz6;

public class CommunicationManagerTest {
    public static void main(String[] args) {
        String commonServiceUrl = "http://common.service.url";
        String specialServiceUrl = "http://special.service.url";
        CommunicationManager specialCommunicationManager = new SpecialCommunicationManager(commonServiceUrl, specialServiceUrl);
        UserInteractionManager userInteractionManager = new UserInteractionManager(specialCommunicationManager);
        userInteractionManager.startInteraction();
    }
}