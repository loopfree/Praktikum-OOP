class Main {   
    public static void main(String[] args) {
        Crewmate a = new Crewmate();
        Crewmate b = new Crewmate();
        Crewmate c = new Crewmate("Charlie");
        c.stab(a);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        a.stab(b);
    }
}