import java.util.Scanner;
/**
 *A fun dice game. but better.
 *
 * @author Guest
 * @version 11/16/2021
 */
public class FunDiceGame2
{
    public static void main(String[] args)
    {
        //integers
        //dice
        Dice die1= new Dice(6);
        Dice die2= new Dice(6);
        Dice die3= new Dice(6);
        Dice die4= new Dice(6);
        Dice die5= new Dice(6);
        //booleans for combos 

        boolean threeKind=false;
        boolean fourKind=false;
        boolean fullHouse=false;
        boolean smallStraight=false;
        boolean largeStraight=false;
        boolean chance=false;
        boolean yatzhee= false;
        //booleans for numbers
        boolean onesCat=false;
        boolean twosCat=false;
        boolean threesCat=false;
        boolean foursCat=false;
        boolean fivesCat=false;
        boolean sixesCat=false;

        Scanner reader=new Scanner(System.in);
        boolean play;
        int reroll, pointsNumbers, pointsTotal, pointsCombos;
        pointsTotal=0;
        pointsCombos=0;
        pointsNumbers=0;
        System.out.println("You are playing something similar to Yatzhee!");
        //beginning playing. 

        for (int rollCounter=0; rollCounter<13; rollCounter++)
        {
            //roll dice
            die1.roll();
            die2.roll();
            die3.roll();
            die4.roll();
            die5.roll();

            int numberCategory;
            int rerollNumber;

            int cntr=0;
            int cntr2=0;

            //roll dice again.

            for (cntr2=0; cntr2<2; cntr2++)
            {

                System.out.println("This is what you rolled. "+die1.getValue()+","+die2.getValue()+","+die3.getValue()+","+die4.getValue()+","+die5.getValue()+".");
                System.out.println("How many die would you like to roll again?");
                rerollNumber= reader.nextInt();
                if(rerollNumber==0)
                {

                    break;
                }
                if(rerollNumber>5)
                {
                    System.out.println("Sorry, that is not a valid number. Please choose a number between 0-5");
                    cntr2--;
                    rerollNumber=0;
                }
                for(cntr=0; cntr<rerollNumber; cntr++)
                {
                    System.out.println("Which die would you like to reroll?");

                    reroll=reader.nextInt();
                    if (reroll==1)
                    {
                        die1.roll();

                    }
                    else
                    {
                        if (reroll==2)
                        {
                            die2.roll();

                        }
                        else{
                            if(reroll==3)
                            {
                                die3.roll();

                            }
                            else
                            {
                                if (reroll==4)
                                {
                                    die4.roll();

                                }
                                else
                                {
                                    if (reroll==5)
                                    {
                                        die5.roll();
                                    }

                                    else
                                    {
                                        System.out.println("Sorry, that is an incorrect input. Try again.");
                                        cntr--;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("This is what you rolled. "+die1.getValue()+","+die2.getValue()+","+die3.getValue()+","+die4.getValue()+","+die5.getValue()+"."); 
            reader.nextLine();
            //choosing combo
            for (int cntr3=0; cntr3<1; cntr3++)
            {
                System.out.println("Would you like to fill a number category or a combo category? If number, type n.");
                String category=reader.nextLine();
                if (category.equals("n"))
                {
                    if (onesCat&&twosCat&&threesCat&&foursCat&&fivesCat&&sixesCat)
                    {
                        System.out.println("Sorry, you have filled up this category.");
                        cntr3--;

                    }
                    else
                    {
                        System.out.println("Which number category would you like to fill?");

                        System.out.println("You can choose ");
                        if (onesCat==false)
                        {
                            System.out.print("1's, ");
                        }
                        if (twosCat==false)
                        {
                            System.out.print("2's, ");
                        }  
                        if (threesCat==false)
                        {
                            System.out.print("3's, ");
                        }  
                        if (foursCat==false)
                        {
                            System.out.print("4's, ");
                        }  
                        if (fivesCat==false)
                        {
                            System.out.print("5's, ");
                        }  
                        if (sixesCat==false)
                        {
                            System.out.print("6's. ");
                        }  
                        System.out.println("Print the number.");
                        numberCategory= reader.nextInt();
                        reader.nextLine();

                        if((numberCategory!=1)&&(numberCategory!=2)&&numberCategory!=3&&numberCategory!=4&&numberCategory!=5&&numberCategory!=6)
                        {
                            System.out.println("Sorry, that is not a category. Try again.");
                            cntr3--;
                        }

                        if(numberCategory==1)
                        {
                            if (onesCat==true)
                            {
                                System.out.println("Sorry,you've already filled that category.");

                                System.out.println("Choose a new category.");
                                cntr3--;
                            }
                            else
                            {
                                if(die1.getValue()==1)
                                {
                                    pointsNumbers+=1;
                                }

                                if(die2.getValue()==1)
                                {
                                    pointsNumbers+=1;
                                }
                                if(die3.getValue()==1)
                                {
                                    pointsNumbers+=1;
                                }
                                if(die4.getValue()==1)
                                {
                                    pointsNumbers+=1;
                                }
                                if(die5.getValue()==1)
                                {
                                    pointsNumbers+=1;
                                }
                                onesCat=true;
                            }
                        }

                        if (numberCategory==2)
                        {
                            if (twosCat==true)
                            {
                                System.out.println("Sorry,you've already filled that category.");

                                System.out.println("Choose a new category.");
                                cntr3--;
                            }
                            else
                            {
                                if(die1.getValue()==2)
                                {
                                    pointsNumbers+=2;
                                }

                                if(die2.getValue()==2)
                                {
                                    pointsNumbers+=2;
                                }
                                if(die3.getValue()==2)
                                {
                                    pointsNumbers+=2;
                                }
                                if(die4.getValue()==2)
                                {
                                    pointsNumbers+=1;
                                }
                                if(die5.getValue()==2)
                                {
                                    pointsNumbers+=1;
                                }
                                twosCat=true;
                            }

                        }

                        if (numberCategory==3)
                        {
                            if (threesCat==true)
                            {
                                System.out.println("Sorry,you've already filled that category.");

                                System.out.println("Choose a new category.");
                                cntr3--;
                            }
                            else
                            {
                                if(die1.getValue()==3)
                                {
                                    pointsNumbers+=3;
                                }

                                if(die2.getValue()==3)
                                {
                                    pointsNumbers+=3;
                                }
                                if(die3.getValue()==3)
                                {
                                    pointsNumbers+=3;
                                }
                                if(die4.getValue()==3)
                                {
                                    pointsNumbers+=3;
                                }
                                if(die5.getValue()==3)
                                {
                                    pointsNumbers+=3;
                                }
                                threesCat=true;
                            }
                        }

                        if (numberCategory==4)
                        {
                            if (foursCat==true)
                            {
                                System.out.println("Sorry,you've already filled that category.");

                                System.out.println("Choose a new category.");
                                cntr3--;
                            }
                            else
                            {
                                if(die1.getValue()==4)
                                {
                                    pointsNumbers+=4;
                                }

                                if(die2.getValue()==4)
                                {
                                    pointsNumbers+=4;
                                }
                                if(die3.getValue()==4)
                                {
                                    pointsNumbers+=4;
                                }
                                if(die4.getValue()==4)
                                {
                                    pointsNumbers+=4;
                                }
                                if(die5.getValue()==4)
                                {
                                    pointsNumbers+=4;
                                }
                                foursCat=true;
                            }
                        }

                        if (numberCategory==5)
                        {
                            if (fivesCat==true)
                            {
                                System.out.println("Sorry,you've already filled that category.");

                                System.out.println("Choose a new category.");
                                cntr3--;
                            }
                            else
                            {
                                if(die1.getValue()==5)
                                {
                                    pointsNumbers+=5;
                                }

                                if(die2.getValue()==5)
                                {
                                    pointsNumbers+=5;
                                }
                                if(die3.getValue()==5)
                                {
                                    pointsNumbers+=5;
                                }
                                if(die4.getValue()==5)
                                {
                                    pointsNumbers+=5;
                                }
                                if(die5.getValue()==5)
                                {
                                    pointsNumbers+=5;
                                }
                                
                                fivesCat=true;
                            }

                        }

                        if (numberCategory==6)
                        {
                            if (sixesCat==true)
                            {
                                System.out.println("Sorry,you've already filled that category.");

                                System.out.println("Choose a new category.");
                                cntr3--;
                            }
                            else
                            {
                                if(die1.getValue()==6)
                                {
                                    pointsNumbers+=6;
                                }

                                if(die2.getValue()==6)
                                {
                                    pointsNumbers+=6;
                                }
                                if(die3.getValue()==6)
                                {
                                    pointsNumbers+=6;
                                }
                                if(die4.getValue()==6)
                                {
                                    pointsNumbers+=6;
                                }
                                if(die5.getValue()==6)
                                {
                                    pointsNumbers+=6;
                                }
                                sixesCat=true;
                            }

                        }
                        System.out.println("This is your combo for the points category: " +pointsNumbers);

                    }
                }
                else
                {
                    //choose combos
                    System.out.println("Which combo would you like to fill?");
                    System.out.println("You can choose ");
                    if(threeKind==false)
                    {
                        System.out.print("3 of a kind, ");
                    }
                    if(fourKind==false)
                    {
                        System.out.print("4 of a kind, ");
                    }
                    if(fullHouse==false)
                    {
                        System.out.print("full house, ");
                    }
                    if(smallStraight==false)
                    {
                        System.out.print("small straight, ");
                    }
                    if(largeStraight==false)
                    {
                        System.out.print("large straight, ");
                    }
                    if(chance==false)
                    {
                        System.out.print("chance, ");
                    }
                    if(yatzhee==false)
                    {
                        System.out.print("or yatzhee.");
                    }
                    String combo=reader.nextLine();
                    if(!combo.equals("3 of a kind")&&!combo.equals("4 of a kind")&&!combo.equals("full house")&&!combo.equals("small straight")&&!combo.equals("large straight")&&!combo.equals("chance")&&!combo.equals("yatzhee"))
                    {
                        System.out.println("Sorrry, that is not a category. try again.");
                        cntr3--;
                    }
                    //combo codes

                    //3 of a kind
                    if (combo.equals("3 of a kind"))
                    {
                        if (threeKind==false)
                        {
                            //code here
                            int ones, twos, threes, fours, fives, sixes;
                            ones=0;
                            twos=0;
                            threes=0;
                            fours=0;
                            fives=0;
                            sixes=0;
                            if (die1.getValue()==1)
                            {
                                ones+=1;
                            }
                            else
                            {
                                if (die1.getValue()==2)
                                {
                                    twos+=1;
                                }
                                else
                                {
                                    if (die1.getValue()==3)
                                    {
                                        threes+=1;
                                    }
                                    else
                                    {
                                        if (die1.getValue()==4)
                                        {
                                            fours+=1;
                                        }
                                        else
                                        {
                                            if (die1.getValue()==5)
                                            {
                                                fives+=1;
                                            }
                                            else
                                            {
                                                if (die1.getValue()==6)
                                                {
                                                    sixes+=1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (die2.getValue()==1)
                            {
                                ones+=1;
                            }
                            else
                            {
                                if (die2.getValue()==2)
                                {
                                    twos+=1;
                                }
                                else
                                {
                                    if (die2.getValue()==3)
                                    {
                                        threes+=1;
                                    }
                                    else
                                    {
                                        if (die2.getValue()==4)
                                        {
                                            fours+=1;
                                        }
                                        else
                                        {
                                            if (die2.getValue()==5)
                                            {
                                                fives+=1;
                                            }
                                            else
                                            {
                                                if (die2.getValue()==6)
                                                {
                                                    sixes+=1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (die3.getValue()==1)
                            {
                                ones+=1;
                            }
                            else
                            {
                                if (die3.getValue()==2)
                                {
                                    twos+=1;
                                }
                                else
                                {
                                    if (die3.getValue()==3)
                                    {
                                        threes+=1;
                                    }
                                    else
                                    {
                                        if (die3.getValue()==4)
                                        {
                                            fours+=1;
                                        }
                                        else
                                        {
                                            if (die3.getValue()==5)
                                            {
                                                fives+=1;
                                            }
                                            else
                                            {
                                                if (die3.getValue()==6)
                                                {
                                                    sixes+=1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (die4.getValue()==1)
                            {
                                ones+=1;
                            }
                            else
                            {
                                if (die4.getValue()==2)
                                {
                                    twos+=1;
                                }
                                else
                                {
                                    if (die4.getValue()==3)
                                    {
                                        threes+=1;
                                    }
                                    else
                                    {
                                        if (die4.getValue()==4)
                                        {
                                            fours+=1;
                                        }
                                        else
                                        {
                                            if (die4.getValue()==5)
                                            {
                                                fives+=1;
                                            }
                                            else
                                            {
                                                if (die4.getValue()==6)
                                                {
                                                    sixes+=1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (die5.getValue()==1)
                            {
                                ones+=1;
                            }
                            else
                            {
                                if (die5.getValue()==2)
                                {
                                    twos+=1;
                                }
                                else
                                {
                                    if (die5.getValue()==3)
                                    {
                                        threes+=1;
                                    }
                                    else
                                    {
                                        if (die5.getValue()==4)
                                        {
                                            fours+=1;
                                        }
                                        else
                                        {
                                            if (die5.getValue()==5)
                                            {
                                                fives+=1;
                                            }
                                            else
                                            {
                                                if (die1.getValue()==6)
                                                {
                                                    sixes+=1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            if(ones>2 || twos >2 || threes>2 || fours>2|| fives>2|| sixes>2)//method is true)//)
                            {
                                System.out.println("Congrats! You filled 3 of a kind.");
                                pointsCombos+= die1.getValue()+die2.getValue()+die3.getValue()+die4.getValue()+die5.getValue();
                                threeKind=true;
                                System.out.println("This is your combo total: "+pointsCombos);

                            }
                            else
                            {
                                System.out.println("Sorry, you don't have a 3 of a kind.");
                                System.out.println("If you choose to fill this category, you will get 0 points. y/n?");
                                String yes= reader.nextLine();
                                if (yes.equals("y"))
                                {
                                    pointsCombos+=0;
                                    threeKind=true;
                                    System.out.println("This is your combo total: "+pointsCombos);
                                }
                                else
                                {
                                    cntr3--; 
                                }

                            }
                        }
                        else
                        {
                            System.out.println("Sorry, you've already filled this category.");
                            cntr3--;
                        }
                    }

                    if (combo.equals("4 of a kind"))
                    {
                        if (fourKind==false)
                        {
                            //code here
                            int ones, twos, threes, fours, fives, sixes;
                            ones=0;
                            twos=0;
                            threes=0;
                            fours=0;
                            fives=0;
                            sixes=0;
                            if (die1.getValue()==1)
                            {
                                ones+=1;
                            }
                            else
                            {
                                if (die1.getValue()==2)
                                {
                                    twos+=1;
                                }
                                else
                                {
                                    if (die1.getValue()==3)
                                    {
                                        threes+=1;
                                    }
                                    else
                                    {
                                        if (die1.getValue()==4)
                                        {
                                            fours+=1;
                                        }
                                        else
                                        {
                                            if (die1.getValue()==5)
                                            {
                                                fives+=1;
                                            }
                                            else
                                            {
                                                if (die1.getValue()==6)
                                                {
                                                    sixes+=1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (die2.getValue()==1)
                            {
                                ones+=1;
                            }
                            else
                            {
                                if (die2.getValue()==2)
                                {
                                    twos+=1;
                                }
                                else
                                {
                                    if (die2.getValue()==3)
                                    {
                                        threes+=1;
                                    }
                                    else
                                    {
                                        if (die2.getValue()==4)
                                        {
                                            fours+=1;
                                        }
                                        else
                                        {
                                            if (die2.getValue()==5)
                                            {
                                                fives+=1;
                                            }
                                            else
                                            {
                                                if (die2.getValue()==6)
                                                {
                                                    sixes+=1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (die3.getValue()==1)
                            {
                                ones+=1;
                            }
                            else
                            {
                                if (die3.getValue()==2)
                                {
                                    twos+=1;
                                }
                                else
                                {
                                    if (die3.getValue()==3)
                                    {
                                        threes+=1;
                                    }
                                    else
                                    {
                                        if (die3.getValue()==4)
                                        {
                                            fours+=1;
                                        }
                                        else
                                        {
                                            if (die3.getValue()==5)
                                            {
                                                fives+=1;
                                            }
                                            else
                                            {
                                                if (die3.getValue()==6)
                                                {
                                                    sixes+=1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (die4.getValue()==1)
                            {
                                ones+=1;
                            }
                            else
                            {
                                if (die4.getValue()==2)
                                {
                                    twos+=1;
                                }
                                else
                                {
                                    if (die4.getValue()==3)
                                    {
                                        threes+=1;
                                    }
                                    else
                                    {
                                        if (die4.getValue()==4)
                                        {
                                            fours+=1;
                                        }
                                        else
                                        {
                                            if (die4.getValue()==5)
                                            {
                                                fives+=1;
                                            }
                                            else
                                            {
                                                if (die4.getValue()==6)
                                                {
                                                    sixes+=1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (die5.getValue()==1)
                            {
                                ones+=1;
                            }
                            else
                            {
                                if (die5.getValue()==2)
                                {
                                    twos+=1;
                                }
                                else
                                {
                                    if (die5.getValue()==3)
                                    {
                                        threes+=1;
                                    }
                                    else
                                    {
                                        if (die5.getValue()==4)
                                        {
                                            fours+=1;
                                        }
                                        else
                                        {
                                            if (die5.getValue()==5)
                                            {
                                                fives+=1;
                                            }
                                            else
                                            {
                                                if (die1.getValue()==6)
                                                {
                                                    sixes+=1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            if(ones>3 || twos >3 || threes>3 || fours>3|| fives>3|| sixes>3)//method is true)//)
                            {
                                System.out.println("Congrats! You filled 4 of a kind.");
                                //add points
                                pointsCombos+= die1.getValue()+die2.getValue()+die3.getValue()+die4.getValue()+die5.getValue();
                                fourKind=true;
                                System.out.println("This is your combo total: "+pointsCombos);

                            }
                            else
                            {
                                System.out.println("Sorry, you don't have a 4 of a kind.");
                                System.out.println("If you choose to fill this category, you will get 0 points. y/n?");
                                String yes= reader.nextLine();
                                if (yes.equals("y"))
                                {
                                    pointsCombos+=0;
                                    fourKind=true;
                                    System.out.println("This is your combo total: "+pointsCombos);
                                }
                                else
                                {
                                    cntr3--; 
                                }

                            }
                        }
                        else
                        {
                            System.out.println("Sorry, you've already filled this category.");
                            cntr3--;
                        }

                    }
                    if (combo.equals("full house"))
                    {
                        if (fullHouse==false)
                        {
                            //code here
                            int ones, twos, threes, fours, fives, sixes;
                            ones=0;
                            twos=0;
                            threes=0;
                            fours=0;
                            fives=0;
                            sixes=0;
                            System.out.println("Which number has 3 dice in it?");
                            int num1, num2;
                            int num1Cntr, num2Cntr;
                            num1Cntr=0;
                            num2Cntr=0;
                            num1=reader.nextInt();
                            System.out.println("Which number has 2 dice in it?");
                            num2=reader.nextInt();
                            reader.nextLine();

                            if (die1.getValue()==num1)
                            {
                                num1Cntr+=1;
                            }
                            else
                            {
                                if (die1.getValue()==num2)
                                {
                                    num2Cntr+=1;
                                }

                            }
                            if(die2.getValue()==num1)
                            {
                                num1Cntr+=1;
                            }
                            else
                            {
                                if (die2.getValue()==num2)
                                {
                                    num2Cntr+=1;
                                }

                            }
                            if(die3.getValue()==num1)
                            {
                                num1Cntr+=1;
                            }
                            else
                            {
                                if (die3.getValue()==num2)
                                {
                                    num2Cntr+=1;
                                }
                            }
                            if(die4.getValue()==num1)
                            {
                                num1Cntr+=1;
                            }
                            else
                            {
                                if (die4.getValue()==num2)
                                {
                                    num2Cntr+=1;
                                }
                            }
                            if(die5.getValue()==num1)
                            {
                                num1Cntr+=1;
                            }
                            else
                            {
                                if (die5.getValue()==num2)
                                {
                                    num2Cntr+=1;
                                }
                            }

                            if(num2Cntr==2&&num1Cntr==3)//method is true)//)
                            {
                                System.out.println("Congrats! You filled full house.");
                                //add points
                                pointsCombos+=25;
                                fullHouse=true;
                                System.out.println("This is your combo total: "+pointsCombos);

                            }
                            else
                            {
                                System.out.println("Sorry, you don't have a full house.");
                                System.out.println("If you choose to fill this category, you will get 0 points. y/n?");
                                String yes= reader.nextLine();
                                if (yes.equals("y"))
                                {
                                    pointsCombos+=0;
                                    fullHouse=true;

                                    System.out.println("This is your combo total: "+pointsCombos);
                                }
                                else
                                {
                                    cntr3--; 
                                }

                            }
                        }
                        else
                        {
                            System.out.println("Sorry, you've already filled this category.");
                            cntr3--;
                        }
                    }

                    if (combo.equals("chance"))
                    {
                        if (chance==false)
                        {
                            //code here
                            pointsCombos+=die1.getValue()+die2.getValue()+die3.getValue()+die4.getValue()+die5.getValue();
                            System.out.println("Congrats! You filled chance.");
                            //add points
                            chance=true;
                            System.out.println("This is your combo total: "+pointsCombos);

                        }
                        else
                        {
                            System.out.println("Sorry, you've already filled this category.");
                            cntr3--;
                        }
                    }

                    //large straight

                    if (combo.equals("large straight"))
                    {

                        //code here
                        if (largeStraight==false)
                        {
                            boolean ones, twos, threes, fours, fives, sixes;
                            ones=false;
                            twos=false;
                            threes=false;
                            fours=false;
                            fives=false;
                            sixes=false;
                            if(die1.getValue()==1||die2.getValue()==1||die3.getValue()==1||die4.getValue()==1||die5.getValue()==1)
                            {
                                ones=true;
                            }
                            if(die1.getValue()==2||die2.getValue()==2||die3.getValue()==2||die4.getValue()==2||die5.getValue()==2)
                            {
                                twos=true;
                            }
                            if(die1.getValue()==3||die2.getValue()==3||die3.getValue()==3||die4.getValue()==3||die5.getValue()==3)
                            {
                                threes=true;
                            }
                            if(die1.getValue()==4||die2.getValue()==4||die3.getValue()==4||die4.getValue()==4||die5.getValue()==4)
                            {
                                fours=true;
                            }
                            if(die1.getValue()==5||die2.getValue()==5||die3.getValue()==5||die4.getValue()==5||die5.getValue()==5)
                            {
                                fives=true;
                            }
                            if(die1.getValue()==6||die2.getValue()==6||die3.getValue()==6||die4.getValue()==6||die5.getValue()==6)
                            {
                                sixes=true;
                            }

                            if((ones||sixes)&&twos&&threes&&fours&&fives)//method is true)//)
                            {
                                System.out.println("Congrats! You filled large straight.");
                                //add points
                                pointsCombos+=40;
                                largeStraight=true;
                                System.out.println("This is your combo total: "+pointsCombos);

                            }
                            else
                            {
                                System.out.println("Sorry, you don't have a large Straight.");
                                System.out.println("If you choose to fill this category, you will get 0 points. y/n?");
                                String yes= reader.nextLine();
                                if (yes.equals("y"))
                                {
                                    pointsCombos+=0;
                                    largeStraight=true;

                                    System.out.println("This is your combo total: "+pointsCombos);
                                }
                                else
                                {
                                    cntr3--; 
                                }

                            }
                        }
                        else
                        {
                            System.out.println("Sorry, you've already filled this category.");
                            cntr3--;
                        }

                    }
                    //small straight
                    if (combo.equals("small straight"))
                    {
                        if (smallStraight==false)
                        {
                            //code here
                            boolean ones, twos, threes, fours, fives, sixes;
                            ones=false;
                            twos=false;
                            threes=false;
                            fours=false;
                            fives=false;
                            sixes=false;
                            smallStraight=true;
                            if(die1.getValue()==1||die2.getValue()==1||die3.getValue()==1||die4.getValue()==1||die5.getValue()==1)
                            {
                                ones=true;
                            }
                            if(die1.getValue()==2||die2.getValue()==2||die3.getValue()==2||die4.getValue()==2||die5.getValue()==2)
                            {
                                twos=true;
                            }
                            if(die1.getValue()==3||die2.getValue()==3||die3.getValue()==3||die4.getValue()==3||die5.getValue()==3)
                            {
                                threes=true;
                            }
                            if(die1.getValue()==4||die2.getValue()==4||die3.getValue()==4||die4.getValue()==4||die5.getValue()==4)
                            {
                                fours=true;
                            }
                            if(die1.getValue()==5||die2.getValue()==5||die3.getValue()==5||die4.getValue()==5||die5.getValue()==5)
                            {
                                fives=true;
                            }
                            if(die1.getValue()==6||die2.getValue()==6||die3.getValue()==6||die4.getValue()==6||die5.getValue()==6)
                            {
                                sixes=true;
                            }
                            if((threes&&fours)&&(ones||fives)&&(twos||sixes))//method is true)//)
                            {
                                System.out.println("Congrats! You filled small straight.");
                                pointsCombos+=30;
                                smallStraight=true;
                                System.out.println("This is your combo total: "+pointsCombos);

                            }
                            else
                            {
                                System.out.println("Sorry, you don't have a small straight.");
                                System.out.println("If you choose to fill this category, you will get 0 points. y/n?");
                                String yes= reader.nextLine();
                                if (yes.equals("y"))
                                {
                                    pointsCombos+=0;
                                    smallStraight=true;

                                    System.out.println("This is your combo total: "+pointsCombos);
                                }
                                else
                                {
                                    cntr3--; 
                                }

                            }
                        }
                        else
                        {
                            System.out.println("Sorry, you've already filled this category.");
                            cntr3--;
                        }
                    }

                    if (combo.equals("yatzhee"))
                    {

                        if(die1.getValue()==die2.getValue()&& die2.getValue()==die3.getValue()&&die3.getValue()==die4.getValue()&die4.getValue()==die5.getValue())
                        {//method is true)//)
                            if (yatzhee==false)
                            {
                                System.out.println("Congrats! You filled yatzhee.");
                                //add points
                                pointsCombos+=50;
                                yatzhee=true;
                                System.out.println("This is your combo total: "+pointsCombos);
                            }

                            else
                            {
                                System.out.println("You have already filled this category!");
                                pointsCombos+=100;
                                System.out.println("This is your combo total: "+pointsCombos);
                                System.out.println("Choose another one to fill.");

                                cntr3--;
                            }
                        }
                        else

                        {
                            System.out.println("Sorry, you don't have a yatzhee.");
                            System.out.println("If you choose to fill this category, you will get 0 points. y/n?");
                            String yes= reader.nextLine();
                            if (yes.equals("y"))
                            {
                                pointsCombos+=0;
                                yatzhee=true;

                                System.out.println("This is your combo total: "+pointsCombos);
                            }
                            else
                            {
                                cntr3--; 
                            }
                        }

                    }

                                  
                }

            }
        }

        System.out.println("I will now add up your point total.");
        if (pointsNumbers>=63)
        {
            System.out.println("This is your total in the number category: "+pointsNumbers);
            System.out.println("Since you had a total greater than or equal to 63, you get a 35 point bonus.");
            pointsNumbers+=35;
            System.out.println("This is your new total in the number category: "+pointsNumbers);
        }

        pointsTotal=pointsCombos+pointsNumbers;
        System.out.println("Your points total is :"+pointsTotal);
        if(pointsTotal<100)
        {
            System.out.println("That is a AWFUL SCORE. Maybe read the rules next time?");
        }
        else
        {
            if(pointsTotal<220)
            {
                System.out.println("That is a meh score. Better luck next time?");
            }
            else
            {
                if(pointsTotal<270)
                {

                    System.out.println("That is an average score. Congrats, I suppose!");

                }
                else 
                {
                    if(pointsTotal<350)
                    {
                        System.out.println("That is a good score! Maybe you can even put it on your resume- I know you don't have anythign else in the skills section...");
                    }
                    else
                    {
                        if(pointsTotal>=350)
                        {
                            System.out.println("That's an AWESOME SCORE! Get a life.");
                        }
                    }
                }
            }
        }
    }
}

//yatzhee

