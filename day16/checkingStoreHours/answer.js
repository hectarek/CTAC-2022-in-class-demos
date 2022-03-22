// Answer for Checking Store Hours Assignment day 16

let isWeekend = false;
let isHoliday = false;
let currentTime = 9;

if (isHoliday || isWeekend) {
    console.log('The store is closed');
} else {
    if (currentTime > 8 && currentTime < 20) {
        console.log('The store is open for business');
    } else {
        console.log('The store is closed');
    }
}