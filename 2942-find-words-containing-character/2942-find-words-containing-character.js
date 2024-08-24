/**
 * @param {string[]} words
 * @param {character} x
 * @return {number[]}
 */
var findWordsContaining = function(words, x) {
    let arr = [];
    for(let j =0;j<words.length;j++){
        for(let i = 0;i<words[j].length;i++){
            if(words[j].charAt(i) === x){
                arr.push(j);
                break;
            }
        }
    }
    return arr;
};