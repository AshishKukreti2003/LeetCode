/**
 * @param {string} s
 * @return {string}
 */
var freqAlphabets = function(s) {
    let str = "";
    for(let i=s.length-1;i>=0;i--){
        let number;
        if(s.charAt(i) === '#'){
            number = (+s.charAt(i-2) * 10) + (+s.charAt(i-1));
            i-=2;
        }else{
            number = +s.charAt(i);
        }
        str += String.fromCharCode(number + 96);
    }
    return str.split('').reverse().join('');
};