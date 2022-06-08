class Main {
  public static void main(String[] args) {
      System.out.println("--- Section 1 ---");
      Pokemon ghost1 = new GhostPokemon();
      Pokemon fighting1 = new FightingPokemon();
      Pokemon normal1 = new NormalPokemon();
      Pokemon pokemon1 = new Pokemon();

      System.out.println(ghost1.getName());
      System.out.println(fighting1.getName());
      System.out.println(normal1.getName());
      System.out.println(pokemon1.getName());

      GhostPokemon gastly = new GhostPokemon("Gastly");
      FightingPokemon machop = new FightingPokemon("Machop");
      NormalPokemon rattata = new NormalPokemon("Rattata");
      Pokemon bigBoss = new Pokemon("Big Boss");

      System.out.println(gastly.getName());
      System.out.println(machop.getName());
      System.out.println(rattata.getName());
      System.out.println(bigBoss.getName());

      gastly.displayClass();
      machop.displayClass();
      rattata.displayClass();
      bigBoss.displayClass();

      System.out.println("G1");
      System.out.println("12");

      System.out.println("--- Section 2 ---");

      gastly.checkElement();
      machop.checkElement();
      rattata.checkElement();

      gastly.specialSkill();

      machop.displayAura();
      gastly.displayAura();

      machop.specialSkill();

      System.out.println("--- Section 3 ---");
      
      gastly.displayClass();
      rattata.displayClass();

      PokemonAction gastlyAction = new PokemonAction(gastly);
      PokemonAction rattataAction = new PokemonAction(rattata);

      System.out.println(gastly.getName() + " vs " + rattata.getName());

      gastlyAction.attack();
      rattataAction.defense();

      gastlyAction.attack();
      rattataAction.defense();

      gastlyAction.attack();
      rattataAction.defense();

      gastlyAction.attack();
      rattataAction.defense();

      gastlyAction.attack();
      rattataAction.defense();

      gastlyAction.attack();
      rattataAction.defense();

      gastlyAction.attack();
      rattataAction.defense();

      rattataAction.attack();
      gastlyAction.defense();

      rattataAction.attack();
      gastlyAction.defense();

      rattataAction.attack();
      gastlyAction.defense();

      rattataAction.useSkill();
      gastlyAction.useSkill();

      rattataAction.run();

      System.out.println("--- Section 4 ---");
      
      System.out.println("New Battle Found");

      machop.displayClass();
      bigBoss.displayClass();

      System.out.println(bigBoss.getName() + " vs " + machop.getName());

      PokemonAction macAct = new PokemonAction(machop);
      PokemonAction bossAct = new PokemonAction(bigBoss);

      macAct.attack();
      bossAct.defense();

      macAct.attack();
      bossAct.defense();

      macAct.attack();
      bossAct.defense();

      macAct.attack();
      bossAct.defense();

      bossAct.attack();
      macAct.defense();

      bossAct.attack();
      macAct.defense();

      bossAct.attack();
      macAct.defense();

      bossAct.attack();
      macAct.defense();

      bossAct.attack();
      macAct.defense();

      bossAct.attack();
      macAct.defense();

      bossAct.attack();
      macAct.defense();

      //Big Boss attack!
      //Machop defense!
      //Machop use skill!
      //Big Boss use skill!
      //Machop run from battle!
      //All Battle Finished

      bossAct.attack();
      macAct.defense();

      macAct.useSkill();
      bossAct.useSkill();

      macAct.run();

      System.out.println("All Battle Finished");
  }
}