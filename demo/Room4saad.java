import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room4saad here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Room4saad extends World
{
    public static World Room4saad = new Room4saad();
    // Background voor het begin
    prop background = new prop("Saad/Verlatenn.gif", 148, 175, 600, 350, 100);
    // Background voor einde
    prop background2 = new prop("Saad/TheEnd.gif", 160, 175, 600, 350, 100);
    // Tekst voor Einde
    private String textend1 = "Congratulations!";
    private String textend2 =
            "You are now officialy a new member of the Universal Standard Code for Information Interchange group.";

    

    // Tekstjes met uitleg voor de eerste vraag
    prop Texta = new prop("Saad/Texta.png", 80, 100, 950, 90, 0);
    prop Textb = new prop("Saad/FoutB.png", 80, 100, 810, 220, 0);
    prop Textc = new prop("Saad/FoutC.png", 80, 100, 350, 250, 0);
    prop Textd = new prop("Saad/FoutD.png", 80, 100, 450, 320, 0);

    // Kruisjes voor de eerste vraag
    prop Red = new prop("Saad/Redcross.png", 1, 1, 989, 65, 0);
    prop Red2 = new prop("Saad/Redcross.png", 1, 1, 930, 190, 0);
    prop Red3 = new prop("Saad/Redcross.png", 1, 1, 410, 230, 0);
    prop Red4 = new prop("Saad/Redcross.png", 1, 1, 520, 298, 0);

    prop Help = new prop("Saad/VraagTeken.png", 10, 10, 65, 30, 0);
    prop Arrowh = new prop("Saad/ARROW.png", 3, 3, 110, 30, 0);

    prop Helpbox = new prop("Saad/TextBox.png", 100, 70, 600, 355, 0);
    private String texta =
            "In this room you will have to solve four different Multiple Choice Questions.";
    private String textb = "Every Multiple Choice Question has only one answer.";
    private String textc =
            "close this and press the green arrow.";
    private String textd = "";
    prop Red5 = new prop("Saad/Redcross.png", 1, 1, 950, 270, 0);
    // Eerste vraag
    prop vraag = new prop("Saad/Vraag.png", 100, 100, 200, 100, 100);
    prop antwoord = new prop("Saad/ANTWOORD A.png", 60, 60, 600, 150, 100);
    prop antwoordb = new prop("Saad/ANTWOORD B.png", 60, 60, 325, 200, 100);
    prop antwoordc = new prop("Saad/ANTWOORD C.png", 60, 60, 120, 250, 100);
    prop antwoordd = new prop("Saad/Antwoord D.png", 60, 60, 173, 300, 100);
    // Tweede Vraag
    prop vraag2 = new prop("Saad/Vraag2.png", 100, 100, 255, 95, 100);
    prop antwoord2 = new prop("Saad/ANTWOORD A2.png", 60, 60, 300, 150, 100);
    prop antwoordb2 = new prop("Saad/ANTWOORD B2.png", 60, 60, 325, 200, 100);
    prop antwoordc2 = new prop("Saad/ANTWOORD C2.png", 60, 60, 419, 250, 100);
    prop antwoordd2 = new prop("Saad/ANTWOORD D2.png", 60, 60, 437, 300, 100);
    prop antwoordd2c = new prop("Saad/ANTWOORD D2C.png", 60, 60, 437, 300, 100);

    prop textd2 = new prop("Saad/Textd2.png", 80, 80, 937, 310, 100);
    prop textaa2 = new prop("Saad/Texta2.png", 80, 80, 700, 140, 0);
    prop textb2 = new prop("Saad/Textb2.png", 80, 80, 780, 200, 0);
    prop textc2 = new prop("Saad/Textc2.png", 80, 80, 890, 250, 0);
    // Kruisjes voor Tweede vraag
    prop Re2da = new prop("Saad/Redcross.png", 1, 1, 789, 120, 0);
    prop Re2db = new prop("Saad/Redcross.png", 1, 1, 840, 173, 0);
    prop Re2dc = new prop("Saad/Redcross.png", 1, 1, 950, 230, 0);
    prop Re2dd = new prop("Saad/Redcross.png", 1, 1, 976, 287, 0);

    prop antwoordac = new prop("Saad/ANTWOORD AC.png", 60, 60, 600, 150, 100);
    prop licht = new prop("Saad/Green.png", 10, 10, 1150, 30, 0);
    prop GreenArrow = new prop("Saad/Green.png", 10, 10, 1150, 30, 0);
    prop GreenArrow2 = new prop("Saad/Green.png", 10, 10, 1150, 30, 0);
    
    
    
    //addObject(GreenArrow, 100, 200);
    //addObject(GreenArrow2, 300, 400);
    public Room4saad()
    {
        super(1200, 700, 1);
        addObject(background, 100, 100);

        addObject(Help, 100, 200);
        addObject(Arrowh, 100, 200);


    }

    public void act()
    {
        if (Help.click("tap"))
        {
            addObject(Helpbox, 100, 200);
            showText(texta, 600, 340);
            showText(textb, 600, 380);
            showText(textc, 595, 420);
            showText(textd, 600, 460);
            addObject(Red5, 100, 200);
        }
        if (GreenArrow.click("tap"))
        {
            removeObject(GreenArrow);
            removeObject(vraag);
            removeObject(antwoord);
            removeObject(antwoordac);
            removeObject(antwoordb);
            removeObject(antwoordc);
            removeObject(antwoordd);
            removeObject(Texta);
            removeObject(Textb);
            removeObject(Textc);
            removeObject(Textd);
            removeObject(Red);
            removeObject(Red2);
            removeObject(Red3);
            removeObject(Red4);
            removeObject(Red5);
            

            addObject(vraag2, 100, 200);

            // Voor de nieuwe Vraagset (vragen en textblokken)
            addObject(antwoord2, 200, 200);
            addObject(antwoordb2, 200, 200);
            addObject(antwoordc2, 200, 200);
            addObject(antwoordd2, 200, 200);
        }

        if (antwoordd2.click("tap"))
        {
            addObject(GreenArrow2, 300, 400);
            addObject(textd2, 100, 200);
        }
        if (antwoordd2c.click("tap"))
        {
            addObject(textd2, 100, 200);
            addObject(Re2dd, 100, 200);
        }
        if (Red5.click("tap"))
        {
            addObject(licht, 100, 200);
            removeObject(Red5);
            removeObject(Helpbox);
            showText(null, 600, 340);
            showText(null, 600, 380);
            showText(null, 595, 420);
            showText(null, 600, 460);
        }


        if (Re2da.click("tap"))
        {
            removeObject(textaa2);
        }
        if (Re2db.click("tap"))
            removeObject(textb2);

        if (Re2dc.click("tap"))
            removeObject(textc2);


        if (Re2dd.click("tap"))
            removeObject(textd2);


        // De uitgang uit de gang
        if (licht.click("tap"))
        {
            addObject(vraag, 100, 200);
            addObject(antwoord, 100, 300);
            addObject(antwoordb, 100, 300);
            addObject(antwoordc, 100, 300);
            addObject(antwoordd, 100, 300);
            removeObject(licht);
        }


        if (antwoordc2.click("tap"))
            addObject(textc2, 100, 300);


        if (antwoordc2.click("tap"))
            addObject(Re2dc, 100, 200);


        if (antwoordb2.click("tap"))
            addObject(textb2, 100, 300);


        if (antwoordb2.click("tap"))
            addObject(Re2db, 100, 200);


        if (antwoord2.click("tap"))
            addObject(textaa2, 100, 300);


        if (antwoord2.click("tap"))
            addObject(Re2da, 100, 200);


        if (antwoordd2.click("tap"))
            addObject(Re2dd, 100, 200);

        // Zo dat de Kruisjes verdwijnen Bij de Tweede Vraag

        if (Re2da.click("tap"))
            removeObject(Re2da);


        if (Re2db.click("tap"))
            removeObject(Re2db);


        if (Re2dc.click("tap"))
            removeObject(Re2dc);


        if (Re2dd.click("tap"))
            removeObject(Re2dd);



        if (antwoord.click("tap"))
            addObject(Texta, 100, 300);
            


        if (antwoord.click("tap"))
        {
            addObject(GreenArrow, 100, 200);
            addObject(antwoordac, 100, 300);
        }


        if (antwoord.click("tap"))
            removeObject(antwoord);


        if (antwoord.click("tap"))
            addObject(Red, 100, 300);



        if (antwoordb.click("tap"))
            addObject(Textb, 100, 300);



        if (antwoordb.click("tap"))
            addObject(Red2, 100, 300);



        if (Red2.click("tap"))
            removeObject(Textb);


        if (Red2.click("tap"))
            removeObject(Red2);



        if (Red.click("tap"))
            removeObject(Texta);


        if (Red.click("tap"))
            removeObject(Red);



        if (antwoordc.click("tap"))
            addObject(Textc, 100, 300);



        if (antwoordc.click("tap"))
            addObject(Red3, 100, 300);



        if (Red3.click("tap"))
            removeObject(Textc);


        if (Red3.click("tap"))
            removeObject(Red3);



        if (antwoordd.click("tap"))
        {
            addObject(Textd, 100, 300);
        }



        if (antwoordd.click("tap"))
            addObject(Red4, 100, 300);



        if (Red4.click("tap"))
            removeObject(Textd);


        if (Red4.click("tap"))
            removeObject(Red4);

        // Voor de einde alsje klaar bent met de vragen

        if (GreenArrow2.click("tap"))
            Greenfoot.setWorld(new RoomRobin());


        if (GreenArrow2.click("tap"))
            showText(textend1, 600, 440);


        if (GreenArrow2.click("tap"))
            showText(textend2, 600, 480);

    }
}


