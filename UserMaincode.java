import java.io.*;
import  java.util.*;

// Read only region start
class UserMaincode
{

    public int findKey(int[] input1,int input2){
        // Read only region end
        int sum=0;
        int a;

        int result=0;
        int flag=0;int v=0;
        for(int i=0; i<input2; i++)
        {
            if(input1[i]<0)
            { flag=1;
                v=i;

            }
        }
        if(flag==0)
        {int max=-99999;
            for(int i=0; i<input2; i++)
            {
                if(input1[i]>max)
                { max=input1[i];

                }
            }
            sum=max;
        }
        else{
            int num=input1[0];
            int key=0;
            //System.out.println(num);
            int next=0;int y=2;
            while(num>0)
            {String s=Integer.toString(num);

                next=Integer.parseInt(s.substring(1));
                key=Integer.parseInt(s.charAt(0)+"");
                if(y%2==0)
                {sum=sum+key;}
                else{sum=sum-key;}
                y++;
                //System.out.println(key+"   key ");
                //System.out.println(sum+"   sum ");
                // System.out.println(next+"   next");
                num=input1[next];
            }
            if(num<0)
            {num=-num;
                String s=Integer.toString(num);
                //System.out.println(s);
                key=Integer.parseInt(s.charAt(0)+"");
                if(y%2==0)
                {sum=sum+key;}
                else{sum=sum-key;}
            }
        }
		/*
			else
			{
			int arr[] = new int[input2];
				for(int j=0; j<input2; j++)
				{
					arr[j] = input2[j];
					
				}
			
				
			}
				while(!=0)
				{
					int num=0;
					a= a<
			 num=
				int arr[] = new */
        // Write code here...
        return sum;

    }
}