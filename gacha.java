import java.util.Random;
//Tiers: 0-4
/*
0: junk (redeemable for points, but not enough points for another roll) (40% drop rate)
1: green (30% drop rate)
2: conservationist (15% dr)
3: naturalist (10% dr)
4: ecologist (5% dr)
*/
//"jpg" = dummy name for gacha roll winnings
public class gacha {
    //this may need to go in another file, we shall see
    private static jpg[][] j = {info.junk,info.green,info.cons,info.nat,info.eco};
    //array of tier refs so we don't have to branch
    private static int[] t = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,4,4,4,4,4};
    //roll, get which tier, roll again for which jpg in tier, return jpg
    public static jpg roll(){Random r=new Random();int x=r.nextInt(100);int y=r.nextInt(j[t[x]].length);return j[t[x]][y];}
    public static void main(String[] args){for(int i=0;i<100;i++){System.out.println("Roll: "+roll());}}
}

class info {
    public static jpg[] junk={new jpg(0,0,"foo"),new jpg(0,1,"bar")};
    public static jpg[] green={new jpg(1,2,"baz"),new jpg(1,3,"bloo")};
    public static jpg[] cons={new jpg(2,4,"meh")};
    public static jpg[] nat={new jpg(),new jpg(3,5,"ouch")}; //test dummy
    public static jpg[] eco={new jpg(4,6,"star")};
}

class jpg {
    public int tier;
    public int id;
    public String name;
    public jpg(int jid, int jt, String jn){this.id=jid;this.tier=jt;this.name=jn;}
    //this way we know we have a check
    public jpg(){this.id=-1;this.tier=0;this.name="Dummy";}
    public String toString(){return Integer.toString(tier)+" "+Integer.toString(id)+" "+name;}
}
