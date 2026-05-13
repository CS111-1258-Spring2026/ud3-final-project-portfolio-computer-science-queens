/********************************************
*	AUTHORS:	<Jaya Eckert>
* COLLABORATORS: <Diana, Avar>
*	LAST MODIFIED:	<date of last change>
********************************************/

import java.util.Scanner;

/********************************************
 * Paper Waste Tracker
 *********************************************
 * PROGRAM DESCRIPTION:
 * Creates a baseline for paper waste tracking in businesses to optimize
 * the potential for future waste reduction and conservation. Provides
 * formatted output showing daily use summaries and demonstrates the
 * use of three programmer-defined classes.
 *********************************************
 * ALGORITHM:
 * 1. Declare variables for sheet type, amount, weight, distribution, frequency
 * 2. Initialize variables with example sheet type data.
 * 3. Calculate total sheet waste
 * 4. Calculate average paper waste using static methods.
 * 5. Output formatted summary.
 *********************************************
 * STATIC METHODS:
 * calculateTotalWasteYear  - Jaya
 * calculateAverageWasteYear - Jaya
 * calculateAverageWasteDaily - Ava
 * calculateAverageWastePerEmployee - Ava
 * calculateAverageWasteMonthly - diana
 * calculateAverageWaste - diana
 * checkSustainability - shared
 *********************************************
* Scanner= used for console input>
*********************************************/


public class Main 
{

  /***** CONSTANT SECTION *****/
  public static final int numSheets    = 3;
  public static final int weeks_InYear = 52;
  public static final int days_In_Year = 365;


