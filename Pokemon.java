public class Pokemon{
    private String  name;
    private int level;
    private int hp;
    private int pp;

    public Pokemon(){
        this.name = "Charmender";
        this.level = 1;
        this.hp = 10;
        this.pp = 10;
    }

    public void eatBerry(){
        this.hp += 2;
    }

    public void sleep(){
        this.hp += 2;
    }

    public void run(){
        this.hp += 5;
    }

    public void attack(){
        this.level += 1;
        this.hp += 5;
        this.pp += 5;
    }

    public void faint(){
        this.hp = 0;
    }

    public void printStatus(){
        System.out.println("Name= "+this.name);
        System.out.println("Level= "+this.level);
        System.out.println("HP= "+this.hp);
        System.out.println("PP= "+this.pp);
    }
    
}
