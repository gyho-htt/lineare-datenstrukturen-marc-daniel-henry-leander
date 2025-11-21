public class Stack<ContentType> {

    private class Node {
        private Node nachfolger;
        private ContentType contentType;

        public Node (Node pnachfolger, ContentType pcontentType) {
            this.nachfolger = null;
            this.contentType = pcontentType;
        }

        public Node getNachfolger() {
            return nachfolger;
        }

        public void setNachfolger(Node pNode) {
            this.nachfolger = pNode;
        }

        public ContentType getContentType() {
            return contentType;
        }
    }

    private Node head;

    public Stack(Node pHead) {
        this.head = null;
    }

    public boolean istleer() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public ContentType getoberstes() {
        return head.getContentType();
    }

    public void hinzufuegen(ContentType pcontentType) {
        Node pNode = new Node(null, pcontentType);
        if (istleer()) {
            pNode = head;
        } else {
            pNode.setNachfolger(head);
            pNode = head;
        }
    }

    public void entfernen() {
        head = head.getNachfolger();
    }
}
