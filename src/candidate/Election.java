package candidate;

// Lav en anden klasse Election til at indeholde en liste af kandidater.
// Tilføj en metode getTotalVotes der returnerer det totale antal stemmer for alle kandidater.
//Tilføj en metode getCandidatesFromParty der returner en liste af alle kandidater fra et bestemt parti

import java.util.ArrayList;

public class Election {

  private ArrayList<Candidate> kandidatListe = new ArrayList<>();


  public int getTotalVotes(){

    int votes = 0;
    for (int i = 0; i < kandidatListe.size(); i++) {
      votes += kandidatListe.get(i).getNumberOfVotes();
    }
    return votes;
  }


  public ArrayList<Candidate> getCandidatesFromParty(String parti){

    ArrayList<Candidate> listParty = new ArrayList<>();

    for (int i = 0; i < kandidatListe.size(); i++) {

      if(kandidatListe.get(i).getParty() == parti){
        listParty.add(kandidatListe.get(i));
      } else return null;
    }
    return listParty;
  }



  public static void main(String[] args) {

    Election election = new Election();
    Candidate candidate1 = new Candidate("Marcus Holje", "AP", 10000);
    Candidate candidate2 = new Candidate("Håvard Larsen", "AP", 2000);
    Candidate candidate3 = new Candidate("Tommy Hansen", "AP", 8000);
    Candidate candidate4 = new Candidate("Lars Hansen", "FRP", 1000);
    Candidate candidate5 = new Candidate("Ole Hansen", "FRP", 2000);
    election.kandidatListe.add(candidate1);
    election.kandidatListe.add(candidate2);
    election.kandidatListe.add(candidate3);
    System.out.println("Det totale antallet af stemmer: " + election.getTotalVotes());

    System.out.println("Liste af alle kandidater fra et bestemt parti:");
    System.out.println(election.getCandidatesFromParty("SP"));

  }

}
