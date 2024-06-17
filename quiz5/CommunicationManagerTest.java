package quiz5;

public class CommunicationManagerTest {
    public static void main(String[] args) {
        CommunicationManager dummyCommunicationManager = new DummyCommunicationManager();
        UserInteractionManager userInteractionManager = new UserInteractionManager(dummyCommunicationManager);
        userInteractionManager.startInteraction();
    }
}