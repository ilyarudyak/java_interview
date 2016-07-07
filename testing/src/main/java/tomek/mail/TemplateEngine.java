package tomek.mail;

/**
 * Created by ilyarudyak on 7/7/16.
 */
public interface TemplateEngine {
    String prepareMessage(Template template, Client client);
}
