package lesson_3.hw3.level_7_middle;

public class MusicSpeaker {

    private String model;
    private int volume;
    private boolean isOn;

    public MusicSpeaker(String model) {
        this.model = model;
        this.volume = 0;
        this.isOn = false;
    }

    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
        this.volume = 0;
    }

    public void increaseVolume() {
        if ((this.isOn) && (this.volume < 10)) {
            this.volume++;
        }
    }

    public void decreaseVolume() {
        if ((this.isOn) && (this.volume > 0)) {
            this.volume--;
        }
    }

    public String getModel() {
        return model;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return isOn;
    }
}
