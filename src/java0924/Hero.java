package java0924;

public class Hero {
    String name;
    int hp;
    int mp;

    // 建構子
    public Hero(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    // 方法
    void attack() {
        System.out.println(this.name + " 使用了攻擊");
    }
    void heal() {
        System.out.println(this.name + " 使用了治療");
    }

    // 封裝 getter 和 setter 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    /**
     * public 其他類別都能存取
     * private 是其類別(同一類別)才能存取
     * protected 是其類別及子類別才能存取
     * */
}
