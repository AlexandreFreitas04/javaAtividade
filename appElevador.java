public class AppElevador {
    public static void main(String args[]){
        Elevador elevador = new Elevador(5, 10);

        // entrando 6 pessoas
        if (elevador.entrar(6)){
            System.out.printf("Entrando... Agora há %d pessoas a bordo.\n\n", elevador.numeroPessoasAtual);
        } else {
            System.out.println("Desculpe, o elevador não suporta mais passageiros.\n");
            System.out.printf("Total de pessoas a bordo: %d\n\n", elevador.numeroPessoasAtual);
        }

        // subindo andar
        if(elevador.subir()){
            System.out.printf("Subindo... Agora estamos no %dº andar.\n\n", elevador.andarAtual);
        } else {
            System.out.printf("Não pode subir mais. o elevador está no %dº andar.\n\n", elevador.andarAtual);
        }

        // entrando 4 pessoas
        if (elevador.entrar(4)){
            System.out.printf("Entrando... Agora há %d pessoas no elevador.\n\n", elevador.numeroPessoasAtual);
        } else {
            System.out.println("Desculpe, não há espaço suficiente para todos.\n");
            System.out.printf("Total de pessoas a bordo: %d\n\n", elevador.numeroPessoasAtual);
        }
        
    
        // saindo 5 pessoas
        if(elevador.sair(5)){
            System.out.printf("Desembarcando... Agora há %d pessoas a bordo.\n\n", elevador.numeroPessoasAtual);
        } else {
            System.out.println("Desculpe, não é possível desembarcar todos os passageiros.\n");
            System.out.printf("Total de pessoas a bordo: %d\n\n", elevador.numeroPessoasAtual);
        }

        // subindo até o ultimo andar
        for(int i = elevador.andarAtual; i < elevador.totalAndares; i++){
            // Subir um andar
            if(elevador.subir()){
                System.out.printf("Subindo... Agora estamos no %dº andar.\n\n", elevador.andarAtual);
            } else {
                System.out.printf("Não podemos subir mais. Estamos no ultimo andar.\n\n");
            }
        }

        // entrando 3 pessoas
        if (elevador.entrar(3)){
            System.out.printf("Entrando... Agora há %d pessoas no elevador.\n\n", elevador.numeroPessoasAtual);
        } else {
            System.out.println("Desculpe, não há espaço suficiente para todos.\n");
            System.out.printf("Total de pessoas a bordo: %d\n\n", elevador.numeroPessoasAtual);
        }

        // descendo até o térreo
        for (int i = elevador.andarAtual; i > 0; i--){
            if(elevador.descer()){
                System.out.printf("Descendo... Agora estamos no %dº andar.\n\n", elevador.andarAtual);
            } else {
                System.out.printf("Não podemos descer mais. Estamos no térreo\n\n");
            }
        }
    }
}
