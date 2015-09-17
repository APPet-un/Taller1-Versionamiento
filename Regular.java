/**
 * Created by Alvaro on 15/09/2015.
 */
public class Regular extends User{
    private int postViews;
    private int strikesNumber;
    private int starsNumner;
    private User user;
    private ArrayList<Post> posts;

     //Methods - getters & setters
    public int getPostViews() {
        return postViews;
    }

    public void setPostViews(int postViews) {
        this.postViews = postViews;
    }

    public int getStrikesNumber() {
        return strikesNumber;
    }

    public void setStrikesNumber(int strikesNumber) {
        this.strikesNumber = strikesNumber;
    }

    public int getStarsNumner() {
        return starsNumner;
    }

    public void setStarsNumner(int starsNumner) {
        this.starsNumner = starsNumner;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }


}