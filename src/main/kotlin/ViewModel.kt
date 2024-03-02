class ViewModel(private val analyticsClient: AnalyticsClient) {
    fun submitClicked() {
        analyticsClient.track("submit clicked")
    }
}