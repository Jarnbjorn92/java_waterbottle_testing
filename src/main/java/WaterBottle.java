public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int setVolume(int volume) {
        this.volume = volume;
        return volume;
    }

    public int drink(){
        return setVolume(this.volume - 10);
    }

    public int empty(){
        return setVolume(0);
    }

    public int fill(){
        return setVolume(100);
    }
}
