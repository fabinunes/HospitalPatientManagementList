package hospitalpatientmanagementlist;

/**
 *This interface covers abstract methods that will be implemented in
 * a different class.
 * @author Fabi
 */
public interface ControllInterface<P> {
    public void getIn(P patient); //can add a new patient o the end of the list.(2)
    public void getInFirst(P patient);//Patient can be added to the top of the list.(5)
    public void getInAt(int position, P patient); //insert a patient in a specific position.(3)
    //public boolean getIn(P patient);
    //public P getOut(P patient);
    public P getOut(int pIDNumber);//a patient can be deleted from the list...(4)
    //public boolean getOut(P patient);
    public boolean clearRemainder(int quantity);//delete N num of records from the end of the list.(7)
    public boolean updatePatientInfo(int pIDNumber);//Update a single patient.(8)
    public int length();//will be used to check a specif position on the list.
    public int seePosition(int pIDNumber); //Check to see which number exactly a patient is on the list.(1)
}
