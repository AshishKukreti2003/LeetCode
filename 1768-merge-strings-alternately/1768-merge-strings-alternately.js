/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function(word1, word2) {
    let str = "";
    let i = 0;
    while(i<word1.length || i<word2.length){
        if(i<word1.length){
            str+=word1.charAt(i);
        }
        if(i<word2.length){
            str+=word2.charAt(i);
        }
        i++;
    }
    return str;
};