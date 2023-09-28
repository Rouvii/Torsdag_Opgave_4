
class Team{
	
	private String teamName;
	private int rank;
	private String players;
	private static int count = 1;


public Team(String teamName){

this.teamName = teamName;
this.rank = count;
this.players =  players;
count++;

}

public String getTeam(){

	return teamName;
}

public int setRank(){

return rank;



}

public String toString(){

String s = "Team: "+this.teamName+", Rank:"+this.rank;

return s;

}


}