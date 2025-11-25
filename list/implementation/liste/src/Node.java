public class Node {
    private Vokabel vokabel;
    private Node nachfolger;
    private Node vorgaenger;

    public Node(Vokabel pvokabel) {
        this.vokabel = pvokabel;
        nachfolger = null;
        vorgaenger = null;
    }

    public Node getNachfolger() {
        return nachfolger;
    }

    public Node getVorgaenger() {
        return vorgaenger;
    }

    public void setNachfolger(Node pnode) {
        this.nachfolger = pnode;
    }

    public void setVorgaenger(Node pvorgaenger) {
        this.vorgaenger = pvorgaenger;
    }

    public Vokabel getVokabel() {
        return vokabel;
    }
}
