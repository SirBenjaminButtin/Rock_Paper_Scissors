let playerWins = 0;
let computerWins = 0;
  function getComputerChoice() {
  let choices = ["rock", "paper", "scissors"];
  let randomChoice = Math.floor(Math.random() * choices.length);
  return choices[randomChoice];
}

function playRound(playerSelection, computerSelection) {
  if (playerSelection === computerSelection) {
      return "It's a tie!";
  } else if (
      (playerSelection === "rock" && computerSelection === "scissors") ||
      (playerSelection === "paper" && computerSelection === "rock") ||
      (playerSelection === "scissors" && computerSelection === "paper")
  ) {
      playerWins++;
    return "Computer selected " + computerSelection + ". You win!";
  } else {
      computerWins++;
    return "Computer selected " + computerSelection + ". You lose!";
  }
}
const prompt = require("prompt-sync")();
function game() {
  

  for (let i = 0; i < 5; i++) {
    const playerSelection = prompt("Enter rock, paper, or scissors").toLowerCase();
      const computerSelection = getComputerChoice();
      const roundWinner = playRound(playerSelection, computerSelection);

      console.log(roundWinner);
  }

  if (playerWins > computerWins) {
      console.log("Game Over! You Win!");
  } else if (playerWins < computerWins) {
      console.log("Game Over! You Lose!");
  } else {
      console.log("It's a tie!");
  }
}

game()