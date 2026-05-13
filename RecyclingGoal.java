/**
 * Represents <RecyclingGoal>
 * 
 * @author <Diana>
 *
 **/

/* UML CLASS DIAGRAM:
-----------------------------------------
<Main>
-----------------------------------------
<data,
departmentName     - String : the name of the department this goal belongs to
targetReductionPct - double : the target waste reduction as a percentage (0-100)
currentReductionPct- double : the current achieved reduction percentage
goalMet            - boolean: true if currentReductionPct >= targetReductionPct
goalYear           - int    : the year by which this goal should be achieved
>
-----------------------------------------
<actions ,
RecyclingGoal(String, double, double, boolean, int) - parameterized constructor
getDepartmentName()      - getter
getTargetReductionPct()  - getter
getCurrentReductionPct() - getter
isGoalMet()              - getter
getGoalYear()            - getter
setDepartmentName()      - setter
setTargetReductionPct()  - setter
setCurrentReductionPct() - setter
setGoalMet()             - setter
setGoalYear()            - setter
getRemainingPct()        - calculates how far from the target the dept still is
checkGoalStatus()        - returns a readable status string based on progress
equals()                 - compares two RecyclingGoal objects
toString()               - returns formatted string representation
>
-----------------------------------------
*/

public class RecyclingGoal 
{
	/***** STATIC VARIABLES *****/

	/***** INSTANCE VARIABLES *****/
  private String  departmentName;      // name of the department
  private double  targetReductionPct;  // reduction target as a percentage
  private double  currentReductionPct; // current achieved reduction percentage
  private boolean goalMet;             // true if target has been reached
  private int     goalYear;            // year the goal should be achieved by

  /**
  * DESCRIPTION: Parameterized constructor — initializes all fields.
  * PRECONDITION: targetReductionPct and currentReductionPct are between 0-100,
  *               goalYear is a valid calendar year
  * POSTCONDITION: A fully initialized RecyclingGoal object is created
  *
  * @param departmentName      name of the department
  * @param targetReductionPct  target waste reduction percentage
  * @param currentReductionPct current achieved reduction percentage
  * @param goalMet             whether the goal has been met
  * @param goalYear            target year for completion
  */
public RecyclingGoal(String departmentName, double targetReductionPct, double currentReductionPct, boolean goalMet, int goalYear) {
    this.departmentName      = departmentName;
    this.targetReductionPct  = targetReductionPct;
    this.currentReductionPct = currentReductionPct;
    this.goalMet             = goalMet;
    this.goalYear            = goalYear;
}

	/***** CONSTRUCTORS *****/

	/***** ACCESSORS *****/
	/**
  * DESCRIPTION: Returns the department name.
  * PRECONDITION: Object has been initialized
  * POSTCONDITION: Returns departmentName string
  * @return departmentName
  */
  public String getDepartmentName() {
    return departmentName;
  }

  /**
  * DESCRIPTION: Returns the target reduction percentage.
  * PRECONDITION: Object has been initialized
  * POSTCONDITION: Returns targetReductionPct as double
  * @return targetReductionPct
  */
  public double getTargetReductionPct() {
    return targetReductionPct;
  }

  /**
  * DESCRIPTION: Returns the current achieved reduction percentage.
  * PRECONDITION: Object has been initialized
  * POSTCONDITION: Returns currentReductionPct as double
  * @return currentReductionPct
  */
  public double getCurrentReductionPct() {
      return currentReductionPct;
  }

  /**
  * DESCRIPTION: Returns whether the goal has been met.
  * PRECONDITION: Object has been initialized
  * POSTCONDITION: Returns goalMet as boolean
  * @return goalMet
  */
  public boolean isGoalMet() {
    return goalMet;
  }

  /**
  * DESCRIPTION: Returns the target year for goal completion.
  * PRECONDITION: Object has been initialized
  * POSTCONDITION: Returns goalYear as int
  * @return goalYear
  */
  public int getGoalYear() {
    return goalYear;
  }

	/***** MUTATORS *****/
  /**
  * DESCRIPTION: Sets the department name.
  * PRECONDITION: departmentName is not null
  * POSTCONDITION: this.departmentName is updated
  * @param departmentName new department name
  */
  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  /**
  * DESCRIPTION: Sets the target reduction percentage.
  * PRECONDITION: targetReductionPct is between 0 and 100
  * POSTCONDITION: this.targetReductionPct is updated
  * @param targetReductionPct new target percentage
  */
  public void setTargetReductionPct(double targetReductionPct) {
    this.targetReductionPct = targetReductionPct;
  }

  /**
  * DESCRIPTION: Sets the current achieved reduction percentage.
  * PRECONDITION: currentReductionPct is between 0 and 100
  * POSTCONDITION: this.currentReductionPct is updated
  * @param currentReductionPct new current percentage
  */
  public void setCurrentReductionPct(double currentReductionPct) {
    this.currentReductionPct = currentReductionPct;
  }

  /**
  * DESCRIPTION: Sets whether the goal has been met.
  * PRECONDITION: none
  * POSTCONDITION: this.goalMet is updated
  * @param goalMet new boolean value
  */
  public void setGoalMet(boolean goalMet) {
    this.goalMet = goalMet;
    }

  /**
  * DESCRIPTION: Sets the target year.
  * PRECONDITION: goalYear is a valid calendar year
  * POSTCONDITION: this.goalYear is updated
  * @param goalYear new target year
  */
  public void setGoalYear(int goalYear) {
    this.goalYear = goalYear;
  }

	
/***** OTHER REQUIRED METHODS *****/
  /**
  * DESCRIPTION: Returns how many percentage points remain to reach the target.
  * PRECONDITION: targetReductionPct >= currentReductionPct (ideally)
  * POSTCONDITION: Returns 0 if goal is already met, otherwise returns the gap
  * @return remaining percentage points needed
  */
  public double getRemainingPct() {
    double remaining = targetReductionPct - currentReductionPct;
    return remaining < 0 ? 0 : remaining;
  }

  /**
  * DESCRIPTION: Returns a human-readable status string based on goal progress.
  * PRECONDITION: Object has been initialized
  * POSTCONDITION: Returns one of three status strings
  * @return status message string
  */
  public String checkGoalStatus() {
    if (currentReductionPct >= targetReductionPct) {
        return "Goal achieved! Great work, " + departmentName + ".";
    } else if (currentReductionPct >= targetReductionPct / 2.0) {
        return "On track — " + departmentName + " is halfway to the target.";
    } else {
        return "Behind target — " + departmentName + " needs to increase reduction efforts.";
    }
  }

  /**
  * DESCRIPTION: Compares this RecyclingGoal to another by department name and target.
  * PRECONDITION: other is not null
  * POSTCONDITION: Returns true if departmentName and targetReductionPct match
  * @param other the RecyclingGoal to compare against
  * @return true if equal, false otherwise
  */
  public boolean equals(RecyclingGoal other) {
    if (other == null) return false;
    return this.departmentName.equalsIgnoreCase(other.departmentName)
        && this.targetReductionPct == other.targetReductionPct;
  }

  /**
  * DESCRIPTION: Returns a formatted string representation of this RecyclingGoal.
  * PRECONDITION: Object has been initialized
  * POSTCONDITION: Returns a readable multi-field string
  * @return formatted string
  */
  @Override
  public String toString() {
    return String.format(
        "RecyclingGoal [ dept=%-20s | target=%5.1f%% | current=%5.1f%% | remaining=%5.1f%% | year=%d | met=%-5s ]",
        departmentName, targetReductionPct, currentReductionPct,
        getRemainingPct(), goalYear, goalMet
    );
  }
}

