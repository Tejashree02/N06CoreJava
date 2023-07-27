package org.tnsif.multilevelinheritance;

public class TeamMembersExecutor extends ManagerExecutor {

	
	private int TeamID;
	private String TeamName;
	
	
	
	public int getTeamID() {
		return TeamID;
	}



	public void setTeamID(int teamID) {
		TeamID = teamID;
	}



	public String getTeamName() {
		return TeamName;
	}



	public void setTeamName(String teamName) {
		TeamName = teamName;
	}



	@Override
	public String toString() {
		return "TeamMembersExecutor [TeamID=" + TeamID + ", TeamName=" + TeamName + ", toString()=" + super.toString()
				+ "]";
	}



	public TeamMembersExecutor(int orgId, String orgName, String area, int pincode, int Id, int Salary, int TeamID,String TeamName) {
		super(orgId, orgName, area, pincode, Id, Salary);
		this.TeamID=TeamID;
		this.TeamName=TeamName;
		// TODO Auto-generated constructor stub
	}
	

}
