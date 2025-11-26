package pt.pa.model.player;

public class OffState extends MusicPlayerState{

    public OffState(MusicPlayer player) {
        super(player);
        player.turnPlaybackOff();
    }

    @Override
    public void play() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void next() {

    }

    @Override
    public void prev() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void turnOn() {
        player.turnPlaybackOn();
        player.changeState(new StoppedState(player));
    }

    @Override
    public String status() {
        return "Off";
    }
}
