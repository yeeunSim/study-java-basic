package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer palyer = new MusicPlayer();

        // 음악 플레이어 켜기
        palyer.on();

        // 볼륨 증가
        palyer.volumeUp();

        // 볼륨 증가
        palyer.volumeUp();

        // 볼륨 감소
        palyer.volumeDown();

        // 음악 플레이어 상태
        palyer.showStatus();

        //음악 플레이어 끄기
        palyer.off();

    }
}
