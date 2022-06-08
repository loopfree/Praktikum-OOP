// Steven
// 13520131
// Minggu 10: Praktikum 3

class Crewmate {
	public String name;
	public boolean isDead;

	private int stabCount;

	public static int id = 0;

	public Crewmate() {
		Crewmate.id += 1;
		this.name = "Crewmate " + id;
		this.isDead = false;
		this.stabCount = 0;
	}

	public Crewmate(String name) {
		Crewmate.id += 1;
		this.name = name;
		this.isDead = false;
		this.stabCount = 0;
	}

	public void stab(Crewmate victim) {
		if (this.isDead == true) {
			System.out.println(this.name + " is dead");
		}
		else {
			System.out.println(this.name + " stabs " + victim.name);
			victim.isDead = true;
			this.stabCount += 1;
		}
	}

	public String toString() {
		if (this.isDead == true) {
			return(this.name + " is dead");
		}
		else {
			if (this.stabCount > 0) {
				return(this.name + " is sus");
			}
			else {
				return(this.name + " is cool");
			}
		}
	}
}