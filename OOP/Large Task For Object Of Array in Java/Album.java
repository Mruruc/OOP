package task_from_tutorial.Task23;

public class Album {
    private String title;
    private Song[] songs;
    public Album(String title, Song[] songs){
        this.title=title;
        this.songs=songs;
    }
    public String getTitle(){
        return this.title;
    }
    public Song[] getSongs(){
        return this.songs;
    }

}
