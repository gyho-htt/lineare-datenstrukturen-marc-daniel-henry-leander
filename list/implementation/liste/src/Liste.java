public class Liste {
    private Node head;
    private Node last;
    private Node current;

    public Liste (Node phead, Node plast, Node pcurrent) {
        this.head = null;
        this.last = null;
        this.current = null;
    }

    public void setnext() {
        current = current.getNachfolger();
    }

    public void tofirst() {
        current = head;
    }

    public boolean aktuellesElementexistiert(){
        if (current != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean istleer() {
        if (head == null && last == null && current == null) {
            return true;
        } else {
            return false;
        }
    }

    public void dranhaengen(Vokabel pvokabel) {
        Node node = new Node(pvokabel);
        if (istleer()) {
            head = node;
            last = node;
        } else {
            last.setNachfolger(node);
            last = node;
        }
    }

    public void insert(Vokabel pvokabel) {
        Node node = new Node(pvokabel);
        if (istleer()) {
            head = node;
            last = node;
        } else if (aktuellesElementexistiert()) {

        }
    }
}
