import java.util.ArrayList;

public class ToDoList {
    public static void main(String[] args){
        ArrayList<String> toDoList = new ArrayList<>();

        toDoList.add("Assignment Submission");
        toDoList.add("Push code to GitHub");
        toDoList.add("Watch Video Lectures");

        StringBuffer tdlBuffer = new StringBuffer();
        
        tdlBuffer.append("1.").append(toDoList.get(0)).append("\n");
        tdlBuffer.append("2.").append(toDoList.get(1)).append("\n");
        tdlBuffer.append("3.").append(toDoList.get(2)).append("\n");
        System.out.println(tdlBuffer);

    }
    
}
