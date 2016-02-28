import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.util.Random;

public class Paisaje extends JPanel{
	public void paintComponent(Graphics g){
        	super.paintComponent(g);
                int ancho = getWidth();
                int alto  = getHeight(); 

                 //degradado del cielo. 
                 for (int j = 0;  j < 800 ; j++) { 
                         for ( int i = 0 ; i < 600 ; i++ ) {
                                g.setColor(new Color(0+(i*255)/599,127+(i*127)/599,250));
                                
                                g.drawLine(j,i,j,i);
                         }
                 }

                 //sol
                for(int j = 400; j>350 ; j-- ){
                    for (int i = 300; i>0 ;i-- ) {
                        g.setColor(new Color(255,255-(i*91)/300,0+(i*32)/300,80));
                        g.fillArc(-200,-150,j,i,270,90);   
                    }
                }
            
                
                //piso
                for(int j = 0; j < 800; j++){
                    for(int i = 0; i<100; i++){
                        g.setColor(new Color(45+(i*45)/99, 87+(i*168)/99, 100+(i*59)/99));
                        g.fillRect(j,i+500,j,i+500);
                    }
                }
                
                
                

                //auto
                int arrx[] = {40,  40,  70,  100, 200, 230, 270, 270};        
                int arry[] = {495, 460, 460, 420, 420, 460, 460, 495}; 
                g.setColor(new Color(130, 137, 143));
                g.fillPolygon(arrx, arry, 8); 
                g.setColor(new Color(0,0,0));
                g.drawLine(40,460,70,460);
                g.drawLine(230,460,270,460);
                g.drawLine(70,460,100,420);
                g.drawLine(100,420,200,420);
                g.drawLine(40,494,40,460);
                g.drawLine(40,494,269,494);
                g.drawLine(269,460,269,495);
                g.drawLine(150,420,150,494);
                g.setColor(new Color(255,255,255));
                g.drawLine(200,420,230,459);
                //llantas
                g.setColor(new Color(0, 0, 0 ));
                g.fillOval(80, 470, 30, 30);       
                g.fillOval(192, 470, 30, 30); 
                //rines
                g.setColor(new Color(244, 244, 244));
                g.fillOval(88, 477, 15, 15);       
                g.fillOval(200, 477, 15, 15);  
                //ventanas
                g.setColor(new Color(255,255,255,30));
                g.fillRect(110,435,30,25);
                g.fillRect(165,435,30,25);
                //faros
                g.setColor(new Color(250,210,1));
                g.fillRect(260,460,10,10);
                for (int x = 270;x<310 ;x+=2 ) {
                    for (int y = 460; y<470; y++) {
                        g.drawLine(x,y,x,y);        
                    }
                    
                }

                //arbol
                Random rand = new Random();
                g.setColor(new Color(76,47,39));//tronco
                g.fillRect(730,470,10,30);//tronco

                int r[] = {45,48}; //dos valoes de rgb
                int v[] = {87,132};
                int a[] = {44,70};

                for(int i = 0; i<2000; i++){//crea 2000 hojas con posiciones aleatorias
                    int hojas = (rand.nextInt(2)+1); 
                    int xrand =(rand.nextInt(65)+700) ;
                    int yrand =(rand.nextInt(115)+360);
                    if (hojas == 1){
                        g.setColor(new Color(r[1],v[1], a[1]));
                        g.fillOval(xrand,yrand,5,10);
                    }
                    else if (hojas == 2){
                        g.setColor(new Color(r[0], v[0], a[0]));
                        g.fillOval(xrand,yrand,5,10);
                    }
                    
                }

                //Casa
                


                 
	}

	public static void main(String args[]){
        	Paisaje panel = new Paisaje();
                JFrame application = new JFrame();
                application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                application.add(panel);
                application.setSize(800, 600);
                application.setVisible(true);
	}

}