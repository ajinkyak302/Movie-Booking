import java.util.*;
public class MovieBooking
{
    int m[][]={{0,0,0,0,0,0,0,0,0,0},{0,19,12,9,4,6,3,8,9,5,11},{0,7,2,6,9,13,12,15,18,14,1},{0,16,11,9,5,2,3,18,10,1,8},{0,10,13,14,17,17,5,6,16,3,1},{0,20,20,4,6,1,2,7,9,19,15}};
    int i;
    int j;
    int time[]=new int[5];
    int scene[]=new int[5];
    int u=1;
    void test(int movien)
    {
        outer:for (i=1;i<=5;i++)
        {
            for (j=1;j<=10;j++)
            {
                if (movien==m[i][j])
                {
                    time[u]=i;
                    scene[u]=j;
                    u++;
                }
                if (u==6)break outer;
            }
        }
        
        for (i=1;i<5;i++)
        System.out.println(time[i]+" "+scene[i]);
    }
    public static void main(String args[])
    {
        Scanner SC=new Scanner(System.in);
        String title="******************WELCOME TO CINEPOLIS*****************";
        String list[]=new String[21];//for Storing Movie names
        list[1]="HOW TO TRAIN YOUR DRAGON 3";
        list[2]="VENOM";
        list[3]="AQUAMAN";
        list[4]="WONDERWOMAN 2";
        list[5]="CAPTAIN MARVEL";
        list[6]="SHAZAM";
        list[7]="AVENGER 4";
        list[8]="ANT-MAN AND THE WASP";
        list[9]="INCREDIBLES 2";
        list[10]="WRECK IT RALPH 2";
        list[11]="OCEANS 8";
        list[12]="DEADPOOL 2";
        list[13]="UNCLE DREW";
        list[14]="FANTASTIC 4";
        list[15]="MISSION:IMPOSSIBLE-FALLOUT";
        list[16]="SKYSCRAPER";
        list[17]="SPIDERMAN:INTO THE SPIDERVERSE";
        list[18]="TEEN TITANS GO! TO THE MOVIES";
        list[19]="SPIDERMAN:2";
        list[20]="ESCAPE PLAN 2:HADES"; 
        String city[]=new String[6];//for Storing City names.
        city[0]="BANGALORE";
        city[1]="CHENNAI";
        city[2]="DELHI";
        city[3]="HYDERABAD";
        city[4]="MUMBAI";
        city[5]="KOLKATA";        
        int time[]=new int[5];
        int scene[]=new int[5];
        int k=0;
        int i,movien=0,j,thc=0;
        String cityn;
        int u=1;
        int n;
        int ppt=0;//price per ticket
        int dc=0;
        String d;
        String th;
        int timec;
        double tp;
        int m[][]={{0,0,0,0,0,0,0,0,0,0},{0,19,12,9,4,6,3,8,9,5,11},{0,7,2,6,9,13,12,15,18,14,1},{0,16,11,9,5,2,3,18,10,1,8},{0,10,13,14,17,17,5,6,16,3,1},{0,20,20,4,6,1,2,7,9,19,15}};
        int date,monthn;String month[]={"","January","February","March","April","May","June","July","August","September","October","November","December"};

        while(k==0)
        {
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("<<< INFORMATION >>>");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("  ! MOBILE AND INTERNET BOOKING IS ALSO AVAILABLE !");
            System.out.println("FOR MOBILE BOOKING CONTACT : +91 7738768201 FROM YOUR MOBILE");
            System.out.println("             ** PREMIUM RATES APPLY **");
            System.out.println("FOR INTERNET BOOKING VISIT : http://www.cinepoliscinemas.com");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println("<<< ENTER DATE >>>");
            date=SC.nextInt();
            if (date>=1 && date<=31)
            break;
            System.out.println("\f");//to clear the screen for next window
            System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
            System.out.println("*********************************************************");
            System.out.println();
        }
        
        while(k==0)
        {
            System.out.println("\f");//to clear the screen for next window
            System.out.println();  
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("<<< INFORMATION >>>");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("  ! MOBILE AND INTERNET BOOKING IS ALSO AVAILABLE !");
            System.out.println("FOR MOBILE BOOKING CONTACT : +91 7738768201 FROM YOUR MOBILE");
            System.out.println("             ** PREMIUM RATES APPLY **");
            System.out.println("FOR INTERNET BOOKING VISIT : http://www.cinepoliscinemas.com");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println("<<< ENTER MONTH >>>");
            for (i=1;i<=12;i++)
            {
                System.out.println(i+"."+month[i]);
            }
            System.out.println();
            monthn=SC.nextInt();
            if (monthn>=1 && monthn<=12)
            break;
            System.out.println("\f");//to clear the screen for next window
            System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
            System.out.println("*********************************************************");
        }
        
        while(k==0)
        {
            System.out.println("\f");//to clear the screen for next window
            System.out.println();  
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("<<< INFORMATION >>>");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("  ! MOBILE AND INTERNET BOOKING IS ALSO AVAILABLE !");
            System.out.println("FOR MOBILE BOOKING CONTACT : +91 7738768201 FROM YOUR MOBILE");
            System.out.println("             ** PREMIUM RATES APPLY **");
            System.out.println("FOR INTERNET BOOKING VISIT : http://www.cinepoliscinemas.com");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            for (i=0;i<6;i++)
            {
                 System.out.print(city[i]+"  ");
            }
            System.out.print("ENTER THE CORRECT CITY NAME OF YOUR CHOICE :");
            cityn=SC.nextLine();
            if(cityn.equalsIgnoreCase(city[0])||cityn.equalsIgnoreCase(city[1])||cityn.equalsIgnoreCase(city[2])||cityn.equalsIgnoreCase(city[3])||cityn.equalsIgnoreCase(city[4])||cityn.equalsIgnoreCase(city[5]))
            {
                break;
            }
            System.out.println("\f");//to clear the screen for next window
            System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
            System.out.println();
            System.out.println("*********************************************************");
        }
        
        while(k==0)
        {
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("<<< INFORMATION >>>");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("  ! MOBILE AND INTERNET BOOKING IS ALSO AVAILABLE !");
            System.out.println("FOR MOBILE BOOKING CONTACT : +91 7738768201 FROM YOUR MOBILE");
            System.out.println("             ** PREMIUM RATES APPLY **");
            System.out.println("FOR INTERNET BOOKING VISIT : http://www.cinepoliscinemas.com");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            for (i=1;i<21;i++)
            {
                 System.out.println(i+"."+list[i]);
            }
            System.out.println();
            System.out.println("<<< CHOOSE MOVIE >>>");
            movien=SC.nextInt();
            if(movien>=1 && movien<=20)
            {
                break;
            }
            System.out.println("\f");//to clear the screen for next window
            System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
            System.out.println();
            System.out.println("*********************************************************");
            System.out.println();
        }
        
        System.out.println("\f");
        /*
            0 1 2 3 4 5 6 7 8 9 10
         0  x x x x x x x x x x x
         1- x   8:00
         2- x   13:00
         3- x   16:00
         4- x   20:00
         5- x   23:00
         
         VIP,IMAX
         2D
         3D
         4DX
        */
       
        while(k==0)
        {
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("<<< INFORMATION >>>");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("  ! MOBILE AND INTERNET BOOKING IS ALSO AVAILABLE !");
            System.out.println("FOR MOBILE BOOKING CONTACT : +91 7738768201 FROM YOUR MOBILE");
            System.out.println("             ** PREMIUM RATES APPLY **");
            System.out.println("FOR INTERNET BOOKING VISIT : http://www.cinepoliscinemas.com");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println("<<< SELECT >>> ");
            System.out.println("1> IMAX | Price Range-Rs.200 to Rs.450");
            System.out.println("2> VIP | Rs.750 Each");
            thc=SC.nextInt();
            switch(thc)
            {
                case 1:
                th="IMAX";
                break;
                case 2:
                th="VIP";
                break;
                default:
                System.out.println("\f");//to clear the screen for next window
                System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                System.out.println();
                System.out.println("*********************************************************");
                System.out.println();
            }
            if(thc==1 || thc==2)
            break;
        }
        
        
        while(k==0)
        {
            if(thc==2)
            break;
            System.out.println("\f");//to clear the screen for next window
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("<<< INFORMATION >>>");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("  ! MOBILE AND INTERNET BOOKING IS ALSO AVAILABLE !");
            System.out.println("FOR MOBILE BOOKING CONTACT : +91 7738768201 FROM YOUR MOBILE");
            System.out.println("             ** PREMIUM RATES APPLY **");
            System.out.println("FOR INTERNET BOOKING VISIT : http://www.cinepoliscinemas.com");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println("<<< SELECT >>>");
            System.out.println("1>IMAX 2D | Rs.200 Each");
            System.out.println("2>IMAX 3D | Rs.300 Each");
            System.out.println("3>IMAX 4DX | Rs.450 Each");
            dc=SC.nextInt();
            switch(dc)
            {
                case 1:
                d="IMAX 2D";
                break;
                case 2:
                d="IMAX 3D";
                break;
                case 3:
                d="IMAX 4DX";
                break;
                default:
                System.out.println("\f");//to clear the screen for next window
                System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                System.out.println();
                System.out.println("*********************************************************");
                System.out.println();
            }
            if(dc==1 || dc==2 || dc==3)
            break;
        }
        
        System.out.println("\f");
        System.out.println(title);
        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("<<< INFORMATION >>>");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("  ! MOBILE AND INTERNET BOOKING IS ALSO AVAILABLE !");
        System.out.println("FOR MOBILE BOOKING CONTACT : +91 7738768201 FROM YOUR MOBILE");
        System.out.println("             ** PREMIUM RATES APPLY **");
        System.out.println("FOR INTERNET BOOKING VISIT : http://www.cinepoliscinemas.com");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("<<< ENTER NUMBER OF SEATS >>>");
        n=SC.nextInt();
        
        if(thc==1)
        {
            if(dc==1)
            {
                ppt=200;
            }
            if(dc==2)
            {
                ppt=300;
            }
            if(dc==3)
            {
                ppt=450;
            }
        }
        if(thc==2)
        {
            ppt=750;
        }
        
        tp=n*ppt;//total price=(number of seats) * (price per ticket)
        tp=(118/100)*tp;//18% tax
        
        outer:for (i=1;i<=5;i++)
        {
            for (j=1;j<=10;j++)
            {
                if (movien==m[i][j])
                {
                    time[u]=i;
                    scene[u]=j;
                    u++;
                }
                if (u==6)break outer;
            }
        }
        
        for (i=1;i<5;i++)
        {
            if (time[i]==1)
            time[i]=800;
            else if(time[i]==2)
            time[i]=1300;
            else if (time[i]==3)
            time[i]=1600;
            else if (time[i]==4)
            time[i]=2000;
            else if (time[i]==5)
            time[i]=2300;
        }
        
        System.out.println("\f");
        System.out.println(title);
        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("<<< INFORMATION >>>");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("  ! MOBILE AND INTERNET BOOKING IS ALSO AVAILABLE !");
        System.out.println("FOR MOBILE BOOKING CONTACT : +91 7738768201 FROM YOUR MOBILE");
        System.out.println("             ** PREMIUM RATES APPLY **");
        System.out.println("FOR INTERNET BOOKING VISIT : http://www.cinepoliscinemas.com");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("<<< SELECT SHOW >>>");
        System.out.println();
        System.out.println("   Scene  "+" Time");
        for (i=1;i<5;i++)
        {
            if (scene[i]==0 && time[i]==0)
            continue;
            System.out.println(i+">   "+scene[i]+"     "+time[i]);
        }
        timec=SC.nextInt();
        
        //Display:
        System.out.println("\f");//to clear the screen for next window
        System.out.println(title);
        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("*********************************************************");
        System.out.println();
        System.out.println("<<< INFORMATION >>>");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("  ! MOBILE AND INTERNET BOOKING IS ALSO AVAILABLE !");
        System.out.println("FOR MOBILE BOOKING CONTACT : +91 7738768201 FROM YOUR MOBILE");
        System.out.println("             ** PREMIUM RATES APPLY **");
        System.out.println("FOR INTERNET BOOKING VISIT : http://www.cinepoliscinemas.com");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("*********************************************************");
        System.out.println("************ THANK YOU FOR BUYING TICKETS ***************");
        System.out.println();
        System.out.println("<<< PRICE PER TICKET >>>"+ppt);
        System.out.println("<<< NUMBER OF SEATS >>> "+n);
        System.out.println("--------------------------------");
        System.out.println("<<< TOTAL AMOUNT >>>    "+tp);
        System.out.println("");
        System.out.println("WATCH YOUR SHOW AT SCENE>>> "+scene[timec]+" AT>>> "+time[timec]);
    }
}