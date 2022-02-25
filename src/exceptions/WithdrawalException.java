package exceptions;

public class WithdrawalException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public WithdrawalException(String mensagem) {
		super(mensagem);
	}
}
