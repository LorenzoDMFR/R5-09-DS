public class Q3{
    // fichier Q3.java, qui affiche une ligne d’étoiles ‘*’. Le nombre d’étoiles est donné en paramètres
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}