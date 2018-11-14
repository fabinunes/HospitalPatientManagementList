package hospitalpatientmanagementlist;

/**
 *The Patient class covers the attributes and methods
 *needed to create a new patient such as delete a patient in the new hospital 
 *list system.
 *The attributes for this class are disposed according to the requirements
 *such as PIDNumber, ppsNumber, first and last name, mobile number and email.
 *Each attributes has its own  getters and setters methods.
 *@author Fabi and Kleyton
 **/

public class Patient {
    final int pIDNumber; //pid Identification Number once set cant be changed.
    int pidNumberStarter = 1000; //instantiate the pidNumberStarter variable.
    int ppsNumber; 
    String firstName;
    String lastName;
    String mobileNumber;
    String email;
    String city;
    
/**
 *The constructor public Patient instantiate the *pIDNumber variable, 
 * as the systems needs to allow changes(insertions / updates / deletion)
 * made by the user(Nurse) using the patient's pIDNumber. 
 **/
    public Patient(){
        pIDNumber = ++pidNumberStarter;
    }
/**
 *This method returns the patient Id Number.
 * @return 
 */   
    public int getPidNumber(){
        return pIDNumber;
    }
    
/**
 * This method returns the PPS Number of the patient.
 * @return 
 */
    public int getPpsNumber() {
        return ppsNumber;
    }

/**
 * This method sets and returns the PPS Number of the patient.
 * @param ppsNumber 
 */
    public void setPpsNumber(int ppsNumber) {
        this.ppsNumber = ppsNumber;
    }
/**
 *This method returns a Patient First name.
 * @return 
 */
    public String getFirstName() {
        return firstName;
    }
/**
 *This method sets and returns a Patient First Name.
 * @param firstName 
 */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
/**
 * This method returns a Patient Last Name.
 * @return 
 */
    public String getLastName() {
        return lastName;
    }
/**
 *This method sets and returns a Patient Last Name.
 * @param lastName 
 */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
/**
 * This method returns a Patient Mobile Number.
 * @return 
 */
    public String getMobileNumber() {
        return mobileNumber;
    }
/**
 * This method sets and returns a Patient Mobile Number.
 * @param mobileNumber 
 */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
/**
 * This method returns a Patient Email.
 * @return 
 */
    public String getEmail() {
        return email;
    }
/**
 * This method sets and returns a Patient Email.
 * @param email 
 */
    public void setEmail(String email) {
        this.email = email;
    }
/**
 * This method returns a  city information field of the Patient.
 * @return 
 */
    public String getCity() {
        return city;
    }
/**
 * This method sets and returns the city information field of a Patient.
 * @param city 
 */
    public void setCity(String city) {
        this.city = city;
    }
    
}
