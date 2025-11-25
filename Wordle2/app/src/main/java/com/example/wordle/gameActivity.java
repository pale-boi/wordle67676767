package com.example.wordle;

import android.os.Bundle;
import android.text.InputFilter;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class gameActivity extends AppCompatActivity {

    EditText[][] boxes = new EditText[6][5];
    String[] words = {"their", "would", "about", "there", "think", "which", "could", "other", "these", "first", "thing", "those", "woman", "child", "there", "after", "world", "still", "state", "three", "never", "leave", "while", "group", "great", "begin", "start", "where", "every", "might", "about", "again", "right", "place", "where", "small", "night", "today", "point", "large", "bring", "study", "water", "money", "under", "story", "right", "month", "write", "young", "issue", "black", "house", "after", "power", "since", "stand", "until", "often", "among", "white", "later", "right", "watch", "learn", "least", "level", "speak", "allow", "spend", "party", "maybe", "early", "force", "offer", "music", "human", "serve", "build", "sense", "death", "local", "reach", "class", "voice", "thank", "major", "light", "field", "raise", "along", "heart", "price", "whole", "model", "value", "drive", "carry", "break", "agree", "early", "event", "space", "paper", "table", "whose", "court", "teach", "image", "phone", "quite", "cover", "movie", "piece", "clear", "catch", "north", "third", "cause", "plant", "point", "floor", "place", "close", "south", "short", "sport", "wrong", "board", "throw", "focus", "color", "fight", "sound", "order", "blood", "store", "enter", "other", "stock", "share", "shoot", "occur", "seven", "media", "happy", "scene", "argue", "eight", "ready", "skill", "staff", "trade", "glass", "laugh", "guess", "crime", "state", "stage", "check", "since", "sound", "shake", "truth", "force", "study", "legal", "green", "trial", "prove", "claim", "above", "enjoy", "final", "close", "chair", "radio", "visit", "avoid", "close", "apply", "peace", "smile", "range", "style", "coach", "adult", "break", "treat", "worry", "mouth", "stuff", "ahead", "hotel", "dream", "tough", "owner", "exist", "score", "stare", "heavy", "cause", "total", "agent", "civil", "front", "troop", "fresh", "judge", "video", "admit", "alone", "sleep", "basic", "touch", "labor", "scale", "refer", "sorry", "plane", "track", "press", "brain", "stone", "along", "dozen", "stick", "sales", "front", "drink", "truck", "terms", "horse", "share", "crowd", "shape", "basis", "guard", "pound", "light", "while", "guest", "title", "quick", "limit", "river", "count", "block", "marry", "faith", "smile", "claim", "order", "voter", "youth", "speed", "worth", "cross", "broad", "grade", "until", "moral", "focus", "below", "quiet", "dress", "chief", "twice", "drive", "aware", "photo", "Iraqi", "daily", "visit", "actor", "fully", "press", "plate", "abuse", "birth", "front", "climb", "clean", "sugar", "alive", "start", "paint", "extra", "train", "urban", "above", "sweet", "empty", "metal", "lunch", "fight", "alone", "trail", "adopt", "sight", "works", "enemy", "storm", "panel", "chest", "theme", "fruit", "novel", "union", "cover", "prime", "human", "thick", "trend", "dance", "train", "limit", "being", "ought", "under", "shirt", "angry", "dress", "earth", "shift", "brown", "sheet", "guide", "topic", "truly", "tooth", "chief", "funny", "score", "crazy", "judge", "steal", "pilot", "range", "frame", "equal", "blame", "chain", "forth", "solve", "trust", "ocean", "nurse", "smart", "issue", "cloud", "waste", "aside", "clear", "stand", "clean", "check", "rural", "grant", "tired", "doubt", "beach", "cream", "black", "cheap", "below", "route", "wheel", "cable", "dance", "drink", "fewer", "upper", "grass", "noise", "sleep", "apart", "proud", "match", "solid", "taste", "sharp", "first", "shout", "lower", "knock", "asset", "slide", "green", "honor", "bread", "offer", "hello", "lucky", "reply", "layer", "phase", "shall", "steel", "error", "coach", "sauce", "album", "knife", "cycle", "brief", "later", "grand", "print", "whole", "joint", "quote", "juice", "elect", "smell", "trust", "shift", "touch", "Asian", "light", "entry", "trade", "maker", "total", "shock", "round", "habit", "smoke", "swing", "still", "usual", "anger", "other", "watch", "tower", "mayor", "shape", "essay", "onion", "block", "fiber", "inner", "plant", "coast", "smoke", "cheek", "arise", "favor", "fifth", "brand", "weigh", "count", "armed", "giant", "shell", "depth", "dream", "award", "false", "index", "draft", "paint", "yield", "stake", "super", "pause", "label", "sweep", "taste", "clock", "drama", "fence", "found", "rough", "minor", "elite", "house", "bunch", "apple", "stair", "ahead", "smell", "solar", "virus", "salad", "imply", "match", "blind", "react", "slave", "chart", "white", "stick", "track", "prior", "bench", "honor", "tight", "ideal", "craft", "strip", "lover", "newly", "loose", "crash", "worth", "relax", "fault", "dirty", "pride", "alter", "honey", "adapt", "buyer", "porch", "vital", "tribe", "proof", "round", "shelf", "shrug", "shade", "given", "split", "guide", "fifty", "ratio", "angle", "store", "rapid", "blade", "doubt", "since", "crack", "mount", "meter", "glove", "rifle", "scope", "lemon", "trick", "trace", "yours", "float", "motor", "waste", "cabin", "nerve", "naked", "delay", "flesh", "brush", "flame", "sense", "humor", "badly", "eager", "pitch", "ghost", "grain", "print", "mouse", "wound", "grant", "uncle", "slice", "crack", "awful", "swing", "couch", "shore", "swear", "patch", "seize", "flour", "crash", "brick", "medal", "shine", "chase", "tight", "piano", "final", "grave", "jeans", "brush", "flash", "hurry", "logic", "exact", "candy", "pitch", "organ", "slope", "upset", "elbow", "snake", "magic", "hence", "daily", "favor", "trunk", "curve", "burst", "greet", "favor", "delay", "drift", "cloth", "march", "wrist", "cross", "fraud", "sixth", "array", "skirt", "laugh", "plead", "pause", "drain", "harsh", "sweat", "rumor", "plain", "arena", "flood", "reach", "trait", "towel", "label", "speed", "twist", "boost", "unity", "spill", "belly", "slide", "guilt", "weird", "forty", "stuff", "award", "guard", "thumb", "grace", "alarm", "outer", "crawl", "lobby", "abuse", "await", "click", "rebel", "prize", "juror", "short", "fluid", "rider", "magic", "ankle", "scare", "shame", "opera", "slice", "chaos", "carve", "realm", "blend", "clerk", "donor", "laser", "alien", "pizza", "giant", "civic", "frame", "trail", "wrong", "sword", "input", "value", "angel", "steep", "whale", "strip", "faint", "scary", "silly", "worry", "elder", "ranch", "flash", "prior", "stiff", "toxic", "quest", "queen", "grief", "wagon", "thigh", "buddy", "bonus", "shock", "orbit", "glory", "equip", "tumor", "steam", "waist", "unite", "catch", "grasp", "trace", "spite", "mixed", "shove", "sheep", "skull", "dough", "bless", "alley", "draft", "quote", "sheer", "spoon", "booth", "shark", "purse", "blink", "cliff", "dried", "panic", "stove", "punch", "pasta", "beast", "scent", "fixed", "royal", "robot", "rival", "spray", "pulse", "debut", "crush", "ideal", "upset", "diary", "model", "genre", "frown", "known", "spell", "fever", "stack", "aisle", "cheat", "irony", "trash", "awake", "gross", "fleet", "midst", "alike", "boast", "wheat", "vocal", "sneak", "nasty", "chunk", "cease", "major", "cling", "chill", "merit", "wound", "yield", "risky", "rally", "added", "bride", "steak", "blank", "flood", "beard", "brake", "squad", "valid", "dying", "spare", "blond", "kneel", "color", "light", "steer", "cheer", "enact", "forum", "liver", "level", "plain", "pound", "suite", "grape", "widow", "straw", "drill", "round", "blast", "ridge", "radar", "apart", "arrow", "globe", "charm", "cruel", "swell", "sunny", "spine", "drown", "leave", "crowd", "spark", "loyal", "brave", "dense", "twist", "devil", "weave", "cargo", "naval", "fatal"};
    String word = "";

    int[] currentBox = {0,0};
    int currentRow = 0;
    int currentColumn = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_game);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //ROW 0
        boxes[0][0] = findViewById(R.id.editText_00);
        boxes[0][1] = findViewById(R.id.editText_01);
        boxes[0][2] = findViewById(R.id.editText_02);
        boxes[0][3] = findViewById(R.id.editText_03);
        boxes[0][4] = findViewById(R.id.editText_04);
        //ROW 1
        boxes[1][0] = findViewById(R.id.editText_10);
        boxes[1][1] = findViewById(R.id.editText_11);
        boxes[1][2] = findViewById(R.id.editText_12);
        boxes[1][3] = findViewById(R.id.editText_13);
        boxes[1][4] = findViewById(R.id.editText_14);
        //ROW 2
        boxes[2][0] = findViewById(R.id.editText_20);
        boxes[2][1] = findViewById(R.id.editText_21);
        boxes[2][2] = findViewById(R.id.editText_22);
        boxes[2][3] = findViewById(R.id.editText_23);
        boxes[2][4] = findViewById(R.id.editText_24);
        //ROW 3
        boxes[3][0] = findViewById(R.id.editText_30);
        boxes[3][1] = findViewById(R.id.editText_31);
        boxes[3][2] = findViewById(R.id.editText_32);
        boxes[3][3] = findViewById(R.id.editText_33);
        boxes[3][4] = findViewById(R.id.editText_34);
        //ROW 4
        boxes[4][0] = findViewById(R.id.editText_40);
        boxes[4][1] = findViewById(R.id.editText_41);
        boxes[4][2] = findViewById(R.id.editText_42);
        boxes[4][3] = findViewById(R.id.editText_43);
        boxes[4][4] = findViewById(R.id.editText_44);
        //ROW 5
        boxes[5][0] = findViewById(R.id.editText_50);
        boxes[5][1] = findViewById(R.id.editText_51);
        boxes[5][2] = findViewById(R.id.editText_52);
        boxes[5][3] = findViewById(R.id.editText_53);
        boxes[5][4] = findViewById(R.id.editText_54);

        newGame();
        for (int row = 0; row < boxes.length; row++) {
            for (int column = 0; column < boxes[0].length; column++) {
                advanceCursorListener(row, column);
                boxes[row][column].setFilters(new InputFilter[]{
                    new InputFilter.AllCaps()
            });
            boxes[row][column].setText("");
            }
        }


    }


    private void newGame() {
        for (int row = 0; row < 6; row++) {
            for (int colum = 0; colum < 5; colum++) {
                boxes[row][colum].setText("");
            }
        }
        boxes[0][0].requestFocus();
        Random rNumber = new Random();
        word = words[rNumber.nextInt(words.length)];
    }

    private void Guess() {
        String[] Letta = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        if (boxes[currentBox[0]][currentBox[1]].getText().equals("")) {
            boxes[currentBox[0]][currentBox[1]].requestFocus();
        } else {
                for (int c = 0; c < 5; c++) {
                    if (boxes[currentRow][c].equals(word.charAt(c))) {
                        if (currentColumn == 5) {

                        }

                    }
                }
            }
        }
        public void advanceCursorListener(int row, int column) {

        }
        public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
        if (stringBuilder.length() == 1) {

        }
        }
    }
