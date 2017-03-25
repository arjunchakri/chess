package javac;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

class Javac extends JPanel{
    static int occupy=0,onetime=0,choice = 1,prevchoice=0;
    int s1,s2;
    int d1,d2;
    private static class Main1{
static int killed = 0;
        static int[][] black_positions = new int[100][100];
        static int[][] legal_moves = new int[100][100];
        static int[] white_dead= new int[100];
        static int[] black_dead = new int[100];
        static int black_count=0;
        static int white_count=0;
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        //System.out.println("abcde");
        //Image back = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Root\\Downloads\\Compressed\\chess-master\\chess-master\\gridbg.png");

        for(int l=0;l<8;l++){
            for(int m=0;m<8;m++){
                if((l+m)%2==0){
                    g.setColor(Color.black);
                    g.fillRect(m*50,l*50,50,50);
                }
                else{
                    g.setColor(Color.white);
                    g.fillRect(m*50,l*50,50,50);
                }
            }
        }
        
        Image legalmove = Toolkit.getDefaultToolkit().getImage("F:\\Softwares\\Java Proj\\chess-master\\point.png");

        Image b1 = Toolkit.getDefaultToolkit().getImage("F:\\Softwares\\Java Proj\\chess-master\\b1.png");
        Image b2 = Toolkit.getDefaultToolkit().getImage("F:\\Softwares\\Java Proj\\chess-master\\b2.png");
        Image b3 = Toolkit.getDefaultToolkit().getImage("F:\\Softwares\\Java Proj\\chess-master\\b3.png");
        Image b4 = Toolkit.getDefaultToolkit().getImage("F:\\Softwares\\Java Proj\\chess-master\\b4.png");
        Image b5 = Toolkit.getDefaultToolkit().getImage("F:\\Softwares\\Java Proj\\chess-master\\b5.png");
        Image b6 = Toolkit.getDefaultToolkit().getImage("F:\\Softwares\\Java Proj\\chess-master\\b6.png");
        Image w1 = Toolkit.getDefaultToolkit().getImage("F:\\Softwares\\Java Proj\\chess-master\\w1.png");
        Image w2 = Toolkit.getDefaultToolkit().getImage("F:\\Softwares\\Java Proj\\chess-master\\w2.png");
        Image w3 = Toolkit.getDefaultToolkit().getImage("F:\\Softwares\\Java Proj\\chess-master\\w3.png");
        Image w4 = Toolkit.getDefaultToolkit().getImage("F:\\Softwares\\Java Proj\\chess-master\\w4.png");
        Image w5 = Toolkit.getDefaultToolkit().getImage("F:\\Softwares\\Java Proj\\chess-master\\w5.png");
        Image w6 = Toolkit.getDefaultToolkit().getImage("F:\\Softwares\\Java Proj\\chess-master\\w6.png");

     //   g2.drawImage(back, 0, 0, null);

