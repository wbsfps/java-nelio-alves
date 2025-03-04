package secao20.deletando_dados.db;

public class DbIntegrityException extends RuntimeException {
    public DbIntegrityException(String message) {
        super(message);
    }
}
