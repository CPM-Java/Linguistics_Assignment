
/**
 * Inheritance Assignment
 * DO NOT MODIFY
 * 
 * @author GK CPM 
 * @version 2/15/18
 */
public class Narrate
{
    private QueensEnglish bloke = new QueensEnglish("Roger");
    private QueensEnglish tory = new AmericanEnglish("Benedict");
    private AmericanEnglish yankee = new AmericanEnglish("Sue Ellen");
    
    // This would not compile:
    //private AmericanEnglish yankee = new QueensEnglish("Sue Ellen");

    /**
     * MadLibs Inheritance
     * 
     */
    public void tellStory()
    {
       System.out.println( bloke.getWho() + " was on " + bloke.relax() +
       ".\nWhile watching " + bloke.event() + ", " + bloke.getWho() + " felt\n" + bloke.inNeed() +
       " so " + bloke.getWho() + "\nbought a " + bloke.food() + 
       ",\nthen saw the home team " + bloke.points() + "!\n\n");
       
       System.out.println( tory.getWho() + " was on " + tory.relax() +
       ".\nWhile watching " + tory.event() + ", " + tory.getWho() + " felt\n" + tory.inNeed() +
       " so " + tory.getWho() + "\nbought a " + tory.food() + 
       ",\nthen saw the home team " + tory.points() + "!\n\n");
       
       System.out.println( yankee.getWho() + " was on " + yankee.relax() + yankee.longWeekend() +
       ".\nWhile watching " + yankee.event() + ", " + yankee.getWho() + " felt\n" + yankee.inNeed() +
       " so " + yankee.getWho() + "\nbought a " + yankee.food() + 
       ",\nthen saw the home team " + yankee.americanPoints() + "!\n\n");
        
    }
    
    /* When finished, your program should give the following
     * output on the terminal:
     
Roger was on holidays.
While watching football, Roger felt
tad parched and peckish so Roger
bought a banger, a fizzy drink and some boiled sweet,
then saw the home team SCORE!


Benedict was on vacation.
While watching baseball, Benedict felt
a little hungry and thirsty so Benedict
bought a hotdog, a soda and some candy,
then saw the home team SCORE!


Sue Ellen was on vacation during the Fourth of July.
While watching baseball, Sue Ellen felt
a little hungry and thirsty so Sue Ellen
bought a hotdog, a soda and some candy,
then saw the home team KNOCK A 3 RUN HOMER!!!!

     */
}
