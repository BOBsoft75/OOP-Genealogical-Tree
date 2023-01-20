package genealogical.tree.data;

public class Relative {
    String name;
    Relation relation;
    String relativeName;

    public Relative() {
    }

    public Relative(String name, Relation relation, String relativeName) {
        this.name = name;
        this.relation = relation;
        this.relativeName = relativeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Relation getRelation() {
        return relation;
    }

    public void setRelation(Relation relation) {
        this.relation = relation;
    }

    public String getRelativeName() {
        return relativeName;
    }

    public void setRelativeName(String relativeName) {
        this.relativeName = relativeName;
    }

    @Override
    public String toString() {
        return "Relative{" +
                "name='" + name + '\'' +
                ", relation=" + relation +
                ", relativeName='" + relativeName + '\'' +
                '}';
    }
}
