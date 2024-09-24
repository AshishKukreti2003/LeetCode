/**
 * @param {string} s
 * @return {string}
 */
var sortSentence = function(s) {
    let words = s.split(" ");
    let result = new Array(words.length).fill(0);
    for(let word of words){
        let index = word.substring(word.length-1) - '0';
        result[index-1] = word.substring(0,word.length-1);
    }
    return result.join(" ");
};