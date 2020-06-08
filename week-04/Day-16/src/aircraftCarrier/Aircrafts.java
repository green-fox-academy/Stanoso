package aircraftCarrier;

public class Aircrafts {

    protected int ammo;
    protected int maxAmmo;
    protected int damage;

    public Aircrafts (int damage, int maxAmmo) {
        this.damage = damage;
        this.ammo = 0;
        this.maxAmmo = maxAmmo;
    }

    public int fight() {
        int remainingAmmo = this.ammo;
        this.ammo = 0;
        return this.damage*remainingAmmo;
    }

    public int refill (int ammoStorage) {
        if (ammoStorage >= (this.maxAmmo-this.ammo)) {
            int remaininAmmoStorage = ammoStorage - (this.maxAmmo - this.ammo);
            this.ammo = maxAmmo;
            return remaininAmmoStorage;
        } else {
            this.ammo += ammoStorage;
            return 0;
        }
    }

    public String getType () {
        return this.getClass().getSimpleName();
    }

    public String getStatus() {
        return "This " +this.getType() + ", Ammo: " + this.ammo + ", Base Damage: "+ this.damage+ ", All Damage: "+this.ammo*this.damage;
    }

    public boolean isPriority() {
        if (this.getType().equals("F35")) {
            return true;
        } else {
            return false;
        }
    }

}
