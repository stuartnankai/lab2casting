/**
 * Created by sunxuan on 4/21/16.
 */
public class edgesConnect {
    public int x;
    public int y;
//    public edgesConnect(int x, int y){
//        this.x=x;
//        this.y=y;
//
//    }


    public int getX() {
        return x;
    }

    public int getY(){
        return y;
    }

    public  void print()
    {
        System.out.println(x+" & "+y);
    }

    public   Integer multiPly(int x, int y){
        return x*1000+y;
    }

    public static int getNewx(int num)
    {
        int newx=num/1000;
        return newx;
    }

    public static int getNewy(int num)
    {
        int newx=num/1000;
        int newy=num-1000*newx;
        return newy;
    }
    @Override
    public boolean equals(Object o)
    {
        edgesConnect tmp=(edgesConnect)o;
        if(tmp.getY()==this.getY()&&tmp.getX()==this.getX()) return true;
        else return false;
    }
}
