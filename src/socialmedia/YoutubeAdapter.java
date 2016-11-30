public class YoutubeAdapter implements SocialMediaEntry {
	private YouTubeVideo video;

	YoutubeAdapter() {
		this.video = null;
	}

	YoutubeAdapter(String author, String title, String description) {
		this.video = new YouTubeVideo(author, title, description);
		// this.video.setAuthor = author;
		// this.video.setTitle = title;
		// this.video.setDescription = description;

	}

	public String getUser() {
		return video.getAuthor();
	}

	public String getPostText() {
		return (video.getTitle() + ": " + video.getDescription());
	}
}