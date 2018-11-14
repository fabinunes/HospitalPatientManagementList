
package hospitalpatientmanagementlist;

public class ControllImplementation<P> implements ControllInterface<P> {

    public Node<P> head = null;
    
    private int size = 0;

    @Override
    public void getIn(P patient) {
        if(head == null)
            getInFirst(patient);
        else {
            Node<P> temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = new Node<P>(patient, null);
        }
    }

    @Override
    public void getInFirst(P patient) {
        head = new Node<P>(patient, head);
        size++;
    }

    @Override
    public void getInAt(int position, P patient) {
        
    }

    @Override
    public P getOut(int pidNumber) {
        
    }

    @Override
    public int seePosition(int pidNumber) {
    }

    @Override
    public boolean clearRemainder(int quantity) {
    }

    @Override
    public boolean updatePatientInfo(int pidNumber) {
    }

    @Override
    public int length() {
    }
    
}