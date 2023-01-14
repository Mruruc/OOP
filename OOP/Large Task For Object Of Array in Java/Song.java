package task_from_tutorial.Task23;

public class Song {
    private String singer;
    private String title;

    public Song(String singer,String title){
        this.singer=singer;
        this.title=title;
    }
    public String getSinger(){
        return this.singer;
    }
    public String getTitle(){
        return this.title;
    }
    public String toString(){
        return singer +"-"+title;
    }

}
