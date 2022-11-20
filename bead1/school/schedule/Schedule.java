package school.schedule;

import java.io.*;
import java.util.Scanner;
import school.subject.*;

public class Schedule{

    private String fileName;
    private int lecturesPerDay;
    private Subject[][] weekSchedule;
    private int minRequiredYears;

    public Schedule(String filename){
        String[] filenameChunks = filename.split("/");
        if(!filenameChunks[filenameChunks.length - 1].startsWith("schedule")){
            throw new IllegalArgumentException("Illegal file name. Must start with schedule keyword.");
        }else{
            this.fileName = filename;
        }

        File input = new File(filename);
        Scanner scanner = null;
        try{
            scanner = new Scanner(input);

            int lecturesPerDay = Integer.parseInt(scanner.nextLine());
            this.lecturesPerDay = lecturesPerDay;
            Subject[][] weekSchedule = new Subject[5][lecturesPerDay];

            int dayCounter = 0;
            int minReqYear = 0;
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                if(nextLine.isEmpty()){
                    continue;
                }
                String[] lineChunks = nextLine.split(" ");
                int dailyLectureNumber = 0;
                while(dailyLectureNumber < lecturesPerDay){
                    weekSchedule[dayCounter][dailyLectureNumber] = Subject.valueOf(lineChunks[dailyLectureNumber]);
                    if(Subject.valueOf(lineChunks[dailyLectureNumber]).getStartingYear() > minReqYear){
                        minReqYear = Subject.valueOf(lineChunks[dailyLectureNumber]).getStartingYear();
                    }
                    dailyLectureNumber++;
                }
                dayCounter++;
            }

            scanner.close();
            if(dayCounter != 5){
                throw new IllegalStateException("Not enough days provided.");
            }
            this.minRequiredYears = minReqYear;
            this.weekSchedule = weekSchedule;
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    public int getClassesPerDay(){
        return this.lecturesPerDay;
    }

    public Subject get(int dayNum, int lectureNum){
        return this.weekSchedule[dayNum-1][lectureNum-1];
    }

    public boolean isSuitableForYear(int yearNum){
        return yearNum >= this.minRequiredYears;
    }

    public static void main(String[] args){

    }
}