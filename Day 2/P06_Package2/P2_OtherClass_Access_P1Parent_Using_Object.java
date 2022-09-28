package P06_Package2;

import P06_Package1.P1_Parent;

public class P2_OtherClass_Access_P1Parent_Using_Object 
{
    P1_Parent ob3 = new P1_Parent();
    public void fobp2()
    {
      //System.out.println(ob3.x + "    "+ob3.z+"    "+ob3.k);
      System.out.println(ob3.y );
   }
}