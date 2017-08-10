package com.bbaral.utility;
import com.bbaral.model.CampBlueSkiesEntry;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileParser {
    
    public List<CampBlueSkiesEntry> parse(String fileName)
    {
        List<CampBlueSkiesEntry> res=new ArrayList<>();
        String line="";
        String separator=",";
        BufferedReader br=null;
        try{
            br=new BufferedReader(new FileReader(fileName));
            int loop=0;//To exclude the header column
            while((line=br.readLine())!=null)
            {
                if(loop>0)
                {
                    CampBlueSkiesEntry ob=new CampBlueSkiesEntry();
                    String[] columnEntries=line.split(separator);
                    ob.setPoolID(Integer.parseInt(columnEntries[0]));
                    ob.setUsername(columnEntries[1]);
                    ob.setEmail(columnEntries[2]);
                    ob.setFirstName(columnEntries[3]);
                    ob.setLastName(columnEntries[4]);
                    ob.setEntryID(Integer.parseInt(columnEntries[5]));
                    ob.setDateEntered(columnEntries[6]);
                    ob.setRank(Integer.parseInt(columnEntries[7]));
                    ob.setPoints(Integer.parseInt(columnEntries[8]));
                    ob.setTieBreaker1(Integer.parseInt(columnEntries[9]));
                    ob.setTieBreaker2(Integer.parseInt(columnEntries[10]));
                    ob.setTeamName(columnEntries[11]);
                    ob.setTeamNumber(columnEntries[12]); 
                    res.add(ob);
                    System.out.println(ob.toString());
                }
                loop++;
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally{
            if(br!=null)
            {
                try{
                br.close();
                }
                catch(IOException ex)
                {
                    ex.printStackTrace();
                }
            }
        }
        return res;
    }
}
