/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function(word1, word2) {
    let str = "";
    let i = 0,j=0;
    while(i<word1.length && j<word2.length){
        str+=word1.charAt(i);
        str+=word2.charAt(j);
        i++;
        j++;
    }
    while(i<word1.length){
        str+=word1.charAt(i);
        i++;
    }
    while(j<word2.length){
        str+=word2.charAt(j);
        j++;
    }
    return str;
};