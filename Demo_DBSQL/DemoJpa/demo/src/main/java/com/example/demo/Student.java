@Entity
public class Student
{
    @Id
    private int id;
    private String name;
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int setId()
    {
        return id;
    }
    public String setname()
    {
        return name;
    }
    
}
