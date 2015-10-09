
public class playerInitiate {
    
    public int hp;
    public String name;
    
    // Name: (Object) playerInitiate(String playerName, int playerHP)
    // Desc: Starts the player up, sets global var hp to the int & global var playerName to the string
    // Returns: nothing
    public playerInitiate( String playerName, int playerHP )
    {
        hp = playerHP;
        name = playerName;
    }
    
    // Name: setName( String newName )
    // Desc: Sets a new name to the player.
    // Returns: nothing
    public void setName( String newName )
    {
        name = newName;
    }
    
    // Name: hit( int rem )
    // Desc: Subtracts int rem from global var hp
    // Returns: nothing
    public void hit( int rem )
    {
        hp = hp - rem;
        playerInitiate.updateHealth( );
    }
    
    
    // Name: heal( int add )
    // Desc: Adds int add to global var hp
    // Returns: nothing
    public void heal( int add )
    {
        hp = hp + add;
    }
    
    // Name: setHP( int x )
    // Desc: Sets the global var hp to int x
    // Returns: nothing
    public void setHP( int x )
    {
        hp = x;
    }
    
    // Name: getName( )
    // Desc: Returns global var name
    // Returns: name
    public String getName( )
    {
        return name;
    }
    
    // Name: getHP( )
    // Desc: Returns global var hp
    // Returns: hp
    public int getHP( )
    {
        return hp;
    }
    
}
