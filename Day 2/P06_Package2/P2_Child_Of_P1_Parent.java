package P06_Package2;

import P06_Package1.P1_Parent;

public class P2_Child_Of_P1_Parent extends P1_Parent
{
   public void fchp2()
   {
      //System.out.println(x + "    "+k);//PRIVATE AND DEFAULT NOT ACCESSED
      System.out.println(y + "    "+z);
   }
}