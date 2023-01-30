import java.util.Scanner;

public class AutomatoFinito2 {
    int cont;
    
    char cadeia[];
    public static void main(String[] args) {
        AutomatoFinito2 AUTOMATO= new AutomatoFinito2();
        String palavra;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite a palavra: ");
            palavra=input.nextLine();
        }
        AUTOMATO.cadeia=palavra.toCharArray();
        AUTOMATO.Iniciar();
    }
    
    
    public void Iniciar(){
        cont=0;
        q0();
    }
    
    public void q0(){
        if(cont<cadeia.length){
            if(cadeia[cont]=='d'){
                cont++;
                q1();
            }             
            else if(cadeia[cont] == 'f'){
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
            if(cadeia[cont]=='e'){
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
            if(cadeia[cont]=='e'){
                cont++;
                q0();
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
        System.err.println("1");
    }
     
    public void qerro(){
        System.err.println("0");
    }
}