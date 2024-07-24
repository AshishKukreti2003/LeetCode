/**
 * @param {string[]} word1
 * @param {string[]} word2
 * @return {boolean}
 */
var arrayStringsAreEqual = function(word1, word2) {
    let ans1 = word1.join("");
    let ans2 = word2.join("");
    return ans1 === ans2;
};