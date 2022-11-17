import java.util.Objects;

public abstract class Jogador {

	private String nome;
	private Integer dano;
	private Integer nivel;
	private Integer pontosVida;

	public Integer getDano() {
		return dano;
	}
	
	public abstract void ataque(Jogador atacado);
	

	public void setDano(Integer dano) {
		this.dano = dano;
		this.pontosVida-= dano;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPontosVida() {
		return pontosVida;
	}

	public void setPontosVida(Integer pontosVida) {
		this.pontosVida = pontosVida;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dano, nivel, nome, pontosVida);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		return Objects.equals(dano, other.dano) && Objects.equals(nivel, other.nivel)
				&& Objects.equals(nome, other.nome) && Objects.equals(pontosVida, other.pontosVida);
	}
	
}
