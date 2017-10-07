package data;

public class Message {
    public String text;
    public String time;
    public String keyword;
    public enum Sender{BOT,USER}
    public Sender sender;
    public FeedResponse feedResponse;
}
