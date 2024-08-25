/**
 * @param {number} celsius
 * @return {number[]}
 */
var convertTemperature = function(celsius) {
    let arr = [];
    arr.push(celsius+273.15);
    arr.push((celsius * 1.80)+32.00);
    return arr;
};