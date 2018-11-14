package hospitalpatientmanagementlist;

public class Node<P> {
    
    public P patient;
    public Node<P> next = null;
    
    public Node(P patient, Node<P> next) {
        this.patient = patient;
        this.next = next;
    }
    
    public Node(P patient) {
        this(patient, null);
    }
}