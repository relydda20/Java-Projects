public class Genus {
    private String genusName;
    public Genus(String g) {
        this.genusName = g;
    }

    public String getGenusName() { return genusName; }
    public String toString() { return "This animal belongs in the " + genusName + " Genus"; }
}
