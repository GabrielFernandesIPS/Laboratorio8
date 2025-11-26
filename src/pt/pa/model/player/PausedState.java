package pt.pa.model.player;

import javax.media.Player;

public class PausedState extends MusicPlayerState{
    public PausedState(MusicPlayer player) {super(player);}

    @Override
    public void play() {
        player.startPlayback();
        player.changeState(new PlayingState(player));
    }

    @Override
    public void stop() {
        player.stopPlayback();
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
    public String status() {
        return "Paused";
    }


}
