public class Elevador {
    int totalAndares;
    int andarAtual;
    int capacidade;
    int numeroPessoasAtual;

    // construtor
    public Elevador(int totalAndares, int capacidade){
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.andarAtual = 0;
        this.numeroPessoasAtual = 0;
    }

    // metodo para subir um andar
    public boolean subir (){
        if (this.andarAtual == this.totalAndares){
            return false; 
        } else {
            this.andarAtual++;
            return true; 
    }

    // metodo para descer um andar
    public boolean descer(){
        if(this.andarAtual == 0){
            return false; 
        } else {
            this.andarAtual--;
            return true; 
        }
    }

    // metodo para entrar no elevador
    public boolean entrar(int numero){
        if(numero <= 0 || numero + this.numeroPessoasAtual > this.capacidade){
            return false; 
        } else {
            this.numeroPessoasAtual += numero;
            return true; 
        }
    }
    
    // metodo sair do elevador
    public boolean sair(int numero){
        if (numero > 0 && numero <= this.numeroPessoasAtual){
            this.numeroPessoasAtual -= numero;
            return true; 
        } else {
            return false; 
        }
    }
}
