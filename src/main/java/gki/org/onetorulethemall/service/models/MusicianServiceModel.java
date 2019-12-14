package gki.org.onetorulethemall.service.models;

public class MusicianServiceModel extends BaseServiceModel {

    private String name;
    private String song;
    private String link;

    public MusicianServiceModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
