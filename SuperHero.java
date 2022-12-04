public class SuperHero{
    private int age;
    private String name;
    private String superPower;
    private String weakness;

    public SuperHero(){
        age = 32;
        name = "Dontavious";
        superPower = "super strength";
        weakness = "very slow";
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setSuperPower(String newSuperPower){
        superPower = newSuperPower;
    }

    public void setWeakness(String newWeakness){
        weakness = newWeakness;
    }

    public int getAge(){
        return age;
    }
    
    public String getName(){
        return name;
    }

    public String getSuperPower(){
        return superPower;
    }

    public String getWeakness(){
        return weakness;
    }

}