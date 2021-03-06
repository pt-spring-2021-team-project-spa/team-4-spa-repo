export default function Quiz() {
    return `
    <center><h1 class="quiz-name">KIDet Quiz</h1></center>
    <div class="planets_quiz">
    
    <div class="question-container-one">
    <h3 class="question">Question 1: Which planet is known as "The Blue Planet?"</h3>
    <input type="radio" name="question1">Earth<br>
    <input type="radio" name="question1" >Jupiter<br>
    <input type="radio" name="question1" id="correct1">Neptune<br>
    <input type="radio" name="question1" >Saturn<br>
    </div>

    <div class="question-container-two">
    <h3 class="question">Question 2: Which planet is over 318 times larger than Earth?</h3>
    <input type="radio" name="question2" >Mercury<br>
    <input type="radio" name="question2" id="correct2">Jupiter<br>
    <input type="radio" name="question2" >Venus<br>
    <input type="radio" name="question2">Mars<br>
    </div>

    <div class="question-container-three">
    <h3 class="question">Question 3: Which is the only planet not named after a Roman or Greek deity?</h3>
    <input type="radio" name="question3" >Uranus<br>
    <input type="radio" name="question3">Mars<br>
    <input type="radio" name="question3" >Venus<br>
    <input type="radio" name="question3"id="correct3">Earth<br>
    </div>

    <div class="question-container-one">
    <h3 class="question">Question 4: Which two planets were discovered not by the naked eye but by telescope??</h3>
    <input type="radio" name="question4" >Mercury & Venus<br>
    <input type="radio" name="question4" id="correct4">Uranus & Neptune<br>
    <input type="radio" name="question4" >Earth & Mars<br>
    <input type="radio" name="question4" >Jupiter & Saturn<br>
    </div>

    <div class="question-container-two">
    <h3 class="question">Question 5: Which Planet is named after Roman god of shopkeepers, merchants, travelers, transporters of goods, thieves, and tricksters?</h3>
    <input type="radio" name="question5" id="correct5">Mercury<br>
    <input type="radio" name="question5" >Saturn<br>
    <input type="radio" name="question5" >Venus<br>
    <input type="radio" name="question5" >Neptune<br>
    </div>

    </div>
    <br>
    <div class="submit_quiz">
    <input class="submit_Btn" type="submit" name="submit" value="Submit Quiz" id="result">
    <h1 class="number_right" id="number_correct"></h1>
    </div>
    
    `;
}