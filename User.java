public class User {

    public int points_held;
    public int points_in_escrow;
    public int gacha_num_held;
    public int gacha_roll_tokens_held;
    public int UID;
    public String username;

    public void setNumPoints(int ph) 
    {
        points_held = ph;
    }

    public void setEscrowPoints(int pie) 
    {
        points_in_escrow = pie;
    }

    public void setNumGacha(int gnh) 
    {
        gacha_num_held = gnh;
    }

    public void setRollTokensHeld(int grth) 
    {
        gacha_roll_tokens_held = grth;
    }

    public void setUID(int id) 
    {
        UID = id;
    }

    public void setUsername(String usrnm) 
    {
        username = usrnm;
    }

//--------------------------------------------------------

    public int getNumPoints() 
    {
        return points_held;
    }

    public int getEscrowPoints() 
    {
        return points_in_escrow;
    }

    public int getNumGacha() 
    {
        return gacha_num_held;
    }

    public int setRollTokensHeld() 
    {
        return gacha_roll_tokens_held;
    }

    public int getUID() 
    {
        return UID;
    }

    public String getUsername() 
    {
        return username;
    }

}
