public class BardBarian extends Adventurer{

    private int furyNote, maxFuryNote; // special resource

    public BardBarian(String name){
      super(name);
      this.furyNote = 2;
      this.maxFuryNote = 4;
    }
    public BardBarian(String name, int hp, int fury){
      super(name, hp);
      this.furyNote = fury / 2;
      this.maxFuryNote = fury;
    }



    public String getSpecialName(){
      return "furyNote";
    }

    public int getSpecial(){
      return this.furyNote;
    }

    public void setSpecial(int n){
      this.furyNote = n;
    }

    public int getSpecialMax(){
      return this.maxFuryNote;
    }


    public String attack(Adventurer other){
      other.applyDamage(2);
      return "Did 2 damage";
    }


    public String support(Adventurer other){
      if(this.furyNote > 0){
        other.restoreSpecial(other.getSpecialMax());
        other.setHP(other.getHP());
        this.furyNote--;
      }
      return "Restores other adventurers special to max and hp to max if has available special resource";
    }

    public String support(){
      if(this.furyNote > 0){
        this.setHP(this.getmaxHP());
        this.furyNote--;
      }
      return "Full heal self if have resource pt";
    }

    public String specialAttack(Adventurer other){
      if(this.furyNote > 0){
          other.applyDamage(other.getHP() - 2);
          furyNote--;
      }
      return "almost kills other adventurer";
    }

}
