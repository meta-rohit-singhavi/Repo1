package SocialNetwork;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
	
	/**
	 * It will perform BFS and returning connection path 
	 * between source and destination usernode
	 * @param source
	 * @param dest
	 * @return String Returns connection path
	 */
	   String getConnectionPath(UserNode source, UserNode dest){
		   
	       String path=""+source.getName();
	       LinkedList<UserNode> queue = new LinkedList<UserNode>();
	       queue.add(source);
	       Iterator<UserNode> iterator;
	        
	       while (queue.size()!=0)
	       {
            // Dequeue a vertex from queue and print it
        	UserNode temp= source;
            source = queue.poll();
 
            UserNode intermediateNode;
            iterator = source.getList().listIterator();
 
            while (iterator.hasNext())
            {
                intermediateNode = iterator.next();
 
                if (intermediateNode == dest){
                    return path+"->"+dest.getName();

                }else
                {
                	if(intermediateNode != temp){
                		path+= "->"+intermediateNode.getName();
                		queue.add(intermediateNode);
                	}
                }
            }
        }   
	        return "There is no path exists";
	}
}
