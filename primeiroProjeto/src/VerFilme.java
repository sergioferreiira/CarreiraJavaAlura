public class VerFilme {
    public static void main(String[] args) {
        Filmes homemAranha = new Filmes("O Incrível Homem-Aranha", 2015, true);
        Filmes vingadores = new Filmes("Os Vingadores", 2012, false);
        Filmes interestelar = new Filmes("Interestelar", 2014, true);
        Filmes batman = new Filmes("Batman: O Cavaleiro das Trevas", 2008, false);
        Filmes avatar = new Filmes("Avatar", 2009, true);
        Filmes matrix = new Filmes("Matrix", 1999, true);
        Filmes toyStory = new Filmes("Toy Story", 1995, false);
        Filmes jurassicPark = new Filmes("Jurassic Park", 1993, true);
        Filmes velozes = new Filmes("Velozes e Furiosos", 2001, false);


        System.out.println(Filmes.getFilmes());
    }
}
