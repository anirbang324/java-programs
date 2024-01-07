class inheri1{
    int len;
    int br;
    inheri1(int x,int y)
    {
        len=x;
        br=y;
    }
    int area(){
        return (len*br);
    }
}
class inheri2 extends inheri1{
    int height;
    inheri2(int x,int y,int z){
        super(x,y);
        height=z;
    }
    int volume(){
        return (len*br*height);
    }
}
class inheri
{
    public static void main(String[] args) {
        inheri2 r1=new inheri2(12,13,14);
        int area = r1.area();
        int volume1 = r1.volume();
        System.out.println("Area is: "+area);
        System.out.println("Volume is: "+volume1);
    }
}