class Employee {
    String name;
    String email;
    int experience;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }

    public Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }
    // write fields

    // write constructor

    // write getters

}

class Developer extends Employee {
    String mainLanguage;
    String[] skills;
    // write fields

    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    // write constructor

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }

    // write getters
}

class DataAnalyst extends Employee {
    boolean phd;
    String[] methods;
    //constructor

    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return methods;
    }

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }
}