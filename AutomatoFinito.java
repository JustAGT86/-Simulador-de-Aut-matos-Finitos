
import java.util.Scanner;

public class AutomatoFinito {
    int cont;
    
    char cadeia[];
    public static void main(String[] args) {
        AutomatoFinito AUTOMATO= new AutomatoFinito();
        String palavra;
        int i=0;
        int j=0;
        Scanner quantidade= new Scanner(System.in);
        System.out.println("Digite a quantidade de vezes para o programar rodar: ");
        j=quantidade.nextLine();
        Scanner input= new Scanner(System.in);
        System.out.println("Digite a palavra: ");
        palavra=input.nextLine();

        AUTOMATO.cadeia=palavra.toCharArray();
        AUTOMATO.Iniciar();
    }
    
        
        public void Iniciar(){
            cont=0;
            q0();
        }

        public void q0(){
            if(cont<cadeia.length){
                if(cadeia[cont]=='a'){
                    cont++;
                    q1();
                }             
                else if(cadeia[cont] == 'c'){
                    qf();
                }
                else{
                    qerro();
                }
            }        
            else{
                qerro();
            }
        }
        
        public void q1(){
            if(cont<cadeia.length){
                if(cadeia[cont]=='b'){
                    cont++;
                    q2();
                }                                   
                else{
                    qerro();
                }
            }        
            else{
                qerro();
            }
        }

        public void q2(){
            if(cont<cadeia.length){
                if(cadeia[cont]=='b'){
                    cont++;
                    qf();
                }            
                else{
                    qerro();
                }
            }        
            else{
                qerro();
            }
        }

        public void qf(){
            System.err.println("1 (Palavra aceita pelo automato)");
        }

        public void qerro(){
            System.err.println("0 (Palavra recusada pelo automato)");
        }

}