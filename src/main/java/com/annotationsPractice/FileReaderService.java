package com.annotationsPractice;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileReaderService implements FortuneService {

    private String filename="C:\\Users\\sangi\\IdeaProjects\\Annotations\\src\\main\\java\\com\\annotationsPractice\\fortune-data.txt";
    private List<String> list ;
    private Random random= new Random();

    @PostConstruct
    public  void FileReaderService(){
        File file= new File(filename);
        System.out.println("reading from the files");

        list= new ArrayList<>();
        try(BufferedReader bufferedReader= new BufferedReader(new FileReader(file))){
            String templine;
            while ((templine=bufferedReader.readLine())!=null){
                list.add(templine);
            }
            System.out.println(list);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }






    @Override
    public String getFortune() {
        int index= random.nextInt(list.size());
        return list.get(index);
    }


//    public static void main(String[] args) {
//        FileReaderService fileReaderService= new FileReaderService();
//        fileReaderService.getFortune();
//        System.out.println(fileReaderService.filename);
//    }
}
