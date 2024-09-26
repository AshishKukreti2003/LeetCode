/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
    if(haystack.includes(needle)){
        let i=0;
        while(i<haystack.length){
            if(haystack.substring(i,i+needle.length) === needle){
                return i;
            }
            i++;
        }
    }
    return -1;
};