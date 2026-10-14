
class Vehicle {
    private String name;
    private String color;
    protected int distance = 0;
    protected int x = 0;
    protected int velocity = 0;
    private Person owner;

    Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getX() {
        return this.x;
    }

    public int getVelocity() {
        return this.velocity;
    }

    public Person getOwner() {
        return this.owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOwner(Person person) {
        this.owner = person;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void go(int time) {
        this.x += this.velocity * time;
    }

    public void back(int time) {
        this.x -= this.velocity * time;
    }

    public int diff(int x1, int x2) {
        return Math.abs(x1 - x2);
    }

    public void printData() {
        System.out.println("名前：" + this.name);
        System.out.println("色：" + this.color);
        System.out.println("走行距離：" + this.distance + "km");
        System.out.println("現在地：" + this.x);
        System.out.println("速度：" + this.velocity);
    }
}