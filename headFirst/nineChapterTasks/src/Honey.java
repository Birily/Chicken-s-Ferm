class  Bees{
    Honey[] beeHA;
}

class Raccoon{
    Kit k;
    Honey rh;
}

class Kit{
    Honey kh;
}

class Bear{
    Honey hunny;
}

public class Honey {

    public static void main(String[] args) {
	Honey honneyPot = new Honey();
	Honey [] ha = {honneyPot, honneyPot, honneyPot, honneyPot};
	Bees b1 = new Bees();
	b1.beeHA = ha;
	Bear[] ba = new Bear[5];
	for (int x=0;x<5;x++){
	    ba[x] = new Bear();
	    ba[x].hunny = honneyPot;
    }
	Kit k = new Kit();
	k.kh = honneyPot;
	Raccoon r = new Raccoon();
	r.rh=honneyPot;
	r.k = k;
	k = null;
    }
}
