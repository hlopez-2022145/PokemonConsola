import datos.*;
import java.util.Scanner;

public class PokemonJuego {

    public static void main(String[] args) {  
        //Variables generales
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        //Contadores para ver pokemones mas y menos usados
        int pikachucontador = 0;
        int charizardcontador = 0;
        int mightyenacontador = 0;
        int elekidcontador = 0;
        int spearowcontador = 0;
        int magikarpcontador = 0;
        
        //Contador partidas jugadas
        int partidasrealizadas =0;
        
        //Estadisticas de jugadores.
        int jugador1gana = 0;
        int jugador2gana = 0;
        
        do{

            Menu menu = new Menu();
            //Mostramos el menu
            menu.mostrarMenuPrincipal();
            
            //Pedimios al usuario que escoga una opción
            opcion=entrada.nextInt();
            
            switch(opcion){ 
                case 1:
                    menu.mostrarImagenesPokemones();
                break;    
                case 2:
                    System.out.println("Ha elegido Iniciar un nuevo juego\n");
                    partidasrealizadas++;
                    int personaje1j1, personaje2j1, personaje1j2, personaje2j2;
                    String player1, player2;
                    //Nuevo scanner para que no se tenga que limpiar
                    Scanner s = new Scanner(System.in);

                    do{
                        System.out.println("NOMBRE DE JUGADOR 1: \n"); //SELECCION  DE JUGADOR 1
                        player1=s.next();
                        System.out.println("Jugador 1: " + player1 + ", seleccione tu primer pokemon: \n");//seleccion personaje 1 jugador 1
                        menu.mostrarListadoPokemones();
                        personaje1j1=s.nextInt();
                    }while(personaje1j1 >6 || personaje1j1 < 1);
                    
                    //Variable tipo clase pokemon para guardar las elecciones del jugador 1
                    Pokemon pokemon1_select_j1 = null; //variable no tiene nada inicialmente

                    int vidaAleatoria1 = (int)(Math.random()*50+50);

                    switch(personaje1j1){
                        case 1:
                            System.out.println("Has seleccionado a Pikachu \n");
                            pokemon1_select_j1 = new pikachu(vidaAleatoria1);
                            pikachucontador++;//contador
                            break;
                        case 2:
                            System.out.println("Has seleccionado a Charizard \n");
                            pokemon1_select_j1 = new charizard(vidaAleatoria1);
                            charizardcontador++;
                            break;
                        case 3:
                            System.out.println("Has seleccionado a Mightyena \n");
                            pokemon1_select_j1 = new mightyena(vidaAleatoria1);
                            mightyenacontador++;
                            break;
                        case 4:
                            System.out.println("Has seleccionado a Elekid \n");
                            pokemon1_select_j1 = new elekid(vidaAleatoria1);
                            elekidcontador++;
                            break;    
                        case 5:
                            System.out.println("Has seleccionado a Spearow \n"); 
                            pokemon1_select_j1 = new spearow(vidaAleatoria1);
                            spearowcontador++;
                            break;
                        case 6:
                            System.out.println("Has seleccionado a Magikarp \n");
                            pokemon1_select_j1 = new magikarp(vidaAleatoria1);
                            magikarpcontador++;
                            break;
                    }

                    //Nuevo scanner para que no se tenga que limpiar
                    Scanner j = new Scanner(System.in);

                    do{
                        System.out.println("Jugador 1: " + player1 + ", selecciona tu segundo pokemon:");//seleccion personaje 2 jugador 1
                        menu.mostrarListadoPokemones(); 
                        personaje2j1 = j.nextInt();
                    }while(personaje2j1 > 6 || personaje2j1 < 1);
                    
                    Pokemon pokemon2_select_j1 = null; //variable no tiene nada inicialmente
                    int vidaAleatoria2 = (int)(Math.random()*50+50);

                    switch(personaje2j1){
                        case 1:
                            System.out.println("Has seleccionado a Pikachu");
                            pokemon2_select_j1 = new pikachu(vidaAleatoria2);
                            pikachucontador++;
                            break;
                        case 2:
                            System.out.println("Has seleccionado a Charizard");
                            pokemon2_select_j1 = new charizard(vidaAleatoria2);
                            charizardcontador++;
                            break;
                        case 3:
                            System.out.println("Has seleccionado a Mightyena");
                            pokemon2_select_j1 = new mightyena(vidaAleatoria2);
                            mightyenacontador++;
                            break;
                        case 4:
                            System.out.println("Has seleccionado a Elekid");
                            pokemon2_select_j1 = new elekid(vidaAleatoria2);
                            elekidcontador++;
                            break;    
                        case 5:
                            System.out.println("Has seleccionado a Spearow"); 
                            pokemon2_select_j1 = new spearow(vidaAleatoria2);
                            spearowcontador++;
                            break;
                        case 6:
                            System.out.println("Has seleccionado a Magikarp");
                            pokemon2_select_j1 = new magikarp(vidaAleatoria2);
                            magikarpcontador++;
                            break;
                        default:
                            System.out.println("Acción no valida");
                            break;
                    }

                    //JUGADOR 2

                    //Nuevo scanner para que no se tenga que limpiar
                    Scanner t = new Scanner(System.in);

                    do{
                        System.out.println("NOMBRE DE JUGADOR 2: \n"); //SELECCION  DE JUGADOR 2
                        player2=t.next();
                        System.out.println("Jugador 2: " + player2 + ", selecciona tu primer pokemon: \n");
                        menu.mostrarListadoPokemones();                         
                        personaje1j2=t.nextInt();//jugador 2 escoge personaje
                    }while(personaje1j2 > 6 || personaje1j2 < 1);
                    
                    Pokemon pokemon1_select_j2 = null;// pokemonj2
                    int vidaAleatoria3 = (int)(Math.random()*50+50);

                    switch(personaje1j2){
                        case 1:
                            System.out.println("Has seleccionado a Pikachu");
                            pokemon1_select_j2 = new pikachu(vidaAleatoria3);
                            pikachucontador++;
                            break;
                        case 2:
                            System.out.println("Has seleccionado a Charizard");
                            pokemon1_select_j2 = new charizard(vidaAleatoria3);
                            charizardcontador++;
                            break;
                        case 3:
                            System.out.println("Has seleccionado a Mightyena");
                            pokemon1_select_j2 = new mightyena(vidaAleatoria3);
                            mightyenacontador++;
                            break;
                        case 4:
                            System.out.println("Has seleccionado a Elekid");
                            pokemon1_select_j2 = new elekid(vidaAleatoria3);
                            elekidcontador++;
                            break;    
                        case 5:
                            System.out.println("Has seleccionado a Spearow"); 
                            pokemon1_select_j2 = new spearow(vidaAleatoria3);
                            spearowcontador++;
                            break;
                        case 6:
                            System.out.println("Has seleccionado a Magikarp");
                            pokemon1_select_j2 = new magikarp(vidaAleatoria3);
                            magikarpcontador++;
                            break;
                        default:
                            System.out.println("Acción no valida");
                            break;
                    }

                    //Nuevo scanner para que no se tenga que limpiar   
                    Scanner h = new Scanner(System.in);

                    do{
                        System.out.println("Jugador 2: " + player2 + ", selecciona tu segundo pokemon:");
                        menu.mostrarListadoPokemones();                         
                        personaje2j2 = h.nextInt();
                    } while(personaje2j2 >6 || personaje2j2 < 1);
              
                    Pokemon pokemon2_select_j2=null;
                    int vidaAleatorea4 = (int)(Math.random()*+50+50);
                    
                    switch(personaje2j2){
                        case 1:
                            System.out.println("Has seleccionado a Pikachu");
                            pokemon2_select_j2 = new pikachu(vidaAleatorea4);
                            pikachucontador++;
                            break;
                        case 2:
                            System.out.println("Has seleccionado a Charizard");
                            pokemon2_select_j2 = new charizard(vidaAleatorea4);
                            charizardcontador++;
                            break;
                        case 3:
                            System.out.println("Has seleccionado a Mightyena");
                            pokemon2_select_j2 = new mightyena(vidaAleatorea4);
                            mightyenacontador++;
                            break;
                        case 4:
                            System.out.println("Has seleccionado a Elekid");
                            pokemon2_select_j2 = new elekid(vidaAleatorea4);
                            elekidcontador++;
                            break;    
                        case 5:
                            System.out.println("Has seleccionado a Spearow"); 
                            pokemon2_select_j2 = new spearow(vidaAleatorea4);
                            spearowcontador++;
                            break;
                        case 6:
                            System.out.println("Has seleccionado a Magikarp");
                            pokemon2_select_j2 = new magikarp(vidaAleatorea4);
                            magikarpcontador++;
                            break;
                    }
                    
                    System.out.println(" ______________________________________________\n"+
                                       "|      La batalla esta a punto de iniciar      |\n"+
                                       "|______________________________________________|\n");
                    
                    System.out.println("~~~~~~~~~~  PERSONAJES SELECCIONADOS ~~~~~~~~~~\n");

                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

                        //Obtenemos los datos para podes mostrarlos
                        pokemon1_select_j1.nombre();
                        pokemon2_select_j1.nombre();

                        pokemon1_select_j2.nombre();
                        pokemon2_select_j2.nombre();
                        
                        pokemon1_select_j1.getEstado();
                        pokemon2_select_j1.getEstado();
        
                        pokemon1_select_j2.getEstado();
                        pokemon2_select_j2.getEstado();
              
                    //Guardo la escogencia de pokemones a atacar
                    Pokemon pokemon_selectedj1 = null;
                    Pokemon pokemon_selectedj2 = null;
                            
                            do{//empieza ciclo de ataque
                                        
                            //turno de jugador 1(pokemon1)--- ataca a jugador2 pokemon1
                                                                     
    //                              if(aleatorio==1){
                                    System.out.println("Turno de jugador 1 \n");
                                    System.out.println("Pokemones elegidos:" +pokemon1_select_j1.getNombre()+" y " +pokemon2_select_j1.getNombre());
                                   
                                    //vida inicial del jugador 1
                                    if(pokemon1_select_j1.getVida() > 0 && pokemon2_select_j1.getVida() > 0){
                                        System.out.println("Puntos de vida jugador 1: " +pokemon1_select_j1.getNombre()+"= "+pokemon1_select_j1.getVida()+" ," +pokemon2_select_j1.getNombre()+" :" +pokemon2_select_j1.getVida());//vida inicial del jugador 1
                                        }else if(pokemon1_select_j1.getVida() < 0 && pokemon2_select_j1.getVida() > 0){
                                            System.out.println("Puntos de vida jugador 1: "+pokemon1_select_j1.getNombre()+"=0 (Estado: muerto) " +pokemon2_select_j1.getNombre()+" ="+pokemon2_select_j1.getVida());
                                        }else if(pokemon1_select_j1.getVida() > 0 && pokemon2_select_j1.getVida() < 0){
                                            System.out.println("Puntos de vida jugador 1: "+pokemon1_select_j1.getNombre()+"= "+pokemon2_select_j1.getVida()+" ,"+pokemon2_select_j1.getNombre()+" = 0 Estado: muerto" );
                                        } else if(pokemon1_select_j1.getVida() < 0 && pokemon2_select_j1.getVida() < 0){
                                            System.out.println("Puntos de vida jugador 1 "+pokemon1_select_j1.getNombre()+"= 0 (Estado: muerto)"+pokemon2_select_j1.getNombre()+"= 0 (Estado: muerto)");
                                        }
                                
                                    System.out.println("Selecciona tu pokemon con el que atacarás: ");
                                    Scanner p = new Scanner(System.in);
                                    int seleccion;
                                        do{
                                            if(pokemon1_select_j1.getVida()>0){//ELEGIR POKEMON PARA ATACAR
                                                System.out.println("1- " +pokemon1_select_j1.getNombre());
                                            }
                                            if(pokemon2_select_j1.getVida()>0){
                                                System.out.println("2- " +pokemon2_select_j1.getNombre());
    
                                            }
                                            
                                            seleccion=p.nextInt();
                                        
                                            switch(seleccion){
                                                case 1:
                                                    System.out.println("Pokemon seleccionado: "+pokemon1_select_j1.getNombre());
                                                    pokemon_selectedj1 = pokemon1_select_j1;                     
                                                    break;
                                                case 2:
                                                    System.out.println("Poekmon seleccionado: " +pokemon2_select_j1.getNombre());
                                                    pokemon_selectedj1 = pokemon2_select_j1;                                       
                                                    break;
                                                    
                                            }

                                        }while(seleccion <0 && seleccion > 2 && pokemon_selectedj1.getVida()<0 );
                                        
                                        
                                        //menu para escoger a quien voy a atacar
                                        System.out.println("Selecciona a que pokemon atacaras: \n");
                                        do{
                                            if(pokemon1_select_j2.getVida()>0){//mantiene visible si esta vivo o muerto
                                                System.out.println("1- " +pokemon1_select_j2.getNombre());
                                                
                                            }
                                            if(pokemon2_select_j2.getVida()>0){
                                                System.out.println("2- " +pokemon2_select_j2.getNombre());
                                                
                                            }
                                            
                                            int seleccion1 = p.nextInt();
                                            
                                            switch(seleccion1){
                                                case 1:
                                                    System.out.println("Pokemon seleccionado al que se atacara: "+pokemon1_select_j2.getNombre());
                                                    pokemon_selectedj2 = pokemon1_select_j2;
                                                    pokemon_selectedj2.dibujarpokemon();                 
                                                    break;
                                                case 2:
                                                    System.out.println("Pokemon seleccionado al que se atacara: "+pokemon2_select_j2.getNombre());
                                                    pokemon_selectedj2 = pokemon2_select_j2;
                                                    pokemon_selectedj2.dibujarpokemon();                                      
                                                    break;
                                                    
                                            }
                                        }while(seleccion <0 && seleccion > 2 && pokemon_selectedj2.getVida()<0 );
                                        
                                        //atacar
                                        //Se dibujo al pokemon que atacara
                                        System.out.println("POKEMON ATACANTE ACTUAL");
                                        pokemon_selectedj1.dibujarpokemon();
                                        System.out.println("Selecciona tu ataque: ");
                                        pokemon_selectedj1.imprimirmenuataque();
                                        
                                        int pokemon_ataque1;
                                        Scanner u = new Scanner(System.in);
                                        pokemon_ataque1=u.nextInt();
                                        
                                        pokemon_selectedj1.atacar();
                                        
                                        pokemon_selectedj2 = pokemon_selectedj1.atacar(1, pokemon_selectedj2);
                                        
                                        if(pokemon_selectedj2.getVida()>0){
                                            System.out.println("Puntos de vida de " +pokemon_selectedj2.getNombre()+": "+pokemon_selectedj2.getVida());//jugador 1 ataca a jugador 2
                                        } else if(pokemon_selectedj2.getVida()<0){
                                            System.out.println("Puntos de vida de " +pokemon_selectedj2.getNombre()+" =0 (Estado: muerto)");
                                        }
                                        
                                        if(pokemon1_select_j2.getVida()<=0 && pokemon2_select_j2.getVida() <=0){
                                            System.out.println("¡" +player1+ " ha ganado la batalla!");
                                            
                                            jugador1gana++;
                                            break;//saca del ciclo do while ataque
                                        }
                                        
                                        //ATAQUE JUGADOR 2 A JUGADOR 1 (INVERTIR ORDEN DE TODO)
                                        //--------------------------------------------------------------------    
                                        //EMPIEZA CODIGO PARA ATACAR A JUGADOR 1

                                        System.out.println("__________________________________________________________________");
                                        System.out.println("Turno de jugador 2");
                                        System.out.println("Pokemones elegidos:" +pokemon1_select_j2.getNombre()+" y " +pokemon2_select_j2.getNombre());
                                        
                                        //ESTADOS DE LOS POKEMONES
                                        System.out.println("");
                                        if(pokemon1_select_j2.getVida() > 0 && pokemon2_select_j2.getVida() > 0){
                                        System.out.println("Puntos de vida jugador 2: " +pokemon1_select_j2.getNombre()+"= "+pokemon1_select_j2.getVida()+" ," +pokemon2_select_j2.getNombre()+" :" +pokemon2_select_j2.getVida());//vida inicial del jugador 1
                                        }else if(pokemon1_select_j2.getVida() < 0 && pokemon2_select_j2.getVida() > 0){
                                            System.out.println("Puntos de vida jugador 2: "+pokemon1_select_j2.getNombre()+"=0 (estado muerto) " +pokemon2_select_j2.getNombre()+" ="+pokemon2_select_j2.getVida());
                                        }else if(pokemon1_select_j2.getVida() > 0 && pokemon2_select_j2.getVida() < 0){
                                            System.out.println("Puntos de vida jugador 2: "+pokemon1_select_j2.getNombre()+"= "+pokemon2_select_j2.getVida()+" ,"+pokemon2_select_j2.getNombre()+" = 0 (estado muerto)" );
                                        }else if(pokemon1_select_j2.getVida() < 0 && pokemon2_select_j2.getVida() < 0){
                                            System.out.println("Puntos de vida jugador 2: "+pokemon1_select_j2.getNombre()+"= 0 (Estado: Muerto)"+pokemon2_select_j2.getNombre()+" = 0 (estado muerto)" );
                                        }
                                        
                                        System.out.println("Selecciona el pokemon con el que atacarás: ");
                                        Scanner o = new Scanner(System.in);
                                        
                                        
                                         do{
                                        if(pokemon1_select_j2.getVida()>0){//ELEGIR POKEMON PARA ATACAR, //mantiene visible si esta vivo o muerto
                                            System.out.println("1- " +pokemon1_select_j2.getNombre());
                                            
                                        }
                                        if(pokemon2_select_j2.getVida()>0){
                                            System.out.println("2- " +pokemon2_select_j2.getNombre());
                                             
                                        }
                   
                                            int seleccion3 = o.nextInt();
                                            
                                            switch(seleccion3){
                                                case 1:
                                                    System.out.println("Pokemon seleccionado: "+pokemon1_select_j2.getNombre());
                                                    pokemon_selectedj2 = pokemon1_select_j2;                     
                                                    break;
                                                case 2:
                                                    System.out.println("Pokemon seleccionado: " +pokemon2_select_j2.getNombre());
                                                    pokemon_selectedj2 = pokemon2_select_j2;                                       
                                                    break;
                                                    
                                            }
                                        }while(seleccion <0 && seleccion > 2 && pokemon_selectedj2.getVida()<0 );
                                        
                                        
                                        //menu para escoger a quien va a atacar el jugador 2
                                        System.out.println("");
                                        System.out.println("Selecciona a que pokemon atacarás");
                                        do{
                                        if(pokemon1_select_j1.getVida()>0){
                                            System.out.println("1- " +pokemon1_select_j1.getNombre());
                                            
                                        }
                                        if(pokemon2_select_j1.getVida()>0){
                                            System.out.println("2- " +pokemon2_select_j1.getNombre());
                                            
                                        }
                                        
                                            int seleccion4 = o.nextInt();
                                            
                                            switch(seleccion4){
                                                case 1:
                                                    System.out.println("Pokemon seleccionado: "+pokemon1_select_j1.getNombre());
                                                    pokemon_selectedj1 = pokemon1_select_j1;                     
                                                    break;
                                                case 2:
                                                    System.out.println("Pokemon seleccionado: "+pokemon2_select_j1.getNombre());
                                                    pokemon_selectedj1 = pokemon2_select_j1;                                       
                                                    break;
                                                    
                                            }
                                        }while(seleccion <0 && seleccion > 2 && pokemon_selectedj2.getVida()<0 );
                                        
                                        //atacar
                                        
                                        pokemon_selectedj2.dibujarpokemon();
                                        System.out.println("Selecciona tu ataque: ");
                                        pokemon_selectedj2.imprimirmenuataque();
                                        
                                        int pokemon_ataque2;
                                        Scanner q = new Scanner(System.in);
                                        pokemon_ataque2 = q.nextInt();
                                        
                                        pokemon_selectedj2.atacar();
                                        
                                        pokemon_selectedj1 = pokemon_selectedj2.atacar(1, pokemon_selectedj1);
                                        
                                       if(pokemon_selectedj1.getVida()>0){
                                            System.out.println("Puntos de vida de " +pokemon_selectedj1.getNombre()+": "+pokemon_selectedj1.getVida());//jugador 2 ataca a jugador 1
                                        } else if(pokemon_selectedj1.getVida()<0){
                                            System.out.println("Puntos de vida de " +pokemon_selectedj1.getNombre()+" =0 (Estado: Muerto)");
                                        }
                                        
                                        if(pokemon1_select_j1.getVida()<=0 && pokemon2_select_j1.getVida() <=0){
                                            System.out.println("¡"+player2+ " ha ganado la batalla!");
                                            
                                            jugador2gana++;
                                            break;//saca del ciclo do while ataque
                                        }
                                                                       
                            }while(pokemon1_select_j1.getVida()>=0 || pokemon2_select_j1.getVida() >= 0 || pokemon1_select_j2.getVida() >= 0 || pokemon2_select_j2.getVida()>=0);
                            
                  
                    break;
                case 3:
                        System.out.println("ESTADISTICAS DEL JUEGO");
                        System.out.println("Numero de veces que los pokemones han sido utilizados: ");
                        System.out.println("- Pikachu "+pikachucontador+" veces");
                        System.out.println("- Charizard "+charizardcontador+" veces");
                        System.out.println("- Mightyena "+mightyenacontador+" veces");
                        System.out.println("- Elekid " +elekidcontador+" veces");
                        System.out.println("- Spearow " +spearowcontador+" veces");
                        System.out.println("- Magikarp " +magikarpcontador+" veces");
                        System.out.println("");
                        System.out.println("Partidas realizadas: " +partidasrealizadas+" batallas");
                        System.out.println("");
                        System.out.println("Jugador 1 ha ganado "+jugador1gana+" veces");
                        System.out.println("");
                        System.out.println("Jugador 2 ha ganado "+jugador2gana+" veces");
                    break;
                case 4:
                     System.out.println("SALIR DEL JUEGO");
                     System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida, elige otra");
                    break;
                           
            }
            
            System.out.println("¿Deseas regresar al Menu principal?");//NUEVO JUEGO
            System.out.println("1- Si");
            System.out.println("2- No");
            int elegir;
            Scanner y = new Scanner(System.in);
            elegir=y.nextInt();
            if(elegir==1){    
                //Continua la ejecución
            } else if(elegir==2){
                break; //Corta el ciclo y se cierra la app
            } 


        }while(opcion != 4); 


    }
                          
}