  public static void main(String[] args)
  {
   
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Our Paper Waste Tracker!\n");

    // PaperSheet objects  - Jaya Eckert
    System.out.println("=== PaperSheet Objects ===");

    PaperSheet sheet1 = new PaperSheet("Magazines and Catalogs", 0.5,  4,  true);
    PaperSheet sheet2 = new PaperSheet("Newspaper",              1.0,  8,  true);
    PaperSheet sheet3 = new PaperSheet("Miscellaneous",          0.01, 20, false);

    System.out.println(sheet1);
    System.out.println(sheet2);
    System.out.println(sheet3);

    System.out.println("\nSheet 1 name (getter): " + sheet1.getSheetName());

    sheet3.setRecyclable(true);
    System.out.println("Sheet 3 recyclable after setter: " + sheet3.getIsRecyclable());

    PaperSheet sheet1Copy = new PaperSheet("Magazines and Catalogs", 0.5, 10, false);
    System.out.println("sheet1.equals(sheet1Copy) [same name & weight]: "
         + sheet1.equals(sheet1Copy));   
    System.out.println("sheet1.equals(sheet2)    [different]:          "
        + sheet1.equals(sheet2));        


  // Arrays (REQUIRED)
    String[] sheetNameType   = { sheet1.getSheetName(), sheet2.getSheetName(), sheet3.getSheetName() };
    double[] sheetWeightType = { 2000, 8000, 400 };

    System.out.println();
    for (int i = 0; i < sheetNameType.length; i++) {
    System.out.println(sheetNameType[i] + " weighs " + sheetWeightType[i]
          + " lb -- " + checkSustainability(sheetWeightType[i]));
  
    }

    // WasteReport object  - Ava
    System.out.println("\n=== WasteReport Object ===");

    WasteReport annualReport = new WasteReport("FY 2025", 5000.50, 100, false);

    System.out.println(annualReport);

    System.out.printf("Total waste (getter): %.2f lb%n", annualReport.getTotalWasteLbs());

    annualReport.setAudited(true);
    System.out.println("Report audited after setter: " + annualReport.getIsAudited());

    WasteReport sameReport = new WasteReport("FY 2025", 5000.50, 80, true);
    WasteReport diffReport = new WasteReport("FY 2024", 4200.00, 95, true);
    System.out.println("annualReport.equals(sameReport) [same period & waste]: "
        + annualReport.equals(sameReport));  
    System.out.println("annualReport.equals(diffReport) [different]:           "
        + annualReport.equals(diffReport));  

  // RecyclingGoal objects  - Diana
  System.out.println("\n=== RecyclingGoal Objects ===");

  RecyclingGoal goal1 = new RecyclingGoal("Operations",  30.0, 32.5, true,  2025);
  RecyclingGoal goal2 = new RecyclingGoal("Marketing",   25.0, 10.0, false, 2026);
  RecyclingGoal goal3 = new RecyclingGoal("IT Services", 20.0, 18.0, false, 2025);

  System.out.println(goal1);
  System.out.println(goal2);
  System.out.println(goal3);

  System.out.println("\nMarketing target (getter): " + goal2.getTargetReductionPct() + "%");

  goal3.setCurrentReductionPct(21.0);
  goal3.setGoalMet(true);
  System.out.println("IT Services goal met after setter: " + goal3.isGoalMet());

  System.out.println("\n--- Goal Status Messages ---");
  System.out.println(goal1.checkGoalStatus());
  System.out.println(goal2.checkGoalStatus());
  System.out.println(goal3.checkGoalStatus());

  RecyclingGoal goal1Copy = new RecyclingGoal("Operations", 30.0, 15.0, false, 2027);
  System.out.println("\ngoal1.equals(goal1Copy) [same dept & target]: "
      + goal1.equals(goal1Copy));  
   System.out.println("goal1.equals(goal2)     [different]:         "
      + goal1.equals(goal2));       



   // /***** DECLARATION SECTION *****/
   // String sheet1, sheet2, sheet3;
    //int    amount1, amount2, amount3;
    //double weight1, weight2, weight3;
   // int    distribution1, distribution2, distribution3;
   // double frequency1, frequency2, frequency3;
    //double totalYearlyWaste;
    //double dailyAvg;
    //double avgPerEmployee;
    //int    employeeCount = 100;


    /***** INITIALIZATION SECTION *****/
    //sheet1        = "Magazines and Catalogs";
   // amount1       = 4;
    //weight1       = 0.5;
   // distribution1 = 100;
    //frequency1    = 10.0;

    //sheet2        = "Newspaper";
    //amount2       = 8;
    //weight2       = 1.0;
    //distribution2 = 100;
    //frequency2    = 10.0;

    //sheet3        = "Miscellaneous";
    //amount3       = 20;
    //weight3       = 0.01;
    //distribution3 = 100;
    //frequency3    = 10.0;

    //totalYearlyWaste = 5000.50;


    /***** INTRO SECTION *****/

    /***** INPUT SECTION *****/

    /***** PROCESSING SECTION *****/
    int    amount1 = sheet1.getAmount(),       amount2 = sheet2.getAmount(),       amount3 = sheet3.getAmount();
    double weight1 = sheet1.getWeightPerUnit(), weight2 = sheet2.getWeightPerUnit(), weight3 = sheet3.getWeightPerUnit();
    int    distribution1 = 100, distribution2 = 100, distribution3 = 100;
    double frequency1    = 10.0, frequency2 = 10.0, frequency3 = 10.0;
    double totalYearlyWaste = annualReport.getTotalWasteLbs();
    int    employeeCount    = annualReport.getEmployeeCount();
    int    totalAmount     = calculateTotalAmount(amount1, amount2, amount3);
    double totalWeight     = calculateTotalWeight(weight1, weight2, weight3);
    double avgDistribution = calculateAverageDistribution(distribution1, distribution2, distribution3);
    double avgFrequency    = calculateAverageFrequency(frequency1, frequency2, frequency3);
    double totalWaste1     = calculateTotalWaste1(amount1, weight1, distribution1, frequency1);
    double totalWaste2     = calculateTotalWaste2(amount2, weight2, distribution2, frequency2);
    double totalWaste3     = calculateTotalWaste3(amount3, weight3, distribution3, frequency3);
        
    double dailyAvg        = calculateAverageWasteDaily(totalYearlyWaste);
    double avgPerEmployee  = calculateAverageWastePerEmployee(totalYearlyWaste, employeeCount);

    /***** OUTPUT SECTION *****/
     System.out.println("\nPaper Waste Summary:");
    

    System.out.printf("%-25s %10s %15s %15s %15s %15s%n",
                          "Sheet Type", "Amount", "Weight", "Distribution", "Frequency", "Total");

    System.out.printf("%-25s %10d %15.1f %15d %15.1f %15.1f%n",
                          sheet1.getSheetName(), amount1, weight1, distribution1, frequency1, totalWaste1);

    System.out.printf("%-25s %10d %15.1f %15d %15.1f %15.1f%n",
                          sheet2.getSheetName(), amount2, weight2, distribution2, frequency2, totalWaste2);

    System.out.printf("%-25s %10d %15.2f %15d %15.1f %15.1f%n",
                          sheet3.getSheetName(), amount3, weight3, distribution3, frequency3, totalWaste3);

    System.out.println("\n--- Waste Averages ---");
    System.out.printf("Daily Average: %.2f lb%n", dailyAvg);
    System.out.printf("Average Waste Per Employee: %.2f lb%n", avgPerEmployee);

    System.out.println("\n--- Total Waste Summary ---");
    System.out.printf("Total Amount: %d%n", totalAmount);
    System.out.printf("Total Weight: %.1f lb%n", totalWeight);
    System.out.printf("Average Distribution: %.1f%n", avgDistribution);
    System.out.printf("Average Frequency: %.1f%n", avgFrequency);

    input.close();
    }


    
  
  

    /***** STATIC METHODS *****/

