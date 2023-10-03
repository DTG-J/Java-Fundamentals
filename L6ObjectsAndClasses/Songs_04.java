package L6ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Songs_04 {
  public static class Song{
      String typeList;
      String name;
      String time;
      public Song (String typeList, String name, String time){
          this.typeList = typeList;
          this. name = name;
          this.time = time;

      }
      public String getName (){
          return this.name;
      }
      public  String getTypeList (){
          return this.typeList;
      }
  }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nSongs = Integer.parseInt(scanner.nextLine());

        List <Song> songList = new ArrayList<>();
        for (int i = 1; i <=nSongs ; i++) {
            String inputLine = scanner.nextLine();
            String [] songsArr = inputLine.split("_");

            String typelist = songsArr[0];
            String name = songsArr[1];
            String time = songsArr[2];

            Song currentSong = new Song(typelist, name, time);
            songList.add(currentSong);

        }
        String command = scanner.nextLine();
        if (command.equals("all")){
            for (Song song: songList) {
                System.out.println(song.getName());
            }
        }else {
            for (Song song:songList) {
                String currentTypeList = song.getTypeList();
                if (currentTypeList.equals(command)){
                    System.out.println(song.getName());
                }
            }
        }

    }
}
