package pt.pa.model.player;

import javax.media.Player;

public class PausedState extends MusicPlayerState{
    public PausedState(MusicPlayer player) {
        super(player);
        player.pausePlayback();
    }

    @Override
    public void play() {
        player.changeState(new PlayingState(player));
    }

    @Override
    public void stop() {
        player.changeState(new StoppedState(player));
    }

    @Override
    public void next() {
        player.skip10seconds();
    }

    @Override
    public void prev() {
        player.rewind10seconds();
    }

    @Override
    public void turnOff() {
        player.changeState(new OffState(player));
    }

    @Override
    public void turnOn() {

    }

    @Override
    public String status() {
        return "Paused";
    }


}
