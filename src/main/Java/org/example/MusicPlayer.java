package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList;

//    private String name;
//    private int volume;

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }

    public void playMusicList(){
        System.out.println("Your music list: ");
        for(Music music:musicList){
            System.out.println(" " + music.getSong());
        }
    }

}
