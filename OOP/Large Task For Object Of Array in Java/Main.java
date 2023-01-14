package task_from_tutorial.Task23;

public class Main {
    public static void main(String[] args) {


        Song song1 = new Song("Elvis", "Party");
        Song song2 = new Song("Elvis", "Hot Dog");
        Song[] songsL = new Song[]{song1, song2};
        Album alb1 = new Album("Loving You", songsL);


        Song song3 = new Song("Armstrong", "A Foggy Day");
        Song song4 = new Song("Fitzgerald", "Cheek  to  Cheek");
        Song[] songE = new Song[]{song3, song4};
        Album alb2 = new Album("Ella & Louis", songE);

        Song song5 = new Song("Elvis", "I Love  You  Because");
        Song song6 = new Song("Sinatra", "My Way");
        Song[] songES = new Song[]{song5, song6};
        Album alb3 = new Album("The  Best Of", songES);

        Album[] tAlbums = new Album[]{alb1, alb2, alb3};
        //printing tAlbums array.
        for (int i = 0; i < tAlbums.length; i++) {
            for (int j = 0; j < tAlbums[i].getSongs().length; j++) {
                System.out.println(tAlbums[i].getTitle() + " <>" + tAlbums[i].getSongs()[j].getTitle()
                        + "-->" + tAlbums[i].getSongs()[j].getSinger());
            }
        }
        System.out.println("==============================================");
        //create Shelf object which is hold array of Albums
        Shelf shelf = new Shelf(tAlbums);


        System.out.println("Song  from  album: " +
                shelf.findAlbumBySong("Cheek  to  Cheek"));
        System.out.println("Song  from  album: " +
                shelf.findAlbumBySong("My Way"));

        System.out.println("==========================");
        Song[] elvisSongs = shelf.findSongsBySinger("Elvis");

        for (int i = 0; i < elvisSongs.length; i++)
            System.out.println(elvisSongs[i]);
        System.out.println("=======================================");
        Song[] armstrongSongs = shelf.findSongsBySinger("Armstrong");
        for (int i = 0; i < armstrongSongs.length; i++)
            System.out.println(armstrongSongs[i]);


    }
}











