package Entities;

public class Lista {

	Bloco inicio;

	public Bloco addElemento(int valor, boolean posicaoIncio) {

		Bloco novo = null;

		if (posicaoIncio == true) {

			novo = this.addElementoInicio(valor);

		} else {

			novo = this.addElementoFim(valor);
		}

		return novo;
	}

	public Bloco addElemento(int valor) {

		Bloco novo = null;

		novo = this.addElementoFim(valor);

		return novo;
	}

	public Bloco addElemento(int valor, int posiçao) {

		Bloco novo = new Bloco(valor);
		Bloco aux;

		if (posiçao == 0) {
			novo.prox = inicio;
			inicio = novo;
		}
		if (posiçao > this.tamanho()) {

			aux = this.localizarBloco(this.tamanho());

			for (int i = this.tamanho(); i < posiçao; i++) {
				Bloco aux2 = new Bloco(0);
				aux.prox = aux2;
				aux = aux.prox;
			}

			novo.prox = aux.prox;
			aux.prox = novo;

		} else {

			aux = this.localizarBloco(posiçao);
			novo.prox = aux.prox;
			aux.prox = novo;
		}

		return novo;
	}

	public Bloco removerElementoFim() {

		Bloco result = null;

		if (this.isVazia()) {
			return result;
		}

		if (this.tamanho() == 1) {
			// this.inicio = null;
			result = this.removerElementoInicio();
		} else {

			Bloco target = this.localizarBloco(this.tamanho() - 1);

			result = target.prox;
			target.prox = null;
		}

		return result;
	}

	public Bloco removerElementoInicio() {

		Bloco result = this.inicio;
		if (!this.isVazia()) {

			this.inicio = this.inicio.prox;
		}

		return result;
	}

	public boolean isVazia() {

		return this.inicio == null;
	}

	private Bloco addElementoInicio(int valor) {

		Bloco novo = new Bloco();
		novo.valor = valor;

		novo.prox = this.inicio;
		this.inicio = novo;

		return novo;
	}

	private Bloco addElementoFim(int valor) {

		Bloco novo = null;

		Bloco fim = this.localizarBloco(this.tamanho());

		if (fim == null) {

			novo = this.addElementoInicio(valor);
		} else {

			novo = new Bloco();
			novo.valor = valor;

			fim.prox = novo;
		}

		return novo;
	}

	public Bloco localizarBloco(int pos) {
		return localizarBlocoRecursivo(this.inicio, pos);
	}

	private Bloco localizarBlocoRecursivo(Bloco aux, int pos) {

		if (aux == null) {
			return null;
		}

		if (pos == 1) {
			return aux;
		}

		return localizarBlocoRecursivo(aux.prox, pos - 1);
	}

	public int tamanho() {
		return tamanhoRecursivo(this.inicio);
	}

	private int tamanhoRecursivo(Bloco aux) {

		if (aux == null) {
			return 0;
		}

		return 1 + tamanhoRecursivo(aux.prox);
	}

	// Questao 07 (Classe criada em sala de aula)

	public Lista inverterLista() {

		if (this.inicio == null) {
			return null;
		}

		Bloco anterior = null;
		Bloco atual = this.inicio;
		Bloco proximo = null;

		while (atual != null) {
			proximo = atual.prox;
			atual.prox = anterior;
			anterior = atual;
			atual = proximo;

		}

		Lista listaInvertida = new Lista();
		listaInvertida.inicio = anterior;

		return listaInvertida;
	}

	public void exibirLista() {
		Bloco aux = inicio;
		while (aux != null) {
			System.out.print(aux.valor + ", ");
			aux = aux.prox;
		}
	}

}
