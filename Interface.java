class Phone{
    public void call(){
        System.out.println("Calling...");
    }

    public void message(){
        System.out.println("Messaging...");
    }
}

interface ICamera{
    void clickPhoto();
    void recordVideo();
}

interface IMusicPlayer{
    void playMusic();
    void pauseMusic();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer{
    @Override
    public void clickPhoto() {
        System.out.println("Photo clicked");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music paused");
    }
}


public class Interface {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.message();
        sp.clickPhoto();
        sp.recordVideo();
        sp.playMusic();
        sp.pauseMusic();

        ICamera cam = new SmartPhone();
        cam.clickPhoto();
        cam.recordVideo();
    }
}
