package cpp.hackerrank.util;

import java.util.Comparator;

import cpp.hackerrank.bean.Candidate;

public class CandidateComparator implements Comparator<Candidate>{

	@Override
	public int compare(Candidate o1, Candidate o2) {
		
		//Compare final score first
        if (o1.getFinalScore() != o2.getFinalScore())
        {
            return o1.getFinalScore() < o2.getFinalScore() ? 1 : -1;
        }

        //If final scores are same then compare time takem
        if (o1.getTimeTaken() != o2.getTimeTaken())
        {
        	return o1.getTimeTaken() > o2.getTimeTaken() ? 1 : -1;
        }

        //If time taken is also same then compare score
        if (o1.getScore() != o2.getScore())
        {
        	return o1.getScore() < o2.getScore() ? 1 : -1;
        }
        // Finally by email id
        return o1.getEmail().compareTo(o2.getEmail());
	}

}
