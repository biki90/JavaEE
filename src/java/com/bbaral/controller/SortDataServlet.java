package com.bbaral.controller;

import com.bbaral.model.CampBlueSkiesEntry;
import com.bbaral.utility.CSVFileParser;
import com.bbaral.utility.RankComparator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SortDataServlet", urlPatterns = {"/sortData"})
public class SortDataServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path=request.getServletContext().getRealPath("");
        System.out.println("Path: "+path);
        CSVFileParser parser=new CSVFileParser();
        List<CampBlueSkiesEntry> list=parser.parse(path+"/spreadsheetExample.csv");
        Collections.sort(list,new RankComparator());
        request.setAttribute("campBlueSkiesSortedEntries", list);
        
        //Rank In Team
        Integer teamNumber=Integer.parseInt(request.getParameter("teamNumber"));
        List<CampBlueSkiesEntry> newList=new ArrayList<>();
        for(CampBlueSkiesEntry entry:list){
            if(Integer.parseInt(entry.getTeamNumber())==teamNumber)
            {
                newList.add(entry);
            }
        }
        request.setAttribute("sortedEntriesByRankInTeam", newList);
        RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
        rd.forward(request, response);
    }
}
