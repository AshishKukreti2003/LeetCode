/**
 * @param {string[]} sentences
 * @return {number}
 */
var mostWordsFound = function(sentences) {
    let max = 0;
    for(let i = 0;i<sentences.length;i++){
        let count = 1;
        for(let j = 0;j<sentences[i].length;j++){
            if(sentences[i].charAt(j) == ' '){
                count++;
            }
        }
        max = Math.max(max,count);
    }
    return max;
};