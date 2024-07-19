import datos.*;

public class Menu {

   pikachu pika = new pikachu();
   charizard chari = new charizard();
   elekid eli = new elekid();
   magikarp magi = new magikarp();
   mightyena mig = new mightyena();
   spearow spe = new spearow();

   public static void mostrarMenuPrincipal(){
      System.out.println( "________________________ \n" +
                         "|   Bienvenido al juego  |\n" +
                         "|   Elija una opcion:    |\n" +
                         "|   1. VER POKEMONES     |\n" +
                         "|   2. BATALLA 1 VS 1    |\n" +
                         "|   3. ESTADISTICAS      |\n" +
                         "|   4. SALIR             |\n" +
                         "|________________________|\n" +
                         "   ELIGE TU OPCION        \n");
   };

   public static void mostrarListadoPokemones(){
       System.out.println( "_______________________ \n" +
                         "|  Pokemones Disponibles |\n" +
                         "|   1. Pikachu           |\n" +
                         "|   2. Charizard         |\n" +
                         "|   3. Mighyena          |\n" +
                         "|   4. Elekid            |\n" +
                         "|   5. Spearow           |\n" +
                         "|   6. Magikarp          |\n" +
                         "|________________________|\n" +
                         "   ELIGE TU OPCION        \n");
   }

    public void mostrarImagenesPokemones() {

      System.out.println("___________________________\n"+ 
                         "|   Lista Pokemones       |\n"+ 
                         "|_________________________|\n");

      pika.dibujarpokemon();
      chari.dibujarpokemon();
      eli.dibujarpokemon();
      magi.dibujarpokemon();
      mig.dibujarpokemon();
      spe.dibujarpokemon();

   }



}