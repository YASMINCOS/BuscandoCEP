import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Combate {
	
	static Jogador atacante = null;
	static Jogador atacado = null;
	static List<Jogador> jogadoresEmCombate = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		Jogador jedi = new Jedi("Allara", 10, 9, 15, 239);
		Jogador sith = new Sith("Darth Vader", 10, 19, 14, 325);
		Jogador cacadorRecompensa= new CacadorRecompensas("Xedi",10,2);
		
		List<Jogador> listaDeEsperaJogadores = Arrays.asList(jedi, sith,cacadorRecompensa);
		
		
		atacante = escolheJogadorDeLista(listaDeEsperaJogadores);
		atacado = escolheJogadorDeLista(listaDeEsperaJogadores);
		
		while(atacante.getPontosVida() >0 && atacado.getPontosVida() >0) {
			
			atacante.ataque(atacado);
			
			System.out.println("Pontos de vida atual do jogador atacado: " + atacado.getPontosVida());
			System.out.println("Pontos de vida atual do jogador atacante: " + atacante.getPontosVida());
			
			if(atacado.getPontosVida() > 0) {
				trocarPapeis(atacante, atacado);
			}
			
		}
	}

	private static Jogador escolheJogadorDeLista(List<Jogador> listaDeEsperaJogadores) {
		Jogador jogador = listaDeEsperaJogadores.get(new Random().nextInt(listaDeEsperaJogadores.size()));
		if(Combate.jogadoresEmCombate.indexOf(jogador) < 0) {
			Combate.jogadoresEmCombate.add(jogador);
			
			return jogador;
			
		}
		
		return escolheJogadorDeLista(listaDeEsperaJogadores);
		

	}

	private static void trocarPapeis(Jogador atacante, Jogador atacado) {
		Jogador temp = atacado;
		Combate.atacado = atacante;
		Combate.atacante = temp;
		System.out.println("Jogadores de combate:" + jogadoresEmCombate);
		
	}
}
