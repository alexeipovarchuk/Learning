package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext");
        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicList");
        musicPlayer.playMusicList();

//        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer");
//        musicPlayer.playMusicList();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
