public class Queue<ContentType>{
    
    class Node{
        private Node nf;
        private ContentType inhalt;
        
        public Node(ContentType pInhalt){
            this.inhalt = pInhalt;
            //this.nf = null;  (Attribute werden automatisch beim Erzeugen auf null gesetzt, kann man weglassen)
        }
        
        public ContentType getInhalt(){
            return this.inhalt;
        }
        
        public Node getNF(){
            return this.nf;
        }
        
        public void setNF(Node pNF){
            this.nf = pNF;
        }

    }
    
    
    Node erstes;
    Node letztes;
    
    // Note: kann man eigentlich komplett weglassen (Standard Konstruktor)
    public Queue(){
        this.erstes = null;
        this.letztes = null;
    }

    
    public void enqueue(ContentType pContent){
        Node pNode = new Node(pContent);
        if (isEmpty()) {
            this.erstes = pNode;
        } else {
            this.letztes.setNF(pNode);
        } // end of if-else
        this.letztes = pNode;
    }
    
    public void dequeue(){
        if (!isEmpty()) {
            this.erstes = this.erstes.getNF();
            if (this.erstes == null) {
                this.letztes = null;
            } // end of if
            
        } // end of if
    }

    public boolean isEmpty(){
        if (this.erstes == null) {
            return true;
        } // end of if
        return false;
    }

    public Node getFirst(){
        return this.erstes;
    }


}
