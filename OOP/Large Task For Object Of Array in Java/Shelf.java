package task_from_tutorial.Task23;

public class Shelf {
    private Album[] albums;
    public Shelf(Album[] albums){
        this.albums=albums;
    }
    public Album[] getAlbums(){
        return this.albums;
    }

    public String findAlbumBySong(String songTitle){
        for (int i = 0; i < albums.length; i++) {
            for (int j = 0; j < albums[i].getSongs().length; j++) {
                if(albums[i].getSongs()[j].getTitle().equals(songTitle)){
                    return albums[i].getTitle();
                }
            }
        }
        return "No Data";
    }
    // with for each loop;
  /*  public String findAlbumBySong(String songTitle) {
        for (Album album : albums) {
            for (Song song : album.getSongs()) {
                if (song.getTitle().equals(songTitle)) {
                    return album.getTitle();
                }
            }
        }
        return "No Data";
    }*/

    public Song[] findSongsBySinger(String singer) {
        int counter = 0;
        for (Album album : albums)
            for (Song s : album.getSongs())
                if (s.getSinger().equals(singer))
                    counter++;

        Song[] result = new Song[counter];
        counter = 0;

        for (Album album : albums)
            for (Song s : album.getSongs())
                if (s.getSinger().equals(singer))
                    result[counter++] = s;

        return result;
    }


}
