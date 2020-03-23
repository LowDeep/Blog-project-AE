package objets;

public class Relation {
	
	/**
	 * The relation's author user.
	 */
	private int idA;
	
	/**
	 * The relation's second user.
	 */
	private int idU;
	
	/**
	 * The beginning of the relation date.
	 */
	private int datebeginning;
	
	public Relation() {
		
	}

	public Relation(int idA, int idU, int datebeginning) {

		this.idA = idA;
		this.idU = idU;
		this.datebeginning = datebeginning;
	}

	public int getIdA() {
		return idA;
	}

	public void setIdA(int idA) {
		this.idA = idA;
	}

	public int getIdU() {
		return idU;
	}

	public void setIdU(int idU) {
		this.idU = idU;
	}

	public int getDatebeginning() {
		return datebeginning;
	}

	public void setDatebeginning(int datebeginning) {
		this.datebeginning = datebeginning;
	}
	
}
