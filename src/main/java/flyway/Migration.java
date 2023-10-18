package flyway;

import org.flywaydb.core.Flyway;

public class Migration {
    private static final String URL = "jdbc:h2:./mydb";

    private Migration() {
    }

    public static void migrate() {
        Flyway flyway = Flyway.configure()
                .dataSource(URL, "", "")
                .locations("classpath:db/migration")
                .load();

        flyway.migrate();
    }

}
