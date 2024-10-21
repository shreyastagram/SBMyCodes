package DSAquestions;
import java.util.*;
public class graphIsTree {//Code to check if the graph is a tree or not

    private int vertexCount;
    private LinkedList<Integer> adj[];

    graphIsTree(int vertexCount) {
        this.vertexCount = vertexCount;
        this.adj = new LinkedList[vertexCount];
        for (int i = 0; i < vertexCount; ++i) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int v, int w) {//Add an undirected edge between v and w
        adj[v].add(w);
        adj[w].add(v);
    }

    //Helper boolean to check if index is valid(withing bounds)
    public boolean isValidIndex(int i) {
        return i >= 0 && i < vertexCount;
    }

    //DFS based function to check for cycles
    public boolean isCyclic(int v, boolean[] visited, int parent) {
        visited[v] = true;

        for (int adjNode : adj[v]) {
            if (!visited[adjNode]) {
                //recur for the current nodes adjacent node
                if (isCyclic(adjNode, visited, v)) {
                    return true;//Cycle found
                }
            } else if (adjNode != parent) {
                return true;//If an adjacent node is visited and not the parent of the current node then
                // there is a cycle
            }
        }
        return false;
    }

    public boolean isTree() {
        boolean[] Visited = new boolean[vertexCount];

        if (isCyclic(0, Visited, -1)) {
            return false;
        }

        //check if the graph is connected (all vertices must be visited)
        for(int i=0;i<vertexCount;i++){
            if(!Visited[i]){
                return false;//some vertex is not reachable meaning the graph is disconnected
            }
        }
        //if no cycle and the graph is connected,it's a tree
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //NO. of nodes or vertices
        int noOfNodes=sc.nextInt();

        //No of edges
        int noOfEdges=sc.nextInt();

        //If no of edges are not equal to nodes-1 then it is not a tree
        if(noOfEdges != noOfNodes-1){
            System.out.println("No");
            return;
        }
        graphIsTree graph=new graphIsTree(noOfNodes);

        //Adding edges to the graph
        for(int i=0;i<noOfEdges;i++){
            int v=sc.nextInt();
            int w=sc.nextInt();
            graph.addEdge(v,w);
        }
        if(graph.isTree()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }


}
