import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bank {

    private Map <Integer, User> clients = new HashMap<>() ;

    public Map<Integer, User> getClients() {
        return clients;
    }

    public void setClients(Map<Integer, User> clients) {
        this.clients = clients;
    }



}
