class Test{
    public static void main(String[] args) {
        Bestellbest b1 = new Bestellbest("Elfer Raus", "Kartenspiel", "1");
        Bestellbest b2 = new Bestellbest("Herr der Ringe Trilogie", "DVD", "2");
        Bestellbest b3 = new Bestellbest("a","b","c");

        Queue<Bestellbest> meineschlange = new Queue<Bestellbest>();
        meineschlange.enqueue(b1);
        meineschlange.enqueue(b2);
        meineschlange.enqueue(b3);
        System.out.println(meineschlange.isEmpty());
        System.out.println(meineschlange.getFirst().getInhalt().artikel);
        meineschlange.dequeue();
        meineschlange.dequeue();
        System.out.println(meineschlange.getFirst().getInhalt().artikel);
        meineschlange.dequeue();
        System.out.println(meineschlange.isEmpty());
        System.out.println("===Autos===");
        
        Queue<Auto> autoschlange = new Queue<Auto>();
        autoschlange.enqueue(new Auto("VW", "T7"));
        System.out.println(autoschlange.getFirst().getInhalt().marke);
        autoschlange.enqueue(b2);
        
        
        
    }
}
