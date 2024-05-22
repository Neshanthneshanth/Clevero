package com.sagarkhurana.quizforfun.other;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;

import com.sagarkhurana.quizforfun.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class Utils {

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

    @SuppressLint("WeekBasedYear")
    public static String formatDate(long time){
        SimpleDateFormat formatter = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            formatter = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.getDefault());
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return formatter.format(calendar.getTime());
    }

    public static Map<String,String> getMathQuestions(){
        HashMap<String,String> questions = new HashMap<>();
        questions.put("1+1","2");
        questions.put("2+2","4");
        questions.put("3+3","6");
        questions.put("4+4","8");
        questions.put("5+5","10");
        questions.put("6+6","12");
        questions.put("7+7","14");
        questions.put("8+8","16");
        questions.put("9+9","18");
        questions.put("10+10","20");
        questions.put("11+11","22");
        questions.put("12+12","24");
        questions.put("13+13","26");
        questions.put("14+14","28");
        questions.put("15+15","30");

        return questions;
    }

    public static Map<String,String> getRandomMathQuestions(int SIZE){
        HashMap<String,String> questionsMap = new HashMap<>();
        Map<String,String> originalQuestion = getMathQuestions();
        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }



    public static Map<String,Map<String,Boolean>> getLiteratureQuestions(){
        HashMap<String, Map<String, Boolean>> questions = new HashMap<>();

        HashMap<String, Boolean> answer1 = new HashMap<>();
        answer1.put("Array", true);
        answer1.put("LinkedList", false);
        answer1.put("HashMap", false);
        answer1.put("Stack", false);
        questions.put("Which data structure stores elements in contiguous memory locations?", answer1);

        HashMap<String, Boolean> answer2 = new HashMap<>();
        answer2.put("Queue", true);
        answer2.put("Set", false);
        answer2.put("Graph", false);
        answer2.put("Tree", false);
        questions.put("Which data structure follows the First In First Out (FIFO) principle?", answer2);

        HashMap<String, Boolean> answer3 = new HashMap<>();
        answer3.put("Binary Search Tree", true);
        answer3.put("Heap", false);
        answer3.put("Trie", false);
        answer3.put("Hash Table", false);
        questions.put("Which data structure is used for efficient searching, insertion, and deletion operations?", answer3);

        HashMap<String, Boolean> answer4 = new HashMap<>();
        answer4.put("Graph", true);
        answer4.put("Array", false);
        answer4.put("Stack", false);
        answer4.put("Queue", false);
        questions.put("Which data structure is suitable for representing networks?", answer4);

        HashMap<String, Boolean> answer5 = new HashMap<>();
        answer5.put("Linked List", true);
        answer5.put("Array", false);
        answer5.put("Queue", false);
        answer5.put("Stack", false);
        questions.put("Which data structure consists of a sequence of elements where each element has a reference to the next element?", answer5);

        HashMap<String, Boolean> answer6 = new HashMap<>();
        answer6.put("Depth First Search", true);
        answer6.put("Breadth First Search", false);
        answer6.put("Dijkstra's Algorithm", false);
        answer6.put("Prim's Algorithm", false);
        questions.put("Which algorithm is used to traverse a graph in depth-first order?", answer6);

        HashMap<String, Boolean> answer7 = new HashMap<>();
        answer7.put("Binary Tree", true);
        answer7.put("Heap", false);
        answer7.put("B-Tree", false);
        answer7.put("Trie", false);
        questions.put("Which data structure has at most two children nodes for each parent node?", answer7);

        HashMap<String, Boolean> answer8 = new HashMap<>();
        answer8.put("Hash Table", true);
        answer8.put("Binary Search Tree", false);
        answer8.put("Trie", false);
        answer8.put("Heap", false);
        questions.put("Which data structure is based on key-value pairs and provides constant time average case for insertion, deletion, and lookup operations?", answer8);

        HashMap<String, Boolean> answer9 = new HashMap<>();
        answer9.put("Graph", true);
        answer9.put("Queue", false);
        answer9.put("Stack", false);
        answer9.put("Array", false);
        questions.put("Which data structure consists of a finite set of vertices (nodes) and a set of edges connecting these vertices?", answer9);

        HashMap<String, Boolean> answer10 = new HashMap<>();
        answer10.put("Stack", true);
        answer10.put("Queue", false);
        answer10.put("Array", false);
        answer10.put("Linked List", false);
        questions.put("Which data structure follows Last In First Out (LIFO) principle?", answer10);

        return questions;
    }

    public static Map<String,Map<String,Boolean>> getGeographyQuestions(){
        HashMap<String, Map<String, Boolean>> questions = new HashMap<>();

        HashMap<String, Boolean> answer11 = new HashMap<>();
        answer11.put("Heap", true);
        answer11.put("Binary Search Tree", false);
        answer11.put("Trie", false);
        answer11.put("Linked List", false);
        questions.put("Which data structure is often used to implement priority queues?", answer11);

        HashMap<String, Boolean> answer12 = new HashMap<>();
        answer12.put("Graph", true);
        answer12.put("Array", false);
        answer12.put("Linked List", false);
        answer12.put("Tree", false);
        questions.put("Which data structure represents a set of connections between nodes?", answer12);

        HashMap<String, Boolean> answer13 = new HashMap<>();
        answer13.put("Hash Map", true);
        answer13.put("Array", false);
        answer13.put("Linked List", false);
        answer13.put("Stack", false);
        questions.put("Which data structure offers constant time average case for key-value pair operations?", answer13);

        HashMap<String, Boolean> answer14 = new HashMap<>();
        answer14.put("Queue", true);
        answer14.put("Stack", false);
        answer14.put("Tree", false);
        answer14.put("Heap", false);
        questions.put("Which data structure follows the First In First Out (FIFO) principle?", answer14);

        HashMap<String, Boolean> answer15 = new HashMap<>();
        answer15.put("Binary Tree", true);
        answer15.put("Graph", false);
        answer15.put("Array", false);
        answer15.put("Hash Table", false);
        questions.put("Which data structure consists of nodes having at most two children?", answer15);

        HashMap<String, Boolean> answer16 = new HashMap<>();
        answer16.put("Binary Search Tree", true);
        answer16.put("Heap", false);
        answer16.put("Linked List", false);
        answer16.put("Queue", false);
        questions.put("Which data structure is organized in a hierarchical manner and supports efficient searching?", answer16);

        HashMap<String, Boolean> answer17 = new HashMap<>();
        answer17.put("Trie", true);
        answer17.put("Array", false);
        answer17.put("Heap", false);
        answer17.put("Queue", false);
        questions.put("Which data structure is often used for dictionary implementations?", answer17);

        HashMap<String, Boolean> answer18 = new HashMap<>();
        answer18.put("Linked List", true);
        answer18.put("Array", false);
        answer18.put("Queue", false);
        answer18.put("Graph", false);
        questions.put("Which data structure is optimal for implementing stacks and queues?", answer18);

        HashMap<String, Boolean> answer19 = new HashMap<>();
        answer19.put("Stack", true);
        answer19.put("Queue", false);
        answer19.put("Tree", false);
        answer19.put("Hash Table", false);
        questions.put("Which data structure supports Last In First Out (LIFO) operations?", answer19);

        HashMap<String, Boolean> answer20 = new HashMap<>();
        answer20.put("B-Tree", true);
        answer20.put("Binary Tree", false);
        answer20.put("Heap", false);
        answer20.put("Graph", false);
        questions.put("Which data structure is commonly used for file systems and databases?", answer20);

        HashMap<String, Boolean> answer21 = new HashMap<>();
        answer21.put("Graph", true);
        answer21.put("Tree", false);
        answer21.put("Heap", false);
        answer21.put("Array", false);
        questions.put("Which data structure represents a network of interconnected nodes?", answer21);

        HashMap<String, Boolean> answer22 = new HashMap<>();
        answer22.put("Hash Table", true);
        answer22.put("Binary Search Tree", false);
        answer22.put("Heap", false);
        answer22.put("Graph", false);
        questions.put("Which data structure is used for fast retrieval of data based on keys?", answer22);

        HashMap<String, Boolean> answer23 = new HashMap<>();
        answer23.put("Array", true);
        answer23.put("Linked List", false);
        answer23.put("Queue", false);
        answer23.put("Graph", false);
        questions.put("Which data structure stores elements in contiguous memory locations?", answer23);

        HashMap<String, Boolean> answer24 = new HashMap<>();
        answer24.put("Binary Search Tree", true);
        answer24.put("Linked List", false);
        answer24.put("Hash Table", false);
        answer24.put("Stack", false);
        questions.put("Which data structure is used for efficient searching, insertion, and deletion operations?", answer24);

        HashMap<String, Boolean> answer25 = new HashMap<>();
        answer25.put("Queue", true);
        answer25.put("Stack", false);
        answer25.put("Linked List", false);
        answer25.put("Tree", false);
        questions.put("Which data structure follows the First In First Out (FIFO) principle?", answer25);

        return questions;
    }

    public static Map<String,Map<String,Boolean>> getRandomLiteratureAndGeographyQuestions(Context context, String subject, int SIZE){
        Map<String,Map<String,Boolean>> questionsMap = new HashMap<>();
        Map<String, Map<String, Boolean>> originalQuestion;
        if (subject.equals(context.getString(R.string.beginner))){
            originalQuestion = getGeographyQuestions();
        }else{
            originalQuestion = getLiteratureQuestions();
        }

        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }

}