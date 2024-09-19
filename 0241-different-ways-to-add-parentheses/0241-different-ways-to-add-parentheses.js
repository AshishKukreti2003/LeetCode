/**
 * @param {string} expression
 * @return {number[]}
 */
var diffWaysToCompute = function(expression) {
    let arr = [];
    for(let i=0;i<expression.length;i++){
        let oper = expression.charAt(i);
        if(oper === '+' || oper === '-' || oper === '*'){
            let s1 = diffWaysToCompute(expression.substring(0,i));
            let s2 = diffWaysToCompute(expression.substring(i+1));
            for(let a of s1){
                for(let b of s2){
                    if(oper === '+'){
                        arr.push(a+b);
                    }else if(oper === '-'){
                        arr.push(a-b);
                    }else if(oper === '*'){
                        arr.push(a*b);
                    }
                }
            }
        }
    }
    if(arr.length === 0){
        arr.push(parseInt(expression));
    }
    return arr;
};