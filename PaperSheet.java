/**
 * Represents <PaperSheet>
 * 
 * @author <Jaya Eckert>
 *
 **/

/* UML CLASS DIAGRAM:
-----------------------------------------
<Main>
-----------------------------------------
<data,
sheetName     - String  : the label/category of the paper type
weightPerUnit - double : the weight (in lbs) of one unit of this sheet
amount        - int     : how many units of this sheet type exist
isRecyclable  - boolean : whether this sheet type can be recycled
 >
-----------------------------------------
<actions ,
PaperSheet(String, double, int, boolean) - parameterized constructor
getSheetName()    - getter for sheetName
getWeightPerUnit()- getter for weightPerUnit
getAmount()       - getter for amount
isRecyclable()    - getter for isRecyclable
setSheetName()    - setter for sheetName
setWeightPerUnit()- setter for weightPerUnit
setAmount()       - setter for amount
setRecyclable()   - setter for isRecyclable
getTotalWeight()  - calculates total weight (weightPerUnit * amount)
equals()          - compares two PaperSheet objects by name and weight
toString()        - returns formatted string representation
 >
-----------------------------------------
*/

public class PaperSheet 
{
	/***** STATIC VARIABLES *****/

	/***** INSTANCE VARIABLES *****/
	private String  sheetName;      
    private double  weightPerUnit;  
    private int     amount;         
    private boolean isRecyclable;   

/**
* DESCRIPTION: Parameterized constructor — initializes all fields.
* PRECONDITION: weightPerUnit >= 0, amount >= 0
* POSTCONDITION: A fully initialized PaperSheet object is created
*
* @param sheetName     category name of the sheet
* @param weightPerUnit weight (lbs) per individual unit
* @param amount        number of units
* @param isRecyclable  true if recyclable
*/
public PaperSheet(String sheetName, double weightPerUnit, int amount, boolean isRecyclable) {
this.sheetName     = sheetName;
this.weightPerUnit = weightPerUnit;
this.amount        = amount;
this.isRecyclable  = isRecyclable;
    }

	/***** CONSTRUCTORS *****/

	/***** ACCESSORS *****/
	/**
* DESCRIPTION: Returns the sheet category name.
* PRECONDITION: Object has been initialized
* POSTCONDITION: Returns sheetName string
* @return sheetName
*/
public String getSheetName() {
   return sheetName;
 }

/**
* DESCRIPTION: Returns the weight per unit.
* PRECONDITION: Object has been initialized
* POSTCONDITION: Returns weightPerUnit as double
* @return weightPerUnit
*/
public double getWeightPerUnit() {
   return weightPerUnit;
 }

/**
* DESCRIPTION: Returns the number of units.
* PRECONDITION: Object has been initialized
* POSTCONDITION: Returns amount as int
* @return amount
*/
public int getAmount() {
   return amount;
 }

/**
* DESCRIPTION: Returns whether the sheet is recyclable.
* PRECONDITION: Object has been initialized
* POSTCONDITION: Returns isRecyclable as boolean
* @return isRecyclable
*/
public boolean getIsRecyclable() {
   return isRecyclable;
 }

	
	/***** MUTATORS *****/
/**
* DESCRIPTION: Sets the sheet category name.
* PRECONDITION: sheetName is not null
* POSTCONDITION: this.sheetName is updated
* @param sheetName new category name
*/
public void setSheetName(String sheetName) {
  this.sheetName = sheetName;
 }

/**
* DESCRIPTION: Sets the weight per unit.
* PRECONDITION: weightPerUnit >= 0
* POSTCONDITION: this.weightPerUnit is updated
* @param weightPerUnit new weight value
*/
public void setWeightPerUnit(double weightPerUnit) {
   this.weightPerUnit = weightPerUnit;
 }

/**
* DESCRIPTION: Sets the number of units.
* PRECONDITION: amount >= 0
* POSTCONDITION: this.amount is updated
* @param amount new unit count
*/
public void setAmount(int amount) {
   this.amount = amount;
 }

/**
* DESCRIPTION: Sets the recyclable flag.
* PRECONDITION: none
* POSTCONDITION: this.isRecyclable is updated
* @param isRecyclable new boolean value
*/
public void setRecyclable(boolean isRecyclable) {
   this.isRecyclable = isRecyclable;
 }

	
/***** OTHER REQUIRED METHODS *****/
/**
* DESCRIPTION: Calculates total weight of this sheet type (weightPerUnit * amount).
* PRECONDITION: weightPerUnit >= 0 and amount >= 0
* POSTCONDITION: Returns the total weight as a double
* @return total weight in lbs
*/
public double getTotalWeight() {
   return weightPerUnit * amount;
 }

/**
* DESCRIPTION: Compares this PaperSheet to another for equality by name and weight.
* PRECONDITION: other is not null
* POSTCONDITION: Returns true if sheetName and weightPerUnit match
* @param other the object to compare against
* @return true if equal, false otherwise
*/
public boolean equals(PaperSheet other) {
	if (other == null) return false;
    return this.sheetName.equalsIgnoreCase(other.sheetName)
         && this.weightPerUnit == other.weightPerUnit;
}

/**
* DESCRIPTION: Returns a formatted string representation of the PaperSheet.
* PRECONDITION: Object has been initialized
* POSTCONDITION: Returns a readable multi-field string
* @return formatted string
*/
@Override
public String toString() {
    return String.format(
        "PaperSheet [ name=%-25s | weightPerUnit=%6.2f lb | amount=%4d | recyclable=%-5s | totalWeight=%8.2f lb ]",
        sheetName, weightPerUnit, amount, isRecyclable, getTotalWeight()
    );
}

	/***** HELPER METHODS *****/

}

