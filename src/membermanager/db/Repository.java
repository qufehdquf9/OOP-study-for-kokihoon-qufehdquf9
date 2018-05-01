package membermanager.db;

/**
 *
 */
public interface Repository {
    boolean create(User user);
    boolean read(User user);
    boolean delete(User user);
}
