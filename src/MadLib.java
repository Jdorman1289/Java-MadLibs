import java.util.ArrayList;

public class MadLib {
    private String story;
    private ArrayList<String> savedStories;
    private String adj;
    private String noun;
    private String adv;
    private String verb;

    public MadLib() {
        this.savedStories = new ArrayList<String>();
    }

    public String getStory() {
        return story;
    }

    public void setStory() {
        String story = String.format("""  
                Once upon a time, in a %s kingdom, there lived a brave %s who was known for their %s skills. 
                They were admired by all for their %s heart and %s spirit. One day, a second %s appeared in the kingdom, causing chaos and %s, spreading fear among the people. 
                Our brave %s knew they had to take action and %s the %s to restore peace and harmony. 
                With their %s determination and %s quick thinking, they embarked on a thrilling adventure, facing numerous challenges along the way. 
                Finally, after a %s battle, the brave %s emerged victorious, saving the kingdom and becoming a %s legend in the process.
                """, this.adj, this.noun, this.adv, this.adj, this.noun, this.noun, this.adv, this.noun, this.verb, this.noun, this.adj, this.adv, this.adj, this.noun, this.adj);

        this.story = story;
    }

    public void setAdj(String adj) {
        this.adj = adj;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public void setAdv(String adv) {
        this.adv = adv;
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
