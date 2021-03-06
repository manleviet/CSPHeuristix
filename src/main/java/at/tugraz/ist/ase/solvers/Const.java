package at.tugraz.ist.ase.solvers;

/** Represents a Constraint
 * @author Seda Polat Erdeniz (AIG, TUGraz)
 * @author http://ase.ist.tugraz.at
 * @version 1.0
 * @since 1.0
*/


public class Const {
	
	int varID;
	String operator;
	int value;
	 
	public Const(int varID, String operator, int value){
		this.varID = varID;
		this.operator = operator;
		this.value = value;
	}
	
	public String getOperator(){
		return this.operator;
	}
	public int getVarID(){
		return this.varID;
	}
	public int getValue(){
		return this.value;
	}
	
	public String toString(){
		
		String print = "CONSTRAINT: ";
		print+= "var-"+varID+" "+operator+" "+value;
		return print;
		
	}
	
}
