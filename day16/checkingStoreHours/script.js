// Day 16 Checking Store Hours

let isWeekend = false;
let isHoliday = false;
let currentTime = 21;

if (isWeekend || isHoliday) {
    console.log("The store is closed");
} else {
    if (currentTime > 8 && currentTime < 18) {
        console.log("The store is open for business");
    } else {
        console.log("The store is closed");
    }
}