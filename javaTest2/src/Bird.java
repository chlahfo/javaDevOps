class Bird{
    private String color;
    private String habitat;
    private int age;
    private double speed;

    public static int bird_nums;

    Bird(String color, String habitat, int age, double speed){
        this.color = color;
        this.habitat = habitat;
        this.age = age;
        this.speed = speed;
        bird_nums++;
    }
    Bird(String color, String habitat, int age){
        this(color, habitat, age, 100);
    }
    Bird(String color, String habitat){
        this(color, habitat, 0, 100);
    }
    Bird(String color){
        this(color, "asia", 0, 100);
    }
    Bird(){
        this("brown", "asia", 0, 100);
    }
    public void setColor(String c){
        color = c;
    }
    public void setHabitat(String h){
        habitat = h;
    }
    public void setAge(int a){
        age = a;
    }
    public void setSpeed(double s){
        speed = s;
    }
    public String getColor(){
        return color;
    }
    public String getHabitat(){
        return habitat;
    }
    public int getAge(){
        return age;
    }
    public double getSpeed(){
        return speed;
    }
    public double getflylenDay(){
       return speed * 24;
    }
}
