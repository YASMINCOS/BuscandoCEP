
public class Sith extends Jogador{

	private Integer habilidadesSabreDeLuz;
	private Integer pontosForca;


	public Sith(String nome, Integer pontosForca, Integer nivel, Integer habilidadesSabreDeLuz, Integer pontosVida) {
		this.setNome(nome);
		this.setPontosForca(pontosForca);
		this.setNivel(nivel);
		this.setHabilidadesSabreDeLuz(habilidadesSabreDeLuz);
		this.setPontosVida(pontosVida);
	}

	@Override
	public void ataque(Jogador atacado) {
		atacado.setDano(this.getPontosForca() * this.getNivel());
		imprimirAtaque(atacado);
	}

	public void ataqueSabreDeLuz(Jogador atacado) {
		atacado.setDano(this.getHabilidadesSabreDeLuz());
		imprimirBarulho();
	}
	
	private void imprimirAtaque(Jogador atacado) {
		System.out.println("Jogador " + this.getNome() + " está atacando o jogador " + atacado.getNome());
	}
	
	public Integer getHabilidadesSabreDeLuz() {
		return habilidadesSabreDeLuz;
	}

	public void setHabilidadesSabreDeLuz(Integer habilidadesSabreDeLuz) {
		this.habilidadesSabreDeLuz = habilidadesSabreDeLuz;
	}
	
	private void imprimirBarulho() {
		System.out.println("WHON");
	}

	public Integer getPontosForca() {
		return pontosForca;
	}

	public void setPontosForca(Integer pontosForca) {
		this.pontosForca = pontosForca;
	}
	
}
