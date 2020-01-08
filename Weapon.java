public class Weapon{
	String name = "";
    private int ammo = 30;
    
    public static void main(String[] args) {
        Weapon Ak = new Weapon();
		Weapon Aug = new Weapon();
        Ak.name = "Kalashnikov";
		Aug.name = "Aug Gun";
        Weapon Ak2 = new Weapon();
        Weapon M4_1 = new Weapon();
        Weapon M4_2 = new Weapon();
        System.out.println(Ak.name + " " + Ak.ammo);
		System.out.println(Aug.name + " " + Aug.ammo);
		Ak.fire();
		System.out.println(Ak.name + " " + Ak.ammo);
        System.out.println(Aug.name + " " + Aug.ammo);
    }
    
    public void fire(){
        ammo = ammo -1;
        
    }
    
}