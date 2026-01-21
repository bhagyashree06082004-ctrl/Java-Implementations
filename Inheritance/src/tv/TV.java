

public class TV {
    public void turnOn() {
        System.out.println("The TV is now ON.");
    }
    public void turnOff(){
        System.out.println("The TV is now OFF.");
    }
    public static void main(String[] args) {
        TV myTV = new TV();
        myTV.turnOn();
        myTV.turnOff();

        SmartTV mySmartTV = new SmartTV();
        mySmartTV.turnOn();
        mySmartTV.connectToWiFi("HomeNetwork");
        mySmartTV.streamContent("Favorite Show");
        mySmartTV.turnOff();
    }
}

class SmartTV extends TV {
    public void connectToWiFi(String network) {
        System.out.println("Connecting to WiFi network: " + network);
    }
    public void streamContent(String content) {
        System.out.println("Streaming content: " + content);
    }
    public void turnOn() {
        System.out.println("The Smart TV is now ON with enhanced features.");
    }
    public void turnOff(){
        System.out.println("The Smart TV is now OFF.");
    }
}
