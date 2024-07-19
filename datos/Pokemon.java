package datos;

public abstract class Pokemon {
    
    public String nombre;
    public String pokemon;
    public int vida=0;
    public boolean estado = true;
    public int ataque1, ataque2;

    public abstract void pokemon();
    public abstract void nombre();
    public abstract Pokemon select();
    public abstract void vida();
    public abstract void estado();
    public abstract void imprimirmenuataque();
    public abstract Pokemon atacar(int select_ataque, Pokemon pokemon_atacar);
    public abstract void dibujarpokemon();
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPokemon() {
        return pokemon;
    }
    
    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }
    
    public int getVida() {
        return vida;
    }
    
    public void setVida(int vida){
        this.vida = vida;
    }
    
    public Boolean getEstado() {
        return estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado =estado;
    }

    public void atacar() {
        
    }
    
}