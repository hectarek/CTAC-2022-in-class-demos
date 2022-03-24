// In class RPS Demo

const hands = ['rock' , 'paper', 'scissors'];

let getHands = () => {
    return hands[parseInt(Math.random()*10)%3];
}

let play1 = {
    name: 'Hector',
    getHands: getHands
}

let play2 = {
    name: 'Tahirah',
    getHands: getHands,
}


let play3 = {
    name: 'Drew',
    getHands: getHands,
}


let play4 = {
    name: 'David',
    getHands: getHands,
}

const winConditions = {
    rock: 'scissors',
    paper: 'rock',
    scissors: 'paper'
}

let playRound = (p1, p2) => {

    let p1Hand = p1.getHands();
    let p2Hand = p2.getHands();

    console.log(p1.name, 'threw', p1Hand);
    console.log(p2.name, 'threw', p2Hand);

    if (p1Hand === p2Hand) {
        // tie
        console.log("it's a tie");
        return null;
    } else if (winConditions[p1Hand] === p2Hand) {
        // p1 wins or p2 loses
        console.log(p1.name, 'wins!');
        return p1;
    } else {
        // p2 wins or p1 loses
        console.log(p2.name, 'wins!');
        return p2;
    }
}

let playGame = (player1, player2, playUntil) => {
    
    let player1Wins = 0;
    let player2Wins = 0;

    while (player1Wins < playUntil && player2Wins < playUntil) {
        console.log('Current Score: ', player1.name, ':' ,player1Wins)
        console.log('Current Score: ', player2.name, ':' ,player2Wins)
        if (!playRound(player1, player2)) {

        } else if (playRound(player1, player2) === player1) {
            player1Wins++;
        } else {
            player2Wins++;
        }
    }  

    if (player1Wins === playUntil) {
        return player1;
    } else {
        return player2;
    }
}

let playTournament = (p1,p2,p3,p4,playUntil) => {
    let winnerRound1 = playGame(p1,p3,playUntil);
    let winnerRound2 = playGame(p2,p4,playUntil);
    let tournamentWinner = playGame(winnerRound1, winnerRound2, playUntil).name;
    let winningStatement = tournamentWinner + ' is the world champion';

    return winningStatement
}

console.log(playTournament(play1, play2, play3, play4, 9));