    /**
     * DESCRIPTION: Evaluates whether a sheet type's total weight is eco-friendly.
     * PRECONDITION: sheetWeightType >= 0
     * POSTCONDITION: Returns a sustainability message string
     * @param sheetWeightType total weight in lbs
     * @return sustainability label
     */
    public static String checkSustainability(double sheetWeightType) {
        if (sheetWeightType >= 0 && sheetWeightType < 1000) {
            return "Eco-friendly weight!";
        } else {
            return "High-risk carbon-emitting weight!";
        }
      }
    /**
     * DESCRIPTION: Calculates total amount of all sheet types combined.
     * PRECONDITION: all values are >= 0
     * POSTCONDITION: Returns total number of sheets
     *
     * @param a1 amount of magazines and catalogs
     * @param a2 amount of newspapers
     * @param a3 amount of miscellaneous sheets
     * @return total sheet count
     * @author Jaya Eckert
     */
    public static int calculateTotalAmount(int a1, int a2, int a3) {
        return (a1 + a2 + a3);
    }

    /**
     * DESCRIPTION: Calculates total combined weight across all sheet types.
     * PRECONDITION: all values are >= 0
     * POSTCONDITION: Returns combined weight
     *
     * @param w1 weight of one magazine/catalog
     * @param w2 weight of one newspaper
     * @param w3 weight of one miscellaneous sheet
     * @return total weight
     * @author Jaya Eckert
     */
    public static double calculateTotalWeight(double w1, double w2, double w3) {
        return (w1 + w2 + w3);
    }

    /**
     * DESCRIPTION: Calculates average distribution across all three categories.
     * PRECONDITION: all values >= 0
     * POSTCONDITION: Returns average distribution
     * 
     * @param d1 distribution 1  @param d2 distribution 2  @param d3 distribution 3
     * @return average distribution
     * @author Diana
     */
    public static double calculateAverageDistribution(int d1, int d2, int d3) {
        return (d1 + d2 + d3) / 3.0;
    }

    /**
     * DESCRIPTION: Calculates average frequency across all three categories.
     * PRECONDITION: all values >= 0
     * POSTCONDITION: Returns average frequency
     * 
     * @param f1 frequency 1  @param f2 frequency 2  @param f3 frequency 3
     * @return average frequency
     * @author Diana
     */
    public static double calculateAverageFrequency(double f1, double f2, double f3) {
        return (f1 + f2 + f3) / 3.0;
    
    }

    /**
     * DESCRIPTION: Calculates total waste for Magazines and Catalogs.
     * PRECONDITION: all values are >= 0
     * POSTCONDITION: Returns total waste for category 1
     *
     * @param a1 number of magazines
     * @param w1 weight per magazine
     * @param d1 distribution count
     * @param f1 distribution frequency
     * @return product of a1 * w1 * d1 * f1
     * @author Ava Gamble
     */
    public static double calculateTotalWaste1(int a1, double w1, int d1, double f1) {
        return (a1 * w1 * d1 * f1);
    }

    /**
     * DESCRIPTION: Calculates total waste for Newspapers.
     * PRECONDITION: all values are >= 0
     * POSTCONDITION: Returns total waste for category 2
     *
     * @param a2 number of newspapers
     * @param w2 weight per newspaper
     * @param d2 distribution count
     * @param f2 distribution frequency
     * @return product of a2 * w2 * d2 * f2
     * @author Ava Gamble
     */
    public static double calculateTotalWaste2(int a2, double w2, int d2, double f2) {
        return (a2 * w2 * d2 * f2);
    }

    /**
     * DESCRIPTION: Calculates total waste for Miscellaneous paper.
     * PRECONDITION: all values are >= 0
     * POSTCONDITION: Returns total waste for category 3
     *
     * @param a3 number of misc sheets
     * @param w3 weight per misc sheet
     * @param d3 distribution count
     * @param f3 distribution frequency
     * @return product of a3 * w3 * d3 * f3
     * @author Ava Gamble
     */
    public static double calculateTotalWaste3(int a3, double w3, int d3, double f3) {
        return (a3 * w3 * d3 * f3);
    }

    /**
     * DESCRIPTION: Calculates the average daily waste from a yearly total.
     * PRECONDITION: total >= 0
     * POSTCONDITION: Returns yearly total divided by days in a year
     *
     * @param total total yearly waste
     * @return daily average waste
     * @author Ava Gamble
     */
    public static double calculateAverageWasteDaily(double total) {
        return total / days_In_Year;
    }

    /**
     * DESCRIPTION: Calculates per-employee waste share.
     * PRECONDITION: totalWaste >= 0 and empCount > 0
     * POSTCONDITION: Returns total waste divided by number of employees
     *
     * @param totalWaste total yearly waste
     * @param empCount   number of employees (must be > 0)
     * @return per-employee waste amount
     * @author Ava Gamble
     */
    public static double calculateAverageWastePerEmployee(double totalWaste, int empCount) {
        if (empCount == 0) return 0;
        return totalWaste / empCount;
    }
}


