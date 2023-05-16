class ReplaceWord {
    String sentence;
    public ReplaceWord(){
        sentence = "Blue bottle is in Blue bag lying on Blue carpet ";
    }
    void display(){
        int count = 0;
        String str ="";
        String replString = "";
        for (int i = 0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                if (sentence.substring(i-count, i).equals("Blue"))
                    replString+="Red";
                else
                    replString+=sentence.substring(i-count, i);
            count = 0;
            replString+=" ";
            }
            else    
                count++;
            
        }
        System.out.println(replString);
    }
    public static void main(String[] args) {
        ReplaceWord repWord = new ReplaceWord();
        repWord.display();;
    }
}
