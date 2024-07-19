package datos;

public class pikachu extends Pokemon{

    //Asignando poder random
    int poderAleatorio = (int)(Math.random()*+15+5);
    
    public pikachu(){

    }

    public pikachu(int vidarandom){
        this.vida = vidarandom;    
    }

    public void pokemon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void nombre() {
        nombre= "Pikachu";
    }

    public Pokemon select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void vida() {
        int vidarandom = (int)(Math.random()+50+50);
        vida=vidarandom;
    }

    public void estado() {
         estado=true;
    }

    public void imprimirmenuataque() {
        System.out.println("SELECCIONAR ATAQUE");
        System.out.println("1- ELECTROCUTAR");
        System.out.println("______________________________________");
    }

    public Pokemon atacar(int select_ataque, Pokemon pokemon_atacar) {
        switch (select_ataque){
            
            case 1:
                pokemon_atacar.vida -= poderAleatorio;
                break;             
            default:
                break;
        }if(pokemon_atacar.getVida() < 0 )
            pokemon_atacar.setEstado(false);
        return pokemon_atacar;//pokemon_atacar = pokemon que se va a atacar 
    }

    public void dibujarpokemon() {
        System.out.println( "Datos:                                                     \n" +
                            "Nombre:  Pikachu                                         \n");
        System.out.println("             &&&&@/                                                             ");
        System.out.println("              &&&&&,.,%                                                         ");
        System.out.println("                @&@......,.                                                .&@@@");
        System.out.println("                 .@.........,                                        %...,@&&@@ ");
        System.out.println("                    ,.........,#                                /,.......,&&@   ");
        System.out.println("                      %,.........%                           *...........#&     ");
        System.out.println("  #/                     #,.......(...............,.%     ,............,        ");
        System.out.println(",.......%                   #*........................../..........,&           ");
        System.out.println("............,%                ................................,(,               ");
        System.out.println("..................%          *.....,........................                    ");
        System.out.println("......................(     ,....@&#  &...............,.....%                   ");
        System.out.println("..........................* (....&&&&@%............%%  &@...#                   ");
        System.out.println("................../,,%,....%.,#*............,......(@&&&&...#                   ");
        System.out.println(".,,,,************%......%**#((((((,....,&@&%&&...,..........#                   ");
        System.out.println("&****************#.........&((((((,....,######&&&......%(((#/                   ");
        System.out.println("         ,&/,*****(..........**.........(////(#%,....,#((((((                   ");
        System.out.println("                   %...........*........./////*........((((%                    ");
        System.out.println("                   */............%........,/............,                       ");
        System.out.println("                 *****,...........,..................%.                         ");
        System.out.println("               %*******................,*****,..........                        ");
        System.out.println("             .*********#  *.....................*.......(                       ");
        System.out.println("                ,%**********(*.................#......../                       ");
        System.out.println("                      /**#....................,,........*                       ");
        System.out.println("                    %###/,....................#.........%                       ");
        System.out.println("                  %#####.......,..............,.........                        ");
        System.out.println("                     &#(...,,***%..,.........,,............ /#(                 ");
        System.out.println("                       ,.....#,**(...,........%......,,...#,(##                 ");
        System.out.println("                      .,......****%.....................,,***#                  ");
        System.out.println("                       *....**%********************,....****%                   ");
        System.out.println("                        (******/***%***********************,                    ");
        System.out.println("                            #(*,/**%/%*     *%#/,*****/**%                      ");

    }
 
    
}