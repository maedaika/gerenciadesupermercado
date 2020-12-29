package br.com.caixa.exception;


public class ArquivoNaoExistenteException extends NegocioException {

	private static final long serialVersionUID = 1L;

	public ArquivoNaoExistenteException(String msg) {
		super(msg);
	}
	
	public int getFila() {
		return FILA_SIS_WEB;
	}

	public String getSeveridade() {
		return "3";
	}
	
}
