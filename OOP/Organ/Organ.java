public class Organ{
    private String name;
    private String medCon;

    public Organ(String name, String medCon){
        this.name = name;
        this.medCon = medCon;
    }

    public String getName(){
        return name;
    }

    public String getMedCon(){
        return medCon;
    }
}

class Eyes extends Organ{
    private String color;

    public Eyes(String name, String medCon, String color){
        super(name, medCon);
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public String closeEyes(){
        return ""+ getName() + " Closed";
    }
}

class Heart extends Organ{
    private int heartRate;

    public Heart(String name, String medCon, int heartRate){
        super(name, medCon);
        this.heartRate = heartRate;
    }

    public int getHeartRate(){
        return heartRate;
    }

    public void setHeartRate(int heartRate){
        this.heartRate = heartRate;
    }
}
