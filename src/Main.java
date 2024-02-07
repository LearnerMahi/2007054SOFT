
public class Main {
    public static void main(String[] args) {
        GeneralTV gtv = new GeneralTV();
        SmartTV stv = new SmartTV();

        // Test the GeneralTV with a standard remote
        Remote remote = new Remote(gtv);
        remote.togglePower();
        remote.volumeUp();
        remote.channelUp();
        remote.channelDown();
        remote.volumeDown();

        // Test the SmartTV with a smart remote
        SmartRemote sremote = new SmartRemote(stv);
        sremote.togglePower();
        sremote.volumeUp();
        sremote.channelUp();
        sremote.channelDown();
        sremote.volumeDown();

        // Accessing Youtube() using smart-remote.
        sremote.showYoutube();

        }
}