/**
 * @param {string} allowed
 * @param {string[]} words
 * @return {number}
 */
var countConsistentStrings = function(allowed, words) {
    let count = 0;
    for(let word of words){
        let isTrue = true;
        for(let ch of word){
            let found = false;
            for(let c of allowed){
                if(ch === c){
                    found = true;
                    break;
                }
            }
            if(!found){
                isTrue = false;
                break;
            }
        }
        if(isTrue){
            count++;
        }
    }
    return count;
};