/**
 * Represents <WasteReport>
 * 
 * @author <Ava Gamble>
 *
 **/

/* UML CLASS DIAGRAM:
-----------------------------------------
<Main>
-----------------------------------------
<data,
reportPeriod    - String : label for the time period (e.g. "Q1 2025")
totalWasteLbs   - double : total paper waste in lbs for this period
employeeCount   - int    : number of employees during this period
isAudited       - boolean: whether this report has been officially audited
>
-----------------------------------------
<actions ,
WasteReport(String, double, int, boolean) - parameterized constructor
getReportPeriod()   - getter
getTotalWasteLbs()  - getter
getEmployeeCount()  - getter
getIsAudited()      - getter
setReportPeriod()   - setter
setTotalWasteLbs()  - setter
setEmployeeCount()  - setter
setAudited()        - setter
getWastePerEmployee() - calculates waste per employee
getDailyAverage()     - calculates daily average waste
equals()            - compares two WasteReport objects
toString()          - returns formatted string representation
>
-----------------------------------------
*/

public class WasteReport 
{

	/***** STATIC VARIABLES *****/

	/***** INSTANCE VARIABLES *****/
	private String  reportPeriod;   // label for the time period covered
  private double  totalWasteLbs;  // total waste in lbs during this period
  private int     employeeCount;  // number of employees in this period
  private boolean isAudited;      // true if the report has been audited

  /**
  * DESCRIPTION: Parameterized constructor — initializes all fields.
  * PRECONDITION: totalWasteLbs >= 0, employeeCount > 0
  * POSTCONDITION: A fully initialized WasteReport object is created
  *
  * @param reportPeriod  label for the time period
  * @param totalWasteLbs total waste (lbs) in this period
  * @param employeeCount number of employees
  * @param isAudited     whether this report is audited
  */
  public WasteReport(String reportPeriod, double totalWasteLbs, int employeeCount, boolean isAudited) {
    this.reportPeriod  = reportPeriod;
    this.totalWasteLbs = totalWasteLbs;
    this.employeeCount = employeeCount;
    this.isAudited     = isAudited;
  }

	/***** CONSTRUCTORS *****/

	/***** ACCESSORS *****/
	/**
  * DESCRIPTION: Returns the report period label.
  * PRECONDITION: Object has been initialized
  * POSTCONDITION: Returns reportPeriod string
  * @return reportPeriod
  */
  public String getReportPeriod() {
    return reportPeriod;
  }

  /**
  * DESCRIPTION: Returns total waste in lbs.
  * PRECONDITION: Object has been initialized
  * POSTCONDITION: Returns totalWasteLbs as double
  * @return totalWasteLbs
  */
  public double getTotalWasteLbs() {
    return totalWasteLbs;
  }

  /**
  * DESCRIPTION: Returns the employee count.
  * PRECONDITION: Object has been initialized
  * POSTCONDITION: Returns employeeCount as int
  * @return employeeCount
  */
  public int getEmployeeCount() {
    return employeeCount;
  }

  /**
  * DESCRIPTION: Returns whether the report has been audited.
  * PRECONDITION: Object has been initialized
  * POSTCONDITION: Returns isAudited as boolean
  * @return isAudited
  */
  public boolean getIsAudited() {
    return isAudited;
  }
	
	/***** MUTATORS *****/
  /**
  * DESCRIPTION: Sets the report period label.
  * PRECONDITION: reportPeriod is not null
  * POSTCONDITION: this.reportPeriod is updated
  * @param reportPeriod new period label
  */
  public void setReportPeriod(String reportPeriod) {
    this.reportPeriod = reportPeriod;
  }

  /**
  * DESCRIPTION: Sets the total waste in lbs.
  * PRECONDITION: totalWasteLbs >= 0
  * POSTCONDITION: this.totalWasteLbs is updated
  * @param totalWasteLbs new waste total
  */
  public void setTotalWasteLbs(double totalWasteLbs) {
    this.totalWasteLbs = totalWasteLbs;
  }

  /**
  * DESCRIPTION: Sets the employee count.
  * PRECONDITION: employeeCount > 0
  * POSTCONDITION: this.employeeCount is updated
  * @param employeeCount new employee count
  */
  public void setEmployeeCount(int employeeCount) {
    this.employeeCount = employeeCount;
  }

  /**
  * DESCRIPTION: Sets the audited status.
  * PRECONDITION: none
  * POSTCONDITION: this.isAudited is updated
  * @param isAudited new audited flag
  */
  public void setAudited(boolean isAudited) {
    this.isAudited = isAudited;
  }
	
/***** OTHER REQUIRED METHODS *****/
  /**
  * DESCRIPTION: Calculates waste per employee for this reporting period.
  * PRECONDITION: employeeCount > 0
  * POSTCONDITION: Returns totalWasteLbs / employeeCount
  * @return waste per employee in lbs
  */
  public double getWastePerEmployee() {
    if (employeeCount == 0) return 0;
    return totalWasteLbs / employeeCount;
  }

  /**
  * DESCRIPTION: Calculates the average daily waste assuming a 365-day year.
  * PRECONDITION: totalWasteLbs >= 0
  * POSTCONDITION: Returns totalWasteLbs / 365
  * @return average daily waste in lbs
  */
  public double getDailyAverage() {
    return totalWasteLbs / 365.0;
  }

  /**
  * DESCRIPTION: Compares this WasteReport to another by period label and total waste.
  * PRECONDITION: other is not null
  * POSTCONDITION: Returns true if reportPeriod and totalWasteLbs match
  * @param other the WasteReport to compare against
  * @return true if equal, false otherwise
  */
  public boolean equals(WasteReport other) {
    if (other == null) return false;
    return this.reportPeriod.equalsIgnoreCase(other.reportPeriod)
        && this.totalWasteLbs == other.totalWasteLbs;
    }

  /**
  * DESCRIPTION: Returns a formatted string representation of this WasteReport.
  * PRECONDITION: Object has been initialized
  * POSTCONDITION: Returns a readable multi-field string
  * @return formatted string
  */
  @Override
  public String toString() {
    return String.format(
        "WasteReport [ period=%-12s | totalWaste=%8.2f lb | employees=%4d | audited=%-5s | perEmployee=%6.2f lb | dailyAvg=%6.2f lb ]",
        reportPeriod, totalWasteLbs, employeeCount, isAudited,
        getWastePerEmployee(), getDailyAverage()
    );
  }
}

