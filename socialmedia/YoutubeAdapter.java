package socialmedia;

/**
 * Created by Quade on 3/23/16.
 */
public class YoutubeAdapter implements SocialMediaEntry {
    private YouTubeVideo video;
    private YoutubeAdapter() { }

    public YoutubeAdapter(YouTubeVideo video) {
        this.video = video;
    }

    @Override
    public String getUser() {
        return video.getAuthor();
    }

    @Override
    public String getPostText() {
        return video.getTitle() + video.getDescription();
    }
}
