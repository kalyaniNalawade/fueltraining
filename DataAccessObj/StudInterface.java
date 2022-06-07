package vandudbsql;

public interface StudInterface
    {
        void save(Student st);
        void update(Student st);
        void delete(Student st);
        Student getStud(int bnum);
    }