        if (onetime == 0)
        {
            onetime = 1;
            for (int i = 0; i < 8; i++) {
                Main1.black_positions[1][i] = 1;
                Main1.black_positions[6][i] = 7;
            }
        Main1.black_positions[0][0] = 2;
        Main1.black_positions[0][1] = 3;
        Main1.black_positions[0][2] = 4;
        Main1.black_positions[0][3] = 5;
        Main1.black_positions[0][4] = 6;
        Main1.black_positions[0][5] = 4;
        Main1.black_positions[0][6] = 3;
        Main1.black_positions[0][7] = 2;

        Main1.black_positions[7][0] = 8;
        Main1.black_positions[7][1] = 9;
        Main1.black_positions[7][2] = 10;
        Main1.black_positions[7][3] = 11;
        Main1.black_positions[7][4] = 12;
        Main1.black_positions[7][5] = 10;
        Main1.black_positions[7][6] = 9;
        Main1.black_positions[7][7] = 8;
    }
        for(int l=0;l<8;l++){
            for(int m=0;m<8;m++){
                if(Main1.black_positions[l][m]==1)
                    g2.drawImage(b1, m*50, l*50,null);
                else if(Main1.black_positions[l][m]==2)
                    g2.drawImage(b2, m*50, l*50,null);
                else if(Main1.black_positions[l][m]==3)
                    g2.drawImage(b3, m*50, l*50,null);
                else if(Main1.black_positions[l][m]==4)
                    g2.drawImage(b4, m*50, l*50,null);
                else if(Main1.black_positions[l][m]==5)
                    g2.drawImage(b5, m*50, l*50,null);
                else if(Main1.black_positions[l][m]==6)
                    g2.drawImage(b6, m*50, l*50,null);


                if(Main1.black_positions[l][m]==7)
                    g2.drawImage(w1, m*50, l*50,null);
                else if(Main1.black_positions[l][m]==8)
                    g2.drawImage(w2, m*50, l*50,null);
                else if(Main1.black_positions[l][m]==9) {

                    g2.drawImage(w3, m * 50, l * 50, null);
                }
                else if(Main1.black_positions[l][m]==10)
                    g2.drawImage(w4, m*50, l*50,null);
                else if(Main1.black_positions[l][m]==11)
                    g2.drawImage(w5, m*50, l*50,null);
                else if(Main1.black_positions[l][m]==12)
                    g2.drawImage(w6, m*50, l*50,null);

            }
        }

        for(int l=0;l<8;l++){
            for(int m=0;m<8;m++){
                if(Main1.legal_moves[l][m]==1)
                    g2.drawImage(legalmove, m*50, l*50,null);


            }
        }

        //drawint dead
        for(int l=0;l<Main1.black_count;l++){
            if(Main1.black_dead[l]==1)
                g2.drawImage(b1, 450, l*50,null);
            else if(Main1.black_dead[l]==2)
                g2.drawImage(b2, 450, l*50,null);
            else if(Main1.black_dead[l]==3)
                g2.drawImage(b3, 450, l*50,null);
            else if(Main1.black_dead[l]==4)
                g2.drawImage(b4, 450, l*50,null);
            else if(Main1.black_dead[l]==5)
                g2.drawImage(b5, 450, l*50,null);
            else if(Main1.black_dead[l]==6)
                g2.drawImage(b6, 450, l*50,null);


            
        }
        for(int l=0;l<Main1.white_count;l++){
            if(Main1.white_dead[l]==1)
                g2.drawImage(w1, 500, l*50,null);
            else if(Main1.white_dead[l]==2)
                g2.drawImage(w2, 500, l*50,null);
            else if(Main1.white_dead[l]==3)
                g2.drawImage(w3, 500, l*50,null);
            else if(Main1.white_dead[l]==4)
                g2.drawImage(w4, 500, l*50,null);
            else if(Main1.white_dead[l]==5)
                g2.drawImage(w5, 500, l*50,null);
            else if(Main1.white_dead[l]==6)
                g2.drawImage(w6, 500, l*50,null);


            if(Main1.white_dead[l]==7)
                g2.drawImage(b1, 500, l*50,null);
            else if(Main1.white_dead[l]==8)
                g2.drawImage(b2, 500, l*50,null);
            else if(Main1.white_dead[l]==9) {

                g2.drawImage(b3,500, l * 50, null);
            }
            else if(Main1.white_dead[l]==10)
                g2.drawImage(b4, 500, l*50,null);
            else if(Main1.white_dead[l]==11)
                g2.drawImage(b5, 500, l*50,null);
            else if(Main1.white_dead[l]==12)
                g2.drawImage(b6, 500, l*50,null);

        }


