public class Species extends Genus {
    private String speciesName;
    public Species( String s, String g ) {
        super(g);
        setSpeciesName(s);
    }
    public countSpecimens( Specimen[] animals, Species s ) {
        int i = 0;
        for (Specimen j : animals) {
            if (j.getTOA().equals(s)){
                i++;
            }
        }
        return i;
    }
    public LinkedList makeList( Specimen[] animals ) {
    // insert your code here
        LinkedList<Specimen> listOfSpecimen = new LinkedList<Specimen>();
        for (Specimen animal : animals) {
            listOfSpecimen.add(animal);
        }
        return listOfSpecimen;
    }
    public makeSpeciesList( LinkedList animals ) {
        LinkedList<Species> listofSpecies = new LinkedList<Species>();
        for (Specimen animal : animals) {
            listofSpecies.add(animal.getTOA());
        }
        return listofSpecies;
    }
    public makeSpeciesListUnique( LinkedList allSpecies ) {
        LinkedList<Species> listofSpeciesUnique = new LinkedList<Species>();
        for (Species species : allSpecies) {
            if (!listofSpeciesUnique.contains(species)) {
                listofSpeciesUnique.add(species);
            }
        }
        return listofSpeciesUnique;
    }
    
    public void setSpeciesName(String s){ speciesName = s; }
    public String getSpeciesName(){ return speciesName; }
    public String toString() { return "Species: " + getGenusName() + " " + speciesName; }
    public boolean equals(Species s) { return speciesName.equals(s.getSpeciesName()); }
}