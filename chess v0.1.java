import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class chess extends JPanel{

    int s1,s2;
    int d1,d2;
    private static class Main1{
    static int[][] black_positions = new int[100][100];
    static int[][] legal_moves = new int[100][100];    
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        //System.out.println("abcde");
        Image back = Toolkit.getDefaultToolkit().getImage("D:\\Exps\\Js\\chess\\src\\chess\\gridbg.png");
        
        Image legalmove = Toolkit.getDefaultToolkit().getImage("D:\\Exps\\Js\\chess\\src\\chess\\point.png");
        
        Image b1 = Toolkit.getDefaultToolkit().getImage("D:\\Exps\\Js\\chess\\src\\chess\\b1.png");
        Image b2 = Toolkit.getDefaultToolkit().getImage("D:\\Exps\\Js\\chess\\src\\chess\\b2.png");
        Image b3 = Toolkit.getDefaultToolkit().getImage("D:\\Exps\\Js\\chess\\src\\chess\\b3.png");
        Image b4 = Toolkit.getDefaultToolkit().getImage("D:\\Exps\\Js\\chess\\src\\chess\\b4.png");
        Image b5 = Toolkit.getDefaultToolkit().getImage("D:\\Exps\\Js\\chess\\src\\chess\\b5.png");
        Image b6 = Toolkit.getDefaultToolkit().getImage("D:\\Exps\\Js\\chess\\src\\chess\\b6.png");
        Image w1 = Toolkit.getDefaultToolkit().getImage("D:\\Exps\\Js\\chess\\src\\chess\\w1.png");
        Image w2 = Toolkit.getDefaultToolkit().getImage("D:\\Exps\\Js\\chess\\src\\chess\\w2.png");
        Image w3 = Toolkit.getDefaultToolkit().getImage("D:\\Exps\\Js\\chess\\src\\chess\\w3.png");
        Image w4 = Toolkit.getDefaultToolkit().getImage("D:\\Exps\\Js\\chess\\src\\chess\\w4.png");
        Image w5 = Toolkit.getDefaultToolkit().getImage("D:\\Exps\\Js\\chess\\src\\chess\\w5.png");
        Image w6 = Toolkit.getDefaultToolkit().getImage("D:\\Exps\\Js\\chess\\src\\chess\\w6.png");
        
        g2.drawImage(back, 0, 0,null);
        
        
        for(int i=0;i<8;i++){
            Main1.black_positions[1][i]=1;
            Main1.black_positions[6][i]=7;
        }
        
        
            Main1.black_positions[0][0]=2;
            Main1.black_positions[0][1]=3;
            Main1.black_positions[0][2]=4;
            Main1.black_positions[0][3]=5;
            Main1.black_positions[0][4]=6;
            Main1.black_positions[0][5]=4;
            Main1.black_positions[0][6]=3;
            Main1.black_positions[0][7]=2;
            
            Main1.black_positions[7][0]=8;
            Main1.black_positions[7][1]=9;
            Main1.black_positions[7][2]=10;
            Main1.black_positions[7][3]=11;
            Main1.black_positions[7][4]=12;
            Main1.black_positions[7][5]=10;
            Main1.black_positions[7][6]=9;
            Main1.black_positions[7][7]=8;
            
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
            else if(Main1.black_positions[l][m]==9)
                g2.drawImage(w3, m*50, l*50,null);
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
         
        
        repaint();
    
    }
    
    public static void legal(int a,int b){
        System.out.println(a+" "+b);
        System.out.println(Main1.black_positions[a][b]);
        int x,y;
        switch(Main1.black_positions[a][b]){
            case 1:
                break;
                
            case 2:
                break;

            case 3:
                horse(a-2,b-1,a,b);
                horse(a-2,b+1,a,b);
                horse(a+2,b-1,a,b);
                horse(a+2,b+1,a,b);
                horse(a-1,b-2,a,b);
                horse(a+1,b-2,a,b);
                horse(a+1,b+2,a,b);
                horse(a-1,b+2,a,b);
                break;
                
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                horse(a-2,b-1,a,b);
                horse(a-2,b+1,a,b);
                horse(a+2,b-1,a,b);
                horse(a+2,b+1,a,b);
                horse(a-1,b-2,a,b);
                horse(a+1,b-2,a,b);
                horse(a+1,b+2,a,b);
                horse(a-1,b+2,a,b);
                break;
             case 10:
                break;
            case 11:
                break;
            case 12:    
                break;
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
                if( Main1.black_positions[x][y] ==0 )
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
        f.add(new chess());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    
    }
    
}
