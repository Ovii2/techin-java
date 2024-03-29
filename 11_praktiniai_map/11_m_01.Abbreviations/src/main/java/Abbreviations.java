import java.util.HashMap;

public class Abbreviations {

    HashMap<String, String> map = new HashMap<>();

    public Abbreviations() {
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        map.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return map.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return map.getOrDefault(abbreviation, null);
    }
}
