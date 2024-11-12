package GreedyAlgo;
import java.util.*;
public class Depth {
    public static void main(String[] args) {
        //Creating schedules with starting and end times
        Schedules schedule1=new Schedules(1,3);
        Schedules schedule2=new Schedules(2,5);
        Schedules schedule3=new Schedules(6,7);
        Schedules schedule4=new Schedules(4,8);
        Schedules[] schedules={schedule1,schedule2,schedule3,schedule4};

        //Print out the maximum amount of machines in use
        printMachinesUsed(schedules);
    }
    public static void printMachinesUsed(Schedules[] schedules) {
        //Sort the schedules by start time
        //Big(O)=O(N Log N)
        Arrays.sort(schedules);

        //Create an array of integers to represent the machines where:
        //1)each element of the array represents a machine and
        //2)the value store in each element is equal to the ending
        //time of the last job queued up on that machine

        ArrayList<Integer> machines = new ArrayList<>();


        //check if we can add schedules to machines currently running
        //or if we need to start new machines to accommodate the schedules
        //BIg-o:O(N*D) where N is number of jobs and D is number of machines
        for (int i = 0; i < schedules.length; i++) {
            boolean addedToExistingMachine = false;

            //Loop through the machines running and check if we can
            //add this schedule to any of the machines currently running
            for (int j = 0; j < machines.size(); j++) {
                //if this schedule start time is later that the ending time
                //of the last job queued up in this machine.we can add this schedule to this machine
                if (machines.get(j) < schedules[i].getStartTime()) {
                    machines.set(j, schedules[i].getEndTime());
                    addedToExistingMachine = true;

                    //print ou that we added this schedule to this machine
                    printMachineAndSchedule(j, schedules[i]);


                }
            }
            //We cant add this schedule to any machines currently running because of conflicts
            //or no machines are running.Therefore,we need to start a new machine
            if (!addedToExistingMachine) {
                machines.add(schedules[i].getEndTime());

                //print out that we added this schedule to a new machine
                printMachineAndSchedule(machines.size() - 1, schedules[i]);

            }
        }
        //print out number of machines used
        System.out.println("Number of machines used: " + machines.size());
    }
    public static void printMachineAndSchedule(int machineId,Schedules schedule){
        System.out.println("Machine " +machineId +" scheduled: ");
        System.out.println(schedule.toString());
    }
}
    class Schedules implements Comparable<Schedules> {
        private int startTime;
        private int endTime;

        public Schedules(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public int getStartTime() {
            return this.startTime;
        }

        public int getEndTime() {
            return this.endTime;
        }

        public int compareTo(Schedules otherSchedule) {
            //sort by the schedules start time from the earliest to largest
            return this.getStartTime() - otherSchedule.getStartTime();
        }

        public String toString() {
            return "{" + this.startTime + ", " + this.endTime + "}";
        }

    }
