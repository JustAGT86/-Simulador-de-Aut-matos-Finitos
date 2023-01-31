import java.util.Scanner;

public class AutomatoFinito {
    int cont;
    
    char cadeia[];
    public static void main(String[] args) {
        AutomatoFinito AUTOMATO= new AutomatoFinito();
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
            if(cadeia[cont]=='a'){
                cont++;
                q1();
            }             
            else if(cadeia[cont] == 'c'){
                q3();
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

    public void q3(){
        System.err.println("1");
    }
     
    public void qerro(){
        System.err.println("0");
    }
}