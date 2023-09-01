import java.util.ArrayList;

public class MadLib {
    private String story;
    private ArrayList<String> savedStories;
    private String adj;
    private String noun;
    private String adv;
    private String verb;

    public MadLib() {
    }

    public MadLib(String adj, String noun, String adv, String verb) {
        this.adj = adj;
        this.noun = noun;
        this.adv = adv;
        this.verb = verb;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getAdj() {
        return adj;
    }

    public void setAdj(String adj) {
        this.adj = adj;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public String getAdv() {
        return adv;
    }

    public void setAdv(String adv) {
        this.adv = adv;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public ArrayList<String> getSavedStories() {
        return savedStories;
    }

    public void setSavedStories(String newStory) {
        this.savedStories.add(newStory);
    }
}
