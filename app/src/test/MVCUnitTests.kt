import org.junit.Assert.*
import org.junit.Test
class MVCUnitTests {
    @Test
    fun testNextQuestion() {
        val controller = QuestionController()
        val Question = controller.getCurrentQuestion()
        controller.nextQuestion()
        val nextQuestion = controller.getCurrentQuestion()
        assertNotEquals(Question, nextQuestion, "The next question should be different from the initial one.")
    }
    @Test
    fun testDisplaysQuestionCorrectly() {
        val model = QuestionModel()
        val question = model.getCurrentQuestion()
        val view = QuestionView()
        view.displayQuestion(question)
        assertEquals(question.text, view.displayedText, "The view should display the text of the current question.")
    }
    @Test
    fun testModelUpdatesCorrectly() {
        val model = QuestionModel()
        val initialIndex = model.getCurrentQuestionIndex()
        model.nextQuestion()
        val newIndex = model.getCurrentQuestionIndex()
        assertTrue(newIndex > initialIndex, "The model should update to the next question index.")
    }

}
