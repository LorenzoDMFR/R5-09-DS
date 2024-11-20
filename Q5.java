/* un fichier Q5.java, copie de Q4 avec un affichage inverser du triangle et afficher des X a la place des etoiles*/

public class Q5{
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
