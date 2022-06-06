package candidate;
/*
Lav en klasse Candidate med attributterne: name, party og numberOfvotes.
Lav en anden klasse Election til at indeholde en liste af kandidater. Tilføj en metode getTotalVotes der returnerer det totale antal stemmer for alle kandidater.
Tilføj en metode getCandidatesFromParty der returner en liste af alle kandidater fra et bestemt parti

 */

public class Candidate {

  private String name;
  private String party;
  private int numberOfVotes;


  public Candidate(String name, String party, int numberOfVotes) {
    this.name = name;
    this.party = party;
    this.numberOfVotes = numberOfVotes;
  }

  public int getNumberOfVotes() {
    return numberOfVotes;
  }

  public String getName() {
    return name;
  }

  public String getParty() {
    return party;
  }

  @Override
  public String toString() {
    return name + " Parti:" +  party + " - " + numberOfVotes + " stemmer";
  }
}
