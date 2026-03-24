package DIO_Trilha_Java.Atividade_Controle_Candidatos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidato();
        imprimirSelecionados();
        String [] candidatos = {"Maria", "João", "José", "Ana", "Carlos" }; 
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

        static void entrandoEmContato(String candidato) {
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;  
            boolean atendeu = false;
    
            do{
                atendeu =atender();
                continuarTentando = !atendeu;
                if (continuarTentando){
                    tentativasRealizadas++;
                }else{
                    System.out.println("Contato realizado com sucesso!!");
                }
            }while (continuarTentando && tentativasRealizadas < 3); 

    
            if (atendeu){
                System.out.println("Conseguimos contato com o candidato"+ candidato + " na " + tentativasRealizadas + " tentativa");
            }else{
                System.out.println("Não foi possível entrar em contato com " + candidato + " após " + tentativasRealizadas + " tentativas");
            }
        }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }


     static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    
    static void selecaoCandidato(){
        String [] candidatos = {"Maria", "João", "José", "Ana", "Carlos", "Pedro", "Bruno", "Fernanda", "Gabriela", "Lucas", "Rodrigo", "Marcelo"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: R$" + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Maria", "João", "José", "Ana", "Carlos" };
        System.out.println("imptimindo a lista de candidatos selecionados informando o indice do elemento");

        for (int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato  de numero " + (i + 1) + " é o " + candidatos[i] + " e foi selecionado para a vaga");
        }
        
        System.out.println("Forma abreviada de interaçao dor each");

        for (String candidato : candidatos){
            System.out.println("O candidato Selecionado foi " + candidato  );
        }

    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;

        if (salarioBase > salarioPretendido){
            System.out.println("LIgar Para O Candidato");
        }else if (salarioBase == salarioPretendido){
            System.out.println("Ligar Para O Candidato Com Contra Proposta");
        }else{
            System.out.println("Aguardado Resultado de demais candidatos");
        }
    }
}




