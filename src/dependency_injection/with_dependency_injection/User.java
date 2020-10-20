package dependency_injection.with_dependency_injection;

public class User {


    private String name;
    private String email;


    public User ( String name, String email)
    {
        this.name = name;
        this.email = email;
    }


    public String getName ()
    {
        return this.name;
    }

}
