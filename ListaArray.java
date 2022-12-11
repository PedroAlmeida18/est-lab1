import java.util.Scanner;



public class ListaArray implements EstruturaDeDados{
   private  int [] elementos;
   private  int contador ;
   Scanner leitor = new Scanner(System.in);
    private int chave;
    public ListaArray(){
       elementos = new int[7];
       contador = 0;
        
    }
 
    @Override
    public boolean insert(int chave ) {
        if (contador < this.elementos.length) {
            this.elementos[contador]  = chave;
            contador +=1;
            return true ;
        } else {
            return false;
        }
        
    }

    @Override
    public boolean delete(int chave) {
        for (int i = 0; i <elementos.length;i++){
            if(chave == elementos[i]){
                elementos[i] = 0;
                for ( int j = i; j < contador -1; j++){
                    elementos[j]= elementos[j+1];

                }
                contador -= 1;
                return true;
            }
        } 
        return false;
    }

    @Override
    public boolean search(int chave) {
        for( int i = 0; i< elementos.length;i++){
            if ( chave == elementos[i]){
               return true;
            }
            
        } return false;
       
    }

    @Override
    public int minimum() {
        int chave = 0 ;
        for (int i = 0;i <elementos.length;i++){
            if(elementos[i]<=elementos[0]){
                chave = elementos[i];
            }
        }return chave;
    }

    @Override
    public int maximum() {
        int chave = 0 ;
       for (int i= 0; i<elementos.length;i++) {
        if(elementos[i]>chave){
            chave = elementos[i];
        }
       } 
       return chave;
      
    }

    @Override
    public int sucessor(int chave) {
        int a = 0;
        for(int i = 0;i<elementos.length;i++){
            if(chave == elementos[i]){
              a = elementos[i+1] ;

                }

     } return a;
        } 
    

    @Override
    public int prodessor(int chave) {
        int a = 0;
        for(int i = 0;i<elementos.length;i++){
            if(chave == elementos[i]){
              a = elementos[i-1] ;

            }
    }return a;
}

    public static void main(String[] args) {
        ListaArray r = new ListaArray();
        r.insert(18);
        r.insert(15);
        r.insert(22);
        r.insert(10000);
        r.insert(30);
        r.insert(7);
        r.insert(9);
        
        System.out.println(r.maximum());
        System.out.println(r.minimum());
        System.out.println(r.sucessor(15));
        System.out.println(r.prodessor(30));

    
        
        
    
    }
}
