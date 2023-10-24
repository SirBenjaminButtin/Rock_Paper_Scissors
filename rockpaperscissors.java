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
      return "Computer selected " + computerSelection + ". You win!";
  } else {
      return "Computer selected " + computerSelection + ". You lose!";
  }
}

function game() {
  let playerWins = 0;
  let computerWins = 0;

  for (let i = 0; i < 5; i++) {
      const playerSelection = prompt("Enter rock, paper, or scissors").toLowerCase();
      const computerSelection = getComputerChoice();
      const roundWinner = playRound(playerSelection, computerSelection);

      if (roundWinner.includes("You win!")) {
          playerWins++;
      } else if (roundWinner.includes("You lose!")) {
          computerWins++;
      }

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