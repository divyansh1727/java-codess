package oops.inter;

public class nicecar {
    private engine eng;
    private media player=new cdplayer();
    public nicecar(){
        eng=new powereng();
    }

    public nicecar(engine eng) {
        this.eng = eng;
    }
    public void start(){
        eng.start();
    }
    public void stop(){
        eng.stop();
    }
    public void startmusic(){
        player.start();
    }
}
