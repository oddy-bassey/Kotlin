import org.junit.Test
import org.mockito.Mockito
import org.mockito.ArgumentMatchers.anyString

class ViewModelTest {

    @Test
    fun `trackEvent() is called when submitClick is called`() {
        val analytics = Mockito.mock(AnalyticsClient::class.java)
        val viewModel = ViewModel(analytics)

        viewModel.submitClicked()

        Mockito.verify(analytics).track(anyString())
    }
}