import java.util.Scanner;

public class AutomatoFinito3 {
    int cont;
    
    char cadeia[];
    public static void main(String[] args) {
        AutomatoFinito3 AUTOMATO= new AutomatoFinito3();
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
            if(cadeia[cont]=='g'){
                cont++;
                q1();
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
            if(cadeia[cont]=='h'){
                cont++;
                q2();
            }  
            
            else if(cadeia[cont] == 'i'){
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

    public void q2(){
        if(cont<cadeia.length){
            if(cadeia[cont]=='i'){
                cont++;
                q1();
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