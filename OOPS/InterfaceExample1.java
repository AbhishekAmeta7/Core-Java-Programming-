interface Playable{
    void paly();
    void pause();
    void stop();
}
class MusicPlayer implements Playable{
    public void play(){
        System.out.println("Play The Song");
    }
    public void pause(){
        System.out.println("Pause The Song");
    }
    public void stop(){
        System.out.println("Stop The Song");
    }
}

public class InterfaceExample1 {
    public static void main(String[] args) {
        
    }
}
// 13.Implement a `MusicPlayer` class that plays songs from a playlist. 
// Use an interface `Playable` to define methods like `play()`, `pause()`, and `stop()`. 
// Implement this interface in different classes like `Song` and `Podcast`.