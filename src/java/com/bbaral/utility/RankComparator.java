package com.bbaral.utility;

import com.bbaral.model.CampBlueSkiesEntry;
import java.util.Comparator;

public class RankComparator implements Comparator<CampBlueSkiesEntry> {

    @Override
    public int compare(CampBlueSkiesEntry o1, CampBlueSkiesEntry o2) {
        if(o1.getRank()>o2.getRank())
            return 1;
        else
            return -1;
    }
}
