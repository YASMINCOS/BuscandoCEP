
public class CacadorRecompensas extends Jogador{


	public CacadorRecompensas(String nome, Integer nivel, Integer pontosVida) {
		this.setNome(nome);
		this.setNivel(nivel);
		this.setPontosVida(pontosVida);
	}
	@Override
	public void ataque(Jogador atacado) {
			System.out.println("Jogador " + this.getNome() + " está atacando o jogador " + atacado.getNome());
		}
	@Override
	public String toString() {
		return "CacadorRecompensas [getDano()=" + getDano() + ", getNivel()=" + getNivel() + ", getNome()=" + getNome()
				+ ", getPontosVida()=" + getPontosVida() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
		
	}
	

	

