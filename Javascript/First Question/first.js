// First Question -->

function reverseWords(sentence){
    let reverseWords = '';
    let reversedSentence = '';
    let space = " "
    
    for(let i=0; i<sentence.length; i++){
        if(sentence[i] != ' '){
            reverseWords = sentence[i]  + reverseWords;
        }else{
            reversedSentence+= reverseWords + space;
            reverseWords = '';
        }
    }
    reversedSentence+= reverseWords;
    return reversedSentence;
}


const inputSentence = "This is a sunny day";
const reversed = reverseWords(inputSentence);
console.log(reversed);