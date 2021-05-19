import java.util.*;

public class ClubMembers
{
    private ArrayList<MemberInfo> memberList;

    public ClubMembers( )
    {
        //stuff
    }

    public void addMembers(String[] names, int gradYear)
    {
   	 for (String n: names) {
              MemberInfo info = new MemberInfo(n, gradYear, true);
              memberList.add(info);
         }
    }

    public ArrayList<MemberInfo> removeMembers(int year)
    {
        ArrayList<MemberInfo> result = new ArrayList<MemberInfo>();

        for (int i = memberList.size(); i >= 0; i--) {
            MemberInfo info = memberList.get(i);

            if (info.getGradYear() <= year) {
                if (info.inGoodStanding()) {
                    result.add(info);
                }

                memberList.remove(i);
            }
        }

        return result;
    }

}
