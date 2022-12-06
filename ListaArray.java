import java.util.Scanner;

public class ListaArray implements EstruturaDeDados{
   private  int [] elementos;
   private  int contador ;
   Scanner leitor = new Scanner(System.in);
    public ListaArray(){
       elementos = new int[1000];
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
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int maximum() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int sucessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int prodessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static void main(String[] args) {
        ListaArray r = new ListaArray();
        r.insert(445);
        System.out.println(r.search(445));
        r.search(455);
        r.delete(445);
        System.out.println(r.search(445));
    }
}
