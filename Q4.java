/* un fichier Q4.java, qui affiche un triangle d’étoiles ‘*’. Le nombre d’étoiles est donné en
paramètres.*/

public class Q4{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
