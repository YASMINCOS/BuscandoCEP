
public class Jedi extends Jogador{
	
	private Integer habilidadesSabreDeLuz;
	private Integer pontosForca;


	public Jedi(String nome, Integer pontosForca, Integer nivel, Integer habilidadesSabreDeLuz, Integer pontosVida) {
		this.setNome(nome);
		this.setPontosForca(pontosForca);
		this.setNivel(nivel);
		this.setHabilidadesSabreDeLuz(habilidadesSabreDeLuz);
		this.setPontosVida(pontosVida);
	}

	public void ataque(Jogador atacado) {
		imprimirAtaque(atacado);
		atacado.setDano(this.getPontosForca());
	}

	private void imprimirAtaque(Jogador atacado) {
		System.out.println("Jogador " + this.getNome() + " está atacando o jogador " + atacado.getNome());
	}

	public void ataqueSabreDeLuz(Jogador atacado) {
		atacado.setDano(this.getHabilidadesSabreDeLuz() + this.getPontosForca());
		imprimirBarulho();
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
