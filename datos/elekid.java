package datos;

public class elekid extends Pokemon{
    
    //Asignando poder random
    int poderAleatorio = (int)(Math.random()*+15+5);

    public elekid(){

    }

    public elekid (int vidarandom){
        this.vida = vidarandom;
    }

    public void pokemon() {
        pokemon ="Elekid";
    }

    public void nombre() {
        nombre="Elekid";
    }

    public Pokemon select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void vida() {
        int vidarandom = (int)(Math.random()*+50+50);
        vida=vidarandom;
    }

    public void estado() {
        estado = true;
    }

    public void imprimirmenuataque() {
        System.out.println("SELECCIONAR ATAQUE");
        System.out.println("1- ELCTROCUTAR");
        System.out.println("______________________________________");    }

    public Pokemon atacar(int select_ataque, Pokemon pokemon_atacar) {
        int aleatorio = (int)(Math.random()*+15+5);
        switch (select_ataque){
            case 1:
                pokemon_atacar.vida -= aleatorio;
                break;            
            default:
                break;
        }if(pokemon_atacar.getVida() < 0 )
            pokemon_atacar.setEstado(false);
        return pokemon_atacar;//pokemon_atacar = pokemon que se va a atacar 
    }

    public void dibujarpokemon() {

        System.out.println( "  Datos:                                                   \n" +
                            "  Nombre:  Elekid                                          \n");
        System.out.println("                                                            \n" +
                        "                           .*,....**     ..,,.                 \n" +
                        "         .*/*,.            ,,.,//,** .,*,,..,*                 \n" +
                        "       **,****/,           *.,(/*/*, ,*...,,**                 \n" +
                        "     ,*,***..*..,         ,,.,(///*..*,.*//(*.                 \n" +
                        "    .*,......,*/*        ,*...,***. ,,..((/(.                  \n" +
                        "    ,,.........,*        **......*  *...///*                   \n" +
                        "    (&&%%((/((#%*       .*,.....,* ,,.....,,                   \n" +
                        "    #%%&&&&&&%%&,      .*,.......,*/......*.                   \n" +
                        "    /#%&%&&%%&&%.    .**/..**,..../*.....,*                    \n" +
                        "    *..*/(#((///   ,*,.,*,*,.....,*,.,,,.,*                    \n" +
                        "    ,&%##///(##* ,*,,,...........*,.*,,,..,,                   \n" +
                        "     #&&%%&&&&(.,,.,*,*,............,......*                   \n" +
                        "      .*,,,,,,,,,....,*,,..,**,,,,,,.......,.                  \n" +
                        "        ,//,,,//......*.,..,**,,*,.........,*.                 \n" +
                        "          .//,/*......,*,,*,*,..............*.                 \n" +
                        "             //,.....,*,....................*.                 \n" +
                        "             .#(..../#&&%#(*...............,,                  \n" +
                        "              %&(,.*%&&&%&%*..............,*.                  \n" +
                        "              */(**%%&&&%*,............,//,,**.                \n" +
                        "              ,((**#&&&&%(*,.,/**,,,,,,*/#%,..,**.             \n" +
                        "               .%%/,,*%&%%#,.,%&&&&&&&&&&&**.....*.            \n" +
                        "                ./////*...,*/**,***/((*. *.....,/*             \n" +
                        "                  ,(/(///***/#&&&&&&&&%,   /((#%%&&%,          \n" +
                        "                 .*&%%(///////////(((,     ,&&&&%%(//          \n" +
                        "              */%&&%&&*  .,,*,/&&,       ./***/#%%,            \n" +
                        "           .,*..,*/*,,,,      /&%&%,.    .%&%%%&&%&            \n" +
                        "          .*,.........,,    .*,/#%%%*,,*.  .%&&&&&%%(**.       \n" +
                        "          .*,......,**,     .*,.........** ,,.,,,.....*.       \n" +
                        "            ..,,,..           *,,.......,* ,/*...,,.,*,        \n" +
                        "                               .,*,.....*,  .****///*          \n" +
                        "                                  .,***,      **,...           \n");

    }

}