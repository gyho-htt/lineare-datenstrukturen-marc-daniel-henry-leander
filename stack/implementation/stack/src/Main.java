//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    public static void main(String[] args) {
        Videospiele Spiel1 = new Videospiele("Spiel 1");
        Videospiele Spiel2 = new Videospiele("Spiel 2");
        Videospiele Spiel3 = new Videospiele("Spiel 3");
        Auto Auto1 = new Auto("BMW");
        Auto Auto2 = new Auto("Mercedes");
        Auto Auto3 = new Auto("Audi");
        Stack<Videospiele> Videospiele = new Stack<Videospiele>(null);
        Stack<Auto> Autos = new Stack<Auto>(null);

        Videospiele.hinzufuegen(Spiel1);
        Videospiele.hinzufuegen(Spiel3);
        System.out.println(Videospiele.getoberstes().getName());
    }
