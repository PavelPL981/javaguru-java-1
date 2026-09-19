package lesson_3.hw3.level_7_middle;

class MusicSpeakerApp {

    static void main() {
        MusicSpeaker speaker = new MusicSpeaker("Samsung");

        System.out.println("Volume = " + speaker.getVolume());
        System.out.println("IsOn = " + speaker.isOn());

        speaker.on();

        speaker.increaseVolume();
        speaker.increaseVolume();

        System.out.println("Volume = " + speaker.getVolume());
        System.out.println("IsOn = " + speaker.isOn());

        speaker.decreaseVolume();

        System.out.println("Volume = " + speaker.getVolume());
        System.out.println("IsOn = " + speaker.isOn());

        speaker.off();

        System.out.println("Volume = " + speaker.getVolume());
        System.out.println("IsOn = " + speaker.isOn());
    }
}
