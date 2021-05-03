package minigame;

import java.util.List;

public abstract class Warior {
    private Integer health;
    private Integer damage;
    private  String name;

    public void setHealth(Integer health) {
        this.health = health;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public Integer getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public void minushelath(Integer damage){

        this.health = this.health-damage;
    } ;
    public void  atack(Warior warior){
        warior.minushelath(this.damage);
        System.out.println(this.name +" atacks "+ warior.name);

    };
    public void showInfo (){
        System.out.println("Name " +  this.name +" Health "+this.health);

    }

}

