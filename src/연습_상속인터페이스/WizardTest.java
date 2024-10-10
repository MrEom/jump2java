package 연습_상속인터페이스;

public class WizardTest {
    public static void main(String[] args) {

        GreatWizard gandalf = new GreatWizard("간달프",100,100,100);

        System.out.println(gandalf.toString());

        gandalf.energeVolt();

    }
}

class Novice{
    //필드
    protected String name;
    protected int hp;

    //생성자
    public Novice(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String toString() {
        return String.format("[Novice] %s(HP: %d)", this.name, this.hp);
    }
}

class Wizard extends Novice {
    protected int mp;

    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }
        public void energeVolt () {
            System.out.printf("%s의 에너지볼트!", this.name);
        }
    }

class GreatWizard extends Wizard {
    protected int shield;

    public GreatWizard(String name, int hp, int mp, int shield) {
        super(name, hp, mp);
        this.shield = shield;
    }

    public String toString() {
        return String.format("[대마법사] %s(HP: %d MP:%d SHIELD: %d)", this.name, this.hp, this.mp, this.shield);
    }

    public void energeVolt () {
        System.out.printf("%s의 에너지볼트! (대마법사의 버프로 데미지+30 추가)\n", this.name);
    }
}