        repaint();

    }
    static int onetimelegal=0;
    static int x,y;
    public static void legal(int a,int b) {
       // System.out.println(a + " " + b);
       
   if (occupy == 0 && Main1.black_positions[a][b]!=0) {
            x = a;
            y = b;
            occupy = 1;
            if(Main1.black_positions[a][b]<=6 && choice == 0) {
                prevchoice=choice;
                choice = 1;
                switch (Main1.black_positions[a][b]) {
                    case 1:
                        pawn(a,b);
                        break;

                    case 2:
                        elephant(a, b, 8);
                        break;

                    case 3:
                        horse(a - 2, b - 1, a, b);
                        horse(a - 2, b + 1, a, b);
                        horse(a + 2, b - 1, a, b);
                        horse(a + 2, b + 1, a, b);
                        horse(a - 1, b - 2, a, b);
                        horse(a + 1, b - 2, a, b);
                        horse(a + 1, b + 2, a, b);
                        horse(a - 1, b + 2, a, b);
                        break;

                    case 4:
                        camel(a, b, 10);
                        break;
                    case 5:
                        camel(a, b, 11);
                        elephant(a, b, 11);
                        break;
                    case 6:
                        king(a,b);
                        break;
                }
            }
            else if(Main1.black_positions[a][b]>=7&&choice == 1){
                prevchoice=choice;
                choice = 0;
                switch (Main1.black_positions[a][b]) {

                    case 7:
                        pawn(a,b);
                        break;
                    case 8:
                        elephant(a, b, 8);
                        break;
                    case 9:
                        horse(a - 2, b - 1, a, b);
                        horse(a - 2, b + 1, a, b);
                        horse(a + 2, b - 1, a, b);
                        horse(a + 2, b + 1, a, b);
                        horse(a - 1, b - 2, a, b);
                        horse(a + 1, b - 2, a, b);
                        horse(a + 1, b + 2, a, b);
                        horse(a - 1, b + 2, a, b);
                        break;
                    case 10:
                        camel(a, b, 10);
                        break;
                    case 11:
                        camel(a, b, 11);
                        elephant(a, b, 11);
                        break;
                    case 12:
                        king(a,b);
                        break;
                }
            }
            onetimelegal=0;
        }
        else if (occupy == 1) {
       if(Main1.black_positions[a][b]!=0){
           Main1.killed = 1;
       }
            if (Main1.legal_moves[a][b] == 1) {
                Main1.black_positions[a][b] = Main1.black_positions[x][y];

                Main1.black_positions[x][y] = 0;
                occupy = 0;

            }
            if( Main1.black_positions[x][y] <=6 && Main1.black_positions[a][b]<=6 && Main1.black_positions[x][y] !=0 && Main1.black_positions[a][b]!=0){

                    choice=prevchoice;
                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {
                            Main1.legal_moves[l][m] = 0;
                        }
                    }
                   if(onetimelegal == 0) {
                       occupy=0;
                       onetimelegal=1;
                        legal(a, b);

                    }

            }
            else if(Main1.black_positions[x][y] >=7 && Main1.black_positions[a][b]>=7 ){
                choice=prevchoice;
                for (int l = 0; l < 8; l++) {
                    for (int m = 0; m < 8; m++) {
                        Main1.legal_moves[l][m] = 0;
                    }
                }
                if(onetimelegal == 0) {
                    occupy=0;
                    onetimelegal=1;
                    legal(a, b);

                }
            }
            if (occupy == 0) {

                for (int l = 0; l < 8; l++) {
                    for (int m = 0; m < 8; m++) {
                        Main1.legal_moves[l][m] = 0;
                    }
                }
            }
               if(Main1.killed==1){
                Main1.killed=0;
                
       System.out.println("javac.Javac.legal()" + Main1.black_positions[a][b] + "  "+ Main1.black_positions[x][y]);
                if(Main1.black_positions[a][b] <=6  )//black
                {
                    Main1.black_dead[Main1.black_count++]=Main1.black_positions[a][b];
                
                }
                else if(Main1.black_positions[a][b] >=7 )//white
                {
                    Main1.white_dead[Main1.white_count++]=Main1.black_positions[a][b];
                }

            }
            
        }
    }


    private static void king(int a, int b) {
        if(Main1.black_positions[a][b]==6){
            if(Main1.black_positions[a+1][b]==0 || Main1.black_positions[a+1][b]>=7 ){
                Main1.legal_moves[a + 1][b] = 1;
            }
            else if(b>1 && Main1.black_positions[a+1][b-1]>=7||Main1.black_positions[a+1][b-1]==0){
                Main1.legal_moves[a + 1][b-1] = 1;
            }
            else if(a>1&&Main1.black_positions[a-1][b]>=7||Main1.black_positions[a-1][b]==0){
                Main1.legal_moves[a - 1][b] = 1;
            }
            else if(Main1.black_positions[a+1][b+1]==0 || Main1.black_positions[a+1][b+1]>=7 ){
                Main1.legal_moves[a + 1][b+1] = 1;
            }
            else if(b>1&&a>1&&Main1.black_positions[a-1][b-1]>=7||Main1.black_positions[a-1][b-1]==0){
                Main1.legal_moves[a - 1][b-1] = 1;
            }
            else if(Main1.black_positions[a+1][b+1]>=7||Main1.black_positions[a+1][b+1]==0){
                Main1.legal_moves[a + 1][b+1] = 1;
            }
            else if(a>1&&Main1.black_positions[a-1][b+1]>=7||Main1.black_positions[a-1][b+1]==0){
                Main1.legal_moves[a - 1][b+1] = 1;
            }
        }
        else if(Main1.black_positions[a][b]==12){

            if(Main1.black_positions[a+1][b]==0 || Main1.black_positions[a+1][b]<=6 ){
                Main1.legal_moves[a + 1][b] = 1;
            }
            else if(b>1 && Main1.black_positions[a+1][b-1]<=6||Main1.black_positions[a+1][b-1]==0){
                Main1.legal_moves[a + 1][b-1] = 1;
            }
            else if(a>1&&Main1.black_positions[a-1][b]<=6||Main1.black_positions[a-1][b]==0){
                Main1.legal_moves[a - 1][b] = 1;
            }
            else if(Main1.black_positions[a+1][b+1]==0 || Main1.black_positions[a+1][b+1]<=6 ){
                Main1.legal_moves[a + 1][b+1] = 1;
            }
            else if(b>1&&a>1&&Main1.black_positions[a-1][b-1]<=6||Main1.black_positions[a-1][b-1]==0){
                Main1.legal_moves[a - 1][b-1] = 1;
            }
            else if(Main1.black_positions[a+1][b+1]<=6||Main1.black_positions[a+1][b+1]==0){
                Main1.legal_moves[a + 1][b+1] = 1;
            }
            else if(a>1&&Main1.black_positions[a-1][b+1]<=6||Main1.black_positions[a-1][b+1]==0){
                Main1.legal_moves[a - 1][b+1] = 1;
            }
        }
    }
        private static void pawn(int a, int b) {
        if(Main1.black_positions[a][b]==1){
            if(a==1) {
                if (Main1.black_positions[a][b] == 1) {
                    Main1.legal_moves[a + 1][b] = 1;
                    Main1.legal_moves[a + 2][b] = 1;

                }
            }
            else if(Main1.black_positions[a+1][b]==0){
                Main1.legal_moves[a + 1][b] = 1;
            }
            if(b>1&&Main1.black_positions[a+1][b-1]>=7){
                Main1.legal_moves[a + 1][b-1] = 1;
            }
            if(Main1.black_positions[a+1][b+1]>=7){
                Main1.legal_moves[a + 1][b+1] = 1;
            }
        }
        else if(Main1.black_positions[a][b]==7){
            if(a==6) {
                if (Main1.black_positions[a][b] == 7) {
                    Main1.legal_moves[a - 1][b] = 1;
                    Main1.legal_moves[a - 2][b] = 1;

                }
            }
            else if(a>1&&Main1.black_positions[a-1][b]==0) {
                Main1.legal_moves[a - 1][b] = 1;
            }
            if(a>1&&b>1&&Main1.black_positions[a-1][b-1]<=6 && Main1.black_positions[a-1][b-1]>0){
                Main1.legal_moves[a - 1][b-1] = 1;
            }
            if(a>1&&Main1.black_positions[a-1][b+1]<=6 && Main1.black_positions[a-1][b+1]>0){
                Main1.legal_moves[a - 1][b+1] = 1;
            }
        }
    }

    private static void elephant(int a, int b,int t) {
        for(int k = 1;k<9;k++) {
            if(Main1.black_positions[a][b]==t&&a-k>=0) {
                if (Main1.black_positions[a - k][b] <= 6) {
                    if (Main1.black_positions[a - k][b] == 0) {
                        Main1.legal_moves[a - k][b] = 1;
                    } else {
                        Main1.legal_moves[a - k][b] = 1;
                        break;
                    }
                }
                else{
                    break;
                }
            }
            else if(a-k>=0){
                if (Main1.black_positions[a - k][b] >=7|| Main1.black_positions[a - k][b] == 0) {
                    if (Main1.black_positions[a - k][b] == 0) {
                        Main1.legal_moves[a - k][b] = 1;
                    } else {
                        Main1.legal_moves[a - k][b] = 1;
                        break;
                    }
                }

                else{
                    break;
                }
            }
        }
        for(int k = 1;k<9;k++) {
            if(Main1.black_positions[a][b]==t) {
                if (Main1.black_positions[a + k][b] <= 6) {
                    if (Main1.black_positions[a + k][b] == 0) {
                        Main1.legal_moves[a + k][b] = 1;
                    } else {
                        Main1.legal_moves[a + k][b] = 1;
                        break;
                    }
                }
                else{
                    break;
                }
            }
            else{
                if (Main1.black_positions[a + k][b] >=7|| Main1.black_positions[a + k][b] == 0) {
                    if (Main1.black_positions[a + k][b] == 0) {
                        Main1.legal_moves[a + k][b] = 1;
                    } else {
                        Main1.legal_moves[a + k][b] = 1;
                        break;
                    }
                }

                else{
                    break;
                }
            }
        }
        for(int k = 1;k<9;k++) {
            if(Main1.black_positions[a][b]==t) {
                if (Main1.black_positions[a][b + k] <= 6) {
                    if (Main1.black_positions[a][b + k] == 0) {
                        Main1.legal_moves[a][b + k] = 1;
                    } else {
                        Main1.legal_moves[a][b + k] = 1;
                        break;
                    }
                }
                else{
                    break;
                }
            }
            else{
                if (Main1.black_positions[a][b + k] >=7|| Main1.black_positions[a][b + k] == 0) {
                    if (Main1.black_positions[a][b + k] == 0) {
                        Main1.legal_moves[a][b + k] = 1;
                    } else {
                        Main1.legal_moves[a][b + k] = 1;
                        break;
                    }
                }

                else{
                    break;
                }
            }
        }
        for(int k = 1;k<9;k++) {
            if(Main1.black_positions[a][b]==t&&b-k>=0) {
                if (Main1.black_positions[a][b -  k] <= 6) {
                    if (Main1.black_positions[a][b -  k] == 0) {
                        Main1.legal_moves[a][b -  k] = 1;
                    } else {
                        Main1.legal_moves[a][b -  k] = 1;
                        break;
                    }
                }
                else{
                    break;
                }
            }
            else if(b-k>=0){
                if (Main1.black_positions[a][b -  k] >=7|| Main1.black_positions[a][b - k] == 0) {
                    if (Main1.black_positions[a][b -  k] == 0) {
                        Main1.legal_moves[a][b -  k] = 1;
                    } else {
                        Main1.legal_moves[a][b -  k] = 1;
                        break;
                    }
                }

                else{
                    break;
                }
            }
        }
    }

    private static void camel(int a, int b,int t) {
        for (int k = 1; k < 9; k++) {
            if (Main1.black_positions[a][b] == t && a - k >= 0 && b - k >= 0) {
                if (Main1.black_positions[a - k][b - k] <= 6) {
                    if (Main1.black_positions[a - k][b - k] == 0) {
                        Main1.legal_moves[a - k][b - k] = 1;
                    } else {
                        Main1.legal_moves[a - k][b - k] = 1;
                        break;
                    }
                } else {
                    break;
                }
            } else if (a - k >= 0 && b - k >= 0) {
                if (Main1.black_positions[a - k][b - k] >= 7|| Main1.black_positions[a - k][b - k] == 0) {
                    if (Main1.black_positions[a - k][b - k] == 0) {
                        Main1.legal_moves[a - k][b - k] = 1;
                    } else {
                        Main1.legal_moves[a - k][b - k] = 1;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        for (int k = 1; k < 9; k++) {
            if (Main1.black_positions[a][b] == t && a - k >= 0) {
                if (Main1.black_positions[a - k][b + k] <= 6) {
                    if (Main1.black_positions[a - k][b + k] == 0) {//white camel
                        Main1.legal_moves[a - k][b + k] = 1;
                    } else {
                        Main1.legal_moves[a - k][b + k] = 1;
                        break;
                    }
                } else {
                    break;
                }
            } else if (a - k >= 0) {
                if (Main1.black_positions[a - k][b + k] >= 7|| Main1.black_positions[a - k][b + k] == 0) {
                    if (Main1.black_positions[a - k][b + k] == 0) {//white camel
                        Main1.legal_moves[a - k][b + k] = 1;
                    } else {
                        Main1.legal_moves[a - k][b + k] = 1;
                        break;
                    }
                } else {
                    break;
                }
            }
        }

        for (int k = 1; k < 9; k++) {
            if (Main1.black_positions[a][b] == t && b - k >= 0) {
                if (Main1.black_positions[a + k][b - k] <= 6) {
                    if (Main1.black_positions[a + k][b - k] == 0) {//white camel
                        Main1.legal_moves[a + k][b - k] = 1;
                    } else {
                        Main1.legal_moves[a + k][b - k] = 1;
                        break;
                    }
                } else {
                    break;
                }
            } else if (b - k >= 0) {


                if (Main1.black_positions[a + k][b - k] >= 7 || Main1.black_positions[a + k][b - k] == 0) {
                    System.out.println("abc");

                    if (Main1.black_positions[a + k][b - k] == 0) {//white camel
                        Main1.legal_moves[a + k][b - k] = 1;
                    } else {
                        Main1.legal_moves[a + k][b - k] = 1;
                        break;
                    }
                } else {
                    break;
                }
            }
        }

            for (int k = 1; k < 9; k++) {
                if (Main1.black_positions[a][b] == t) {
                    if (Main1.black_positions[a + k][b + k] <= 6) {
                        if (Main1.black_positions[a + k][b + k] == 0) {//white camel
                            Main1.legal_moves[a + k][b + k] = 1;
                        } else {
                            Main1.legal_moves[a + k][b + k] = 1;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    if (Main1.black_positions[a + k][b + k] >= 7 || Main1.black_positions[a + k][b + k] == 0) {
                        if (Main1.black_positions[a + k][b + k] == 0) {//white camel
                            Main1.legal_moves[a + k][b + k] = 1;
                        } else {
                            Main1.legal_moves[a + k][b + k] = 1;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }


    public static void horse(int x,int y,int a,int b){

        if( x>=0 && y>=0 ){
            if(Main1.black_positions[a][b] == 3 ){
                if( Main1.black_positions[x][y] ==0 || Main1.black_positions[x][y] >=7)
                    Main1.legal_moves[x][y]=1;
            }
            else if(Main1.black_positions[a][b] == 9)
            {
                if( Main1.black_positions[x][y] ==0 || Main1.black_positions[x][y] <=6)
                {
                    Main1.legal_moves[x][y]=1;
                }
            }
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("chess");
        f.setSize(600, 600);
        JLayeredPane lp = new JLayeredPane();
        JPanel p = new JPanel(new GridLayout(8,8));
        p.setSize(new Dimension(400,400));
        p.setOpaque(false);
        p.setLocation(0,0);
        JPanel[][] p1 = new JPanel[8][8];
        int flag=0;
        for(int l=0;l<8;l++){
            for(int m=0;m<8;m++){
                final int a=l;
                final int b=m;
                p1[l][m]=new JPanel();
                p1[l][m].setPreferredSize(new Dimension(50,50));
                p1[l][m].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e){
                        legal(a,b);
                    }
                });
                p.add(p1[l][m]);
            }
        }
        f.add(p);
        f.add(new Javac());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
