import java.util.Scanner;

abstract class Media {
    protected String title;
    protected String artist;
    protected int duration; // in seconds
    
    Media(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    
    abstract void play();
    abstract void displayInfo();
}

class Song extends Media {
    private String album;
    private String genre;
    
    Song(String title, String artist, int duration, String album, String genre) {
        super(title, artist, duration);
        this.album = album;
        this.genre = genre;
    }
    
    void play() {
        System.out.println("Playing song: " + title + " by " + artist);
    }
    
    void displayInfo() {
        System.out.println("Song Info:");
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Album: " + album);
        System.out.println("Genre: " + genre);
        System.out.println("Duration: " + duration/60 + "m " + duration%60 + "s");
    }
}

class Podcast extends Media {
    private String host;
    private String topic;
    
    Podcast(String title, String artist, int duration, String host, String topic) {
        super(title, artist, duration);
        this.host = host;
        this.topic = topic;
    }
    
    void play() {
        System.out.println("Playing podcast: " + title + " hosted by " + host);
    }
    
    void displayInfo() {
        System.out.println("Podcast Info:");
        System.out.println("Title: " + title);
        System.out.println("Host: " + host);
        System.out.println("Topic: " + topic);
        System.out.println("Duration: " + duration/60 + "m " + duration%60 + "s");
    }
}

public class MediaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter media type (song/podcast):");
        String type = sc.next();
        
        System.out.println("Enter title:");
        String title = sc.next();
        
        System.out.println("Enter artist/host:");
        String artist = sc.next();
        
        System.out.println("Enter duration in seconds:");
        int duration = sc.nextInt();
        
        Media media;
        
        if (type.equalsIgnoreCase("song")) {
            System.out.println("Enter album:");
            String album = sc.next();
            System.out.println("Enter genre:");
            String genre = sc.next();
            media = new Song(title, artist, duration, album, genre);
        } else {
            System.out.println("Enter topic:");
            String topic = sc.next();
            media = new Podcast(title, artist, duration, artist, topic);
        }
        
        media.displayInfo();
        media.play();
        sc.close();
    }
}