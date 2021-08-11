package coding.test.learn.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author nagaz
 * 
 * @ 문제: 프로그래머스 코딩테스트 연습 해쉬
 * @ 완주하지 못한 선수
 * @ link: https://programmers.co.kr/learn/courses/30/lessons/42576
 *
 */
public class Hash01 {

	public static void main(String[] args) {
		
		// input data
        String [] participant = {"leo", "kiki", "eden"};
		String[] completion	= {"eden", "kiki"};
		
		//run
		String answer = solution(participant, completion);
		
		
		//output 
		System.out.println(answer);
    }
	
	
	 static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
        Arrays.sort(completion);
//       for(String p:participant)System.out.println(p);
//       for(String c:completion)System.out.println(c);
        int i; 
        for(i=0; i< completion.length;i++) {
 
        	if(!participant[i].equals(completion[i])) return participant[i];
        }
       
        return participant[i];
	    
	}
	 
	 
	 //시간초과
	 String try1(String[] participant, String[] completion) {
		 Arrays.sort(participant);
	        Arrays.sort(completion);
		   
		    List<String> cList = new ArrayList<String>(); 
		    Collections.addAll(cList, completion); 
		    //Collections.sort(pList);
		 
		    
		
		    for(String p : participant) {
		    	//System.out.println(pList.contains(c));
		    	if(!cList.contains(p)) {
		    		//System.out.println(c);
		    		return p;
		    	}else {
		    	
		    		cList.remove(p);
		    	}
		    	
		    		
		    }
		    
		    return "";
	 }



   
}