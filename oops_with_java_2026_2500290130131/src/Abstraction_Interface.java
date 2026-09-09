abstract class Device {
    String brand = "Samsung";
    abstract void turnOn();

    void showBrand(){
        System.out.println("Brand : " + brand);
    }
}

//Interface 1
interface Camera{
    int MAX_ZOOM = 10;   //public static final
    void takePhoto();    //abstract and public method

    default void cameraInfo(){     //concrete method
        System.out.println("Camera is ready");
    } 
}

//Interface 2
interface MusicPlayer{
    String TYPE = "Digital";    //public static final
    void playMusic();           //abstact and public method

    default void musicInfo(){
        System.out.println("Music player is ready");
    }
}

//Child class
class Smartphone extends Device implements Camera, MusicPlayer{
    
    //implementing abstract method of device
    void turnOn(){
        System.out.println("Smartphone is turned ON");
    }

    //implementing abstract method of camera
    public void takePhoto(){
        System.out.println("Taking photo... ");
    }

    //implementing abstract method of musicplayer
    public void playMusic(){
        System.out.println("Playing music...");
    }
}

//Main class
public class Abstraction_Interface {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.turnOn();
        s.showBrand();
        s.takePhoto();
        s.playMusic();
        s.cameraInfo();
        s.musicInfo();
        System.out.println("Maximum Zoom: " + Camera.MAX_ZOOM);
        System.out.println("Music Type: " + MusicPlayer.TYPE);
    